package com.biplav.tweedeo.facebook.event;

import com.biplav.tweedeo.client.video.IVideo;
import com.google.web.bindery.event.shared.Event;

public class FBVideoShareEvent extends Event<IFacebookEventHandler> {
	
	private IVideo video;
	public IVideo getVideo() {
		return video;
	}

	public void setVideo(IVideo video) {
		this.video = video;
	}
	
	public FBVideoShareEvent(IVideo video) {
		super();
		this.video = video;
	}

	@Override
	protected void dispatch(IFacebookEventHandler handler) {
		handler.onFBVideoShareEventEvent(this);
	}

	@Override
	public com.google.web.bindery.event.shared.Event.Type<IFacebookEventHandler> getAssociatedType() {
		return FacebookEventHandler.TYPE;
	}

}
