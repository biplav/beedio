package com.biplav.tweedeo.facebook.callback;

import com.biplav.tweedeo.facebook.event.FacebookGetFeedSuccessEvent;
import com.biplav.tweedeo.facebook.models.Feed;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Callback;
import com.biplav.tweedeo.utils.GetObject;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;

public class FacebookGetFeedCallback extends Callback<JavaScriptObject> {

	public EventBus eventBus = StateMachine.eventBus;

	@Override
	public void onSuccess(JavaScriptObject result) {
		Feed feed = (Feed) GetObject.fromJSO(result, Feed.class);
		/*try {
			if (feed.getPaging() != null) {
		*/		eventBus.fireEvent(new FacebookGetFeedSuccessEvent(feed));
				/*String next = feed.getPaging().getNext();
				Logger.log("FacebookGetFeedCallback.onSuccess() Next"
						+ next);
				FacebookApi.getFeeds(next);*/
		/*	} else
				System.out
						.println("FacebookGetFeedCallback.onSuccess() No more feeds available");
		} catch (Exception e) {
			Logger.log(e.getMessage());
			e.printStackTrace();
		} catch (Throwable e) {
			Logger.log(e.getMessage());
			e.printStackTrace();
		}*/
	}

	@Override
	public void onFailure(Throwable caught) {
		caught.printStackTrace();
		Logger.log("FacebookGetFeedCallback.onFailure() ");
	}

}
