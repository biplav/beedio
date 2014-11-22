package com.biplav.tweedeo.client.youtube.player.events;

import com.google.web.bindery.event.shared.Event;

public class YoutubePlayerReadyEvent extends Event<IYoutubePlayerEventHandler> {
	
	@Override
	public final Type<IYoutubePlayerEventHandler> getAssociatedType() {
		return YoutubePlayerEventHandler.TYPE;
	}
	
	@Override
	protected void dispatch(IYoutubePlayerEventHandler handler) {
		handler.onPlayerReady(this);
	}

}
