package com.biplav.tweedeo.client.youtube.player.events;

import com.biplav.tweedeo.client.youtube.player.YouTubeVideoState;
import com.google.web.bindery.event.shared.Event;

public class YouTubeStateChangedEvent extends Event<IYoutubePlayerEventHandler> {
	
	private YouTubeVideoState state;

	public YouTubeStateChangedEvent(YouTubeVideoState state) {
		this.state = state;
	}

	@Override
	public final Type<IYoutubePlayerEventHandler> getAssociatedType() {
		return YoutubePlayerEventHandler.TYPE;
	}

	public YouTubeVideoState getState() {
		return state;
	}
	
	@Override
	protected void dispatch(IYoutubePlayerEventHandler handler) {
		handler.onStateChanged(this);
	}
}