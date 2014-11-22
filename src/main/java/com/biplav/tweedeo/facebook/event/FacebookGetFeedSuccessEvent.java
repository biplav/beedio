package com.biplav.tweedeo.facebook.event;

import com.biplav.tweedeo.facebook.models.Feed;
import com.google.web.bindery.event.shared.Event;

public class FacebookGetFeedSuccessEvent extends Event<IFacebookEventHandler> {
	
	private Feed feed;

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public FacebookGetFeedSuccessEvent(Feed feed) {
		super();
		this.feed = feed;
	}

	@Override
	public com.google.web.bindery.event.shared.Event.Type<IFacebookEventHandler> getAssociatedType() {
		return FacebookEventHandler.TYPE;
	}

	@Override
	protected void dispatch(IFacebookEventHandler handler) {
		handler.onFacebookGetFeedEvent(this);
	}
	

}
