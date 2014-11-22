package com.biplav.tweedeo.facebook.event;

import com.biplav.tweedeo.facebook.FacebookApi;
import com.biplav.tweedeo.facebook.FacebookFeedHandler;
import com.biplav.tweedeo.facebook.callback.FBPostCallback;
import com.biplav.tweedeo.facebook.models.Feed;
import com.biplav.tweedeo.utils.Logger;
import com.google.web.bindery.event.shared.Event.Type;

public class FacebookEventHandler implements IFacebookEventHandler {

	public static final Type<IFacebookEventHandler> TYPE = new Type<IFacebookEventHandler>();

	public void onFacebookInitiateLogin(FacebookInitiateLoginEvent event) {
		System.out
				.println("FacebookEventHandler.onFacebookInitiateLogin() Got event");
		FacebookApi.login(/* new FacebookLoginCallback(),"read_stream" */);
	}

	public void onFacebookLoginSuccessEvent(FacebookLoginSuccessEvent event) {
		Logger.log("Login Success");
		try {
			FacebookApi.getFeeds(null);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void onFacebookGetFeedEvent(FacebookGetFeedSuccessEvent event) {
		Feed feed = event.getFeed();
		FacebookFeedHandler handler = new FacebookFeedHandler(feed);
		handler.process();
		System.out.println("FacebookEventHandler.onFacebookGetFeedEvent()"
				+ feed.getData().size());
		if (feed.getPaging() != null)
			FacebookApi.getFeeds(feed.getPaging().getNext());
		else {
			// TODO:fire end of feed event. thats a state transition rather.
		}
	}

	@Override
	public void onFBVideoShareEventEvent(FBVideoShareEvent fbVideoShareEvent) {
		Logger.log("Attempting to share!!!!");
		try {
			fbVideoShareEvent.getVideo().setUserId(
					FacebookApi.fbCore.getUserId());
			FacebookApi.post(fbVideoShareEvent.getVideo());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFBActivityUpdateEvent(
			FBActivityUpdateEvent fbActivityUpdateEvent) {
		FacebookApi.activityUpdate(fbActivityUpdateEvent.getVideo());
	}
}
