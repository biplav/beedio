package com.biplav.tweedeo.client.youtube.player.events;


import com.biplav.tweedeo.client.youtube.api.YoutubeApiEvent;
import com.google.gwt.event.shared.EventHandler;

public interface IYoutubePlayerEventHandler extends EventHandler {
	void onYoutubeApiEvent(YoutubeApiEvent youTubeApiEvent);
	void onStateChanged(YouTubeStateChangedEvent youTubeStateChangedEvent);
	void onPlaybackQualityChanged(
			YouTubePlaybackQualityChangedEvent youTubePlaybackQualityChangedEvent);
	void onError(YouTubeErrorEvent youTubeErrorEvent);
	void onPlayerReady(YoutubePlayerReadyEvent youtubePlayerReady);
	void onNewVideo(YoutubeNewVideoEvent youtubeNewVideoEvent);

}
