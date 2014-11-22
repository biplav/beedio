package com.biplav.tweedeo.facebook.event;

import com.google.web.bindery.event.shared.Event;

public class FacebookInitiateLoginEvent extends Event<IFacebookEventHandler> {


	@Override
	public Type<IFacebookEventHandler> getAssociatedType() {
		return FacebookEventHandler.TYPE;
	}

	@Override
	protected void dispatch(IFacebookEventHandler handler) {
		handler.onFacebookInitiateLogin(this);

	}

}
