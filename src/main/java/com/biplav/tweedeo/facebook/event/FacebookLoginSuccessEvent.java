package com.biplav.tweedeo.facebook.event;

import com.biplav.tweedeo.facebook.models.Session;
import com.google.web.bindery.event.shared.Event;


public class FacebookLoginSuccessEvent extends Event<IFacebookEventHandler> {
	
	private Session session;
	
	public FacebookLoginSuccessEvent(Session session) {
		super();
		this.session=session;
	}

	@Override
	public com.google.web.bindery.event.shared.Event.Type<IFacebookEventHandler> getAssociatedType() {
		return FacebookEventHandler.TYPE;
	}

	@Override
	protected void dispatch(IFacebookEventHandler handler) {
		handler.onFacebookLoginSuccessEvent(this);
	}
	

}
