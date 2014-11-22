package com.biplav.tweedeo.client.youtube.player.events;

import com.biplav.tweedeo.client.youtube.player.YouTubeError;
import com.google.web.bindery.event.shared.Event;

public class YouTubeErrorEvent extends Event<IYoutubePlayerEventHandler> {

	private YouTubeError error;

	public YouTubeErrorEvent(YouTubeError error) {
		this.error = error;
	}

	@Override
	public final Type<IYoutubePlayerEventHandler> getAssociatedType() {
		return YoutubePlayerEventHandler.TYPE;
	}
	
	public YouTubeError getError() {
		return error;
	}

	@Override
	protected void dispatch(IYoutubePlayerEventHandler handler) {
		handler.onError(this);
	}
}