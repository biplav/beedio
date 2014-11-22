package com.biplav.tweedeo.client.youtube.api;

import com.biplav.tweedeo.client.youtube.player.events.IYoutubePlayerEventHandler;
import com.biplav.tweedeo.client.youtube.player.events.YoutubePlayerEventHandler;
import com.google.web.bindery.event.shared.Event;

public class YoutubeApiEvent extends Event<IYoutubePlayerEventHandler> {
	
	@Override
	public Type<IYoutubePlayerEventHandler> getAssociatedType() {
		return YoutubePlayerEventHandler.TYPE;
	}

	@Override
	protected void dispatch(IYoutubePlayerEventHandler handler) {
		handler.onYoutubeApiEvent(this);
	}

}
