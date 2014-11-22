package com.biplav.tweedeo.client.youtube.player.events;

import com.biplav.tweedeo.client.EPG.EPGConfig;
import com.biplav.tweedeo.client.EPG.EPGManager;
import com.biplav.tweedeo.client.EPG.events.VideoEndedEvent;
import com.biplav.tweedeo.client.EPG.events.YoutubePlayerLoadedEvent;
import com.biplav.tweedeo.client.youtube.api.YoutubeApiEvent;
import com.biplav.tweedeo.client.youtube.player.YouTubePlayer;
import com.biplav.tweedeo.client.youtube.player.YouTubeVideoQuality;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Logger;
import com.biplav.tweedeo.utils.UrlParser;
import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.Event.Type;

public class YoutubePlayerEventHandler implements IYoutubePlayerEventHandler {

	public static YouTubePlayer player;
	public static boolean isPlayerReady = false;

	public static final Type<IYoutubePlayerEventHandler> TYPE = new Type<IYoutubePlayerEventHandler>();

	public void onYoutubeApiEvent(YoutubeApiEvent youTubeApiEvent) {
		System.out
				.println("YoutubePlayerEventHandler.onYoutubeApiEvent() recieved");
		String width = EPGConfig.playerWidth;
		String height = EPGConfig.playerHeight;
		Logger.log("YoutubePlayerEventHandler.onYoutubeApiEvent() " + width
				+ " " + height);
		initPlayer(width, height);

	}

	private void initPlayer(String width, String height) {
		String videoId = UrlParser.getYoutubeVideoId(EPGManager.currentVideo.getUrl());
		player = new YouTubePlayer(videoId, "vid", width, height);
		
	}

	public void onPlaybackQualityChanged(
			YouTubePlaybackQualityChangedEvent youTubePlaybackQualityChangedEvent) {
		System.out
				.println("YoutubePlayerEventHandler.onPlaybackQualityChanged()");
	}

	/**
	 * This event is fired whenever the player's state changes. Possible values
	 * are unstarted (-1), ended (0), playing (1), paused (2), buffering (3),
	 * video cued (5). When the SWF is first loaded it will broadcast an
	 * unstarted (-1) event. When the video is cued and ready to play it will
	 * broadcast a video cued event (5).
	 */

	public void onStateChanged(YouTubeStateChangedEvent youTubeStateChangedEvent) {
		Logger.log("YoutubePlayerEventHandler.onStateChanged()" + youTubeStateChangedEvent.getState());
		switch (youTubeStateChangedEvent.getState()) {
		case UNSTARTED:
			break;
		case ENDED:
			StateMachine.eventBus.fireEvent(new VideoEndedEvent());
			break;
		case PLAYING:
			break;
		case PAUSED:
			break;
		case BUFFERING:
			//TODO: Make EPGManager Smart enough to adjust quality.
			Logger.log("YoutubePlayerEventHandler.onStateChanged() Moving qualoty down!");
			player.setPlaybackQuality(YouTubeVideoQuality.SMALL.toString());
			break;
		case CUED:
			Logger.log("YoutubePlayerEventHandler.onStateChanged() video cued");
			break;
		default:
			break;
		};
		

	}

	public void onError(YouTubeErrorEvent youTubeErrorEvent) {
		Logger.log("YoutubePlayerEventHandler.onError()");
		StateMachine.eventBus.fireEvent(new VideoEndedEvent());
	}

	public void onPlayerReady(YoutubePlayerReadyEvent youtubePlayerReady) {
		isPlayerReady = true;
		//BrowserHacks.fixMask(""+(EPGConfig.areaHeight-60), EPGConfig.playerHeight);
		//fixMaskByClient(EPGConfig.playerWidth, EPGConfig.playerHeight);
		//BrowserHacks.fixMask(EPGConfig.playerWidth, EPGConfig.playerHeight);
		fixMask(EPGConfig.playerWidth, EPGConfig.playerHeight);
		//fixMask(""+(EPGConfig.areaHeight-60), EPGConfig.playerHeight);
		EPGManager.bottomBar.getFocus();
		StateMachine.eventBus.fireEvent(new YoutubePlayerLoadedEvent());
		//player.playMedia();
	}
	
	public void fixMaskByClient(String width,String height) {
		String userAgent = Window.Navigator.getUserAgent();
		Logger.log("Browser looks like " + userAgent);
		if(userAgent != null && isApple(userAgent)) fixMask(width, "5");
		else fixMask(width, height);
	}

	private boolean isApple(String userAgent) {
		return userAgent.toLowerCase().contains("iphone") || userAgent.toLowerCase().contains("ipad") || userAgent.toLowerCase().contains("ipod");
	}
	
	private final native void fixMask(String width,String height) /*-{
		$wnd.$("#overlay").width(width);
		$wnd.$("#overlay").height(height);
	}-*/; 

	public void onNewVideo(YoutubeNewVideoEvent youtubeNewVideoEvent) {
		if (isPlayerReady)
			player.loadMedia(youtubeNewVideoEvent.getVideo().getUrl());
	}
}
