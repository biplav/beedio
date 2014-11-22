package com.biplav.tweedeo.client.youtube.player.events;

import com.biplav.tweedeo.client.youtube.player.YouTubeVideoQuality;
import com.google.web.bindery.event.shared.Event;

public class YouTubePlaybackQualityChangedEvent extends Event<IYoutubePlayerEventHandler> {
	
	private YouTubeVideoQuality quality;

	public YouTubePlaybackQualityChangedEvent(YouTubeVideoQuality quality) {
		this.quality = quality;
	}

	@Override
	public final Type<IYoutubePlayerEventHandler> getAssociatedType() {
		return YoutubePlayerEventHandler.TYPE;
	}

	public YouTubeVideoQuality getQuality() {
		return quality;
	}

	@Override
	protected void dispatch(IYoutubePlayerEventHandler handler) {
		handler.onPlaybackQualityChanged(this);
	}
}