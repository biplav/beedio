package com.biplav.tweedeo.client.EPG;

import com.biplav.tweedeo.client.EPG.events.ActivateNextEvent;
import com.biplav.tweedeo.client.EPG.events.VideoAddedEvent;
import com.biplav.tweedeo.client.EPG.events.VideoEndedEvent;
import com.biplav.tweedeo.client.EPG.events.VideoPausePlayEvent;
import com.biplav.tweedeo.client.EPG.events.VideoReloadEvent;
import com.biplav.tweedeo.client.EPG.events.VideoShareEvent;
import com.biplav.tweedeo.client.EPG.events.VideoSkippedEvent;
import com.biplav.tweedeo.client.EPG.events.YoutubePlayerLoadedEvent;
import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.client.youtube.player.events.YoutubeNewVideoEvent;
import com.biplav.tweedeo.client.youtube.player.events.YoutubePlayerEventHandler;
import com.biplav.tweedeo.facebook.core.FBCore;
import com.biplav.tweedeo.facebook.event.FBActivityUpdateEvent;
import com.biplav.tweedeo.facebook.event.FBVideoShareEvent;
import com.biplav.tweedeo.playerscreen.BottomBar;
import com.biplav.tweedeo.playerscreen.FaviconManager;
import com.biplav.tweedeo.playerscreen.PauseScreen;
import com.biplav.tweedeo.playerscreen.TitleManager;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.Event.Type;

public class EPGEventHandler implements IEPGEventHandler {
	
	

	private static final int SKIPPED_DISLIKED = 50;
	private static final int WATCHED_AND_SKIPPED_LIMIT = 5;

	public EPGEventHandler() {
		super();
		if(facebookPlayList.getSize() > 0) {
			onVideoAddedEvent(new VideoAddedEvent(facebookPlayList.getSize()));
			onActivateNextEvent(new ActivateNextEvent());
		}
	}

	public static final Type<IEPGEventHandler> TYPE = new Type<IEPGEventHandler>();
	private PlayListManager facebookPlayList = EPGManager.facebookPlayList;
	private BottomBar bottomBar = EPGManager.bottomBar;
	private boolean isPaused = false;
	private Timer refreshTimer;
	private IVideo video;

	public void onNewVideo(YoutubeNewVideoEvent youtubeNewVideoEvent) {
		facebookPlayList.addToPlayList(youtubeNewVideoEvent.getVideo());
	}

	public void onVideoEnded(VideoEndedEvent videoEndedEvent) {
		Logger.log("EPGEventHandler.onVideoEnded() Video Liked!");
		facebookPlayList.updateVideoStatus(video, IVideo.WATCHED);
		fireUpdateActivity();
		loadNextVideo();
	}

	private void loadNextVideo() {
		video = facebookPlayList.getVideo();
		bottomBar.populateData(video.getPost());
		YoutubePlayerEventHandler.player.loadMedia(video.getUrl());
		FaviconManager.updateFavicon(video.getPost().getPicture());
		EPGManager.currentVideo = video;
		RootPanel.get("epg").clear();
		PauseScreen pauseScreen = new PauseScreen(EPGManager.currentVideo);
		EPGManager.pauseScreen = pauseScreen;
		RootPanel.get("epg").add(pauseScreen);
		if (isPaused) doPause();
		else doPlay();
	}

	public void onVideoSkippedEvent(VideoSkippedEvent videoSkippedEvent) {
		int percentageOfVideoWatched = YoutubePlayerEventHandler.player.getPercentageOfVideoWatched();
		Logger.log(percentageOfVideoWatched + " Video Watched");
		if(percentageOfVideoWatched > 50) facebookPlayList.updateVideoStatus(video, IVideo.WATCHED);
		else facebookPlayList.updateVideoStatus(video, IVideo.SKIPPED);
		updateScores(percentageOfVideoWatched);
		loadNextVideo();
	}
	
	/*
	 * Taking 5 into consideration as user might have skipped because he have watched 
	 * the video before.
	 */

	private void updateScores(int percentageOfVideoWatched) {
		if(video == null) return;
		if(percentageOfVideoWatched > WATCHED_AND_SKIPPED_LIMIT && percentageOfVideoWatched < SKIPPED_DISLIKED ) {
			String userId = video.getPost().getFrom().getId();
			Logger.log("Bad user" + userId);
			facebookPlayList.updateScore(userId);
		} else if(percentageOfVideoWatched > SKIPPED_DISLIKED) {
			fireUpdateActivity();
		}
	}

	private void fireUpdateActivity() {
		StateMachine.eventBus.fireEvent(new FBActivityUpdateEvent(EPGManager.currentVideo));
	}

	public void onActivateNextEvent(ActivateNextEvent sctivateNextEvent) {
		EPGManager.bottomBar.activateNext();
	}

	public void onVideoAddedEvent(VideoAddedEvent videoAddedEvent) {
		Logger.log("Video added!");
		if (!isPaused)
			TitleManager.updateTitlePlaying(facebookPlayList.getSize());
	}

	public void onVideoPausePlayEvent(VideoPausePlayEvent videoPausePlayEvent) {
		if (isPaused) {
			doPlay();
		} else {
			doPause();
		}
	}

	private void doPause() {
		isPaused = true;
		YoutubePlayerEventHandler.player.pauseMedia();
		bottomBar.usePlay();
		RootPanel.get("epg").setVisible(true);

		int videoLoadedPercentage = YoutubePlayerEventHandler.player
				.getVideoLoadedPercentage();
		refreshTimer = new Timer() {

			@Override
			public void run() {
				int videoLoadedPercentage = YoutubePlayerEventHandler.player
						.getVideoLoadedPercentage();
				EPGManager.pauseScreen
						.updateVideoCueDetails(videoLoadedPercentage);
				if (videoLoadedPercentage < 100) {
					TitleManager.updateTitlePaused(videoLoadedPercentage);
					this.schedule(10000);
				} else {
					TitleManager.updateTitlePaused(100);
				}

			}
		};
		refreshTimer.schedule(10000);
		TitleManager.updateTitlePaused(videoLoadedPercentage);
		int playPosition = YoutubePlayerEventHandler.player.getPlayPosition();
		int mediaDuration = YoutubePlayerEventHandler.player.getMediaDuration();
		try {
			if(EPGManager.pauseScreen != null) {
				EPGManager.pauseScreen.initiateCueDetails(videoLoadedPercentage,playPosition,mediaDuration);
				EPGManager.pauseScreen.updateVideoPositionDetails(
						playPosition,mediaDuration);
			}
		} catch(Throwable e) {
			Logger.exception(e);
		}

	}

	private void doPlay() {
		isPaused = false;
		RootPanel.get("epg").setVisible(false);
		YoutubePlayerEventHandler.player.playMedia();
		bottomBar.usePause();
		if(refreshTimer != null) {
			refreshTimer.cancel();
			refreshTimer = null;
		}
		TitleManager.updateTitlePlaying(facebookPlayList.getSize());
	}

	public void onYoutubePlayerLoadedEvent(
			YoutubePlayerLoadedEvent youtubePlayerLoadedEvent) {
		RootPanel.get("loading").setVisible(false);
	}

	@Override
	public void onVideoShareEvent(VideoShareEvent videoShareEvent) {
		StateMachine.eventBus.fireEvent(new FBVideoShareEvent(EPGManager.currentVideo));
	}

	public void onVideoReloadEvent(VideoReloadEvent videoReloadEvent) {
		YoutubePlayerEventHandler.player.setPlayPosition(1);
		
	}
}
