package com.biplav.tweedeo.client.youtube.player.events;

import com.biplav.tweedeo.client.EPG.EPGEventHandler;
import com.biplav.tweedeo.client.EPG.IEPGEventHandler;
import com.biplav.tweedeo.client.video.YoutubeVideo;
import com.google.web.bindery.event.shared.Event;

public class YoutubeNewVideoEvent extends Event<IEPGEventHandler> {
	
	private YoutubeVideo video;
	
	public YoutubeNewVideoEvent(YoutubeVideo video) {
		super();
		this.video = video;
	}

	public YoutubeVideo getVideo() {
		return video;
	}

	public void setVideo(YoutubeVideo video) {
		this.video = video;
	}

	@Override
	public final Type<IEPGEventHandler> getAssociatedType() {
		return EPGEventHandler.TYPE;
	}
	
	@Override
	protected void dispatch(IEPGEventHandler handler) {
		handler.onNewVideo(this);
	}


}
