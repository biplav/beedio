package com.biplav.tweedeo.facebook.event;

import com.google.gwt.event.shared.EventHandler;

public interface IFacebookEventHandler extends EventHandler {
	void onFacebookInitiateLogin(FacebookInitiateLoginEvent event);
	void onFacebookLoginSuccessEvent(FacebookLoginSuccessEvent event);
	void onFacebookGetFeedEvent(FacebookGetFeedSuccessEvent event);
	void onFBVideoShareEventEvent(FBVideoShareEvent fbVideoShareEvent);
	void onFBActivityUpdateEvent(FBActivityUpdateEvent fbActivityUpdateEvent);

}
