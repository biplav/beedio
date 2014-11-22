package com.biplav.tweedeo.facebook;

import com.biplav.tweedeo.facebook.event.FacebookInitiateLoginEvent;
import com.biplav.tweedeo.facebook.event.FacebookLoginSuccessEvent;
import com.biplav.tweedeo.facebook.models.Session;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Callback;
import com.biplav.tweedeo.utils.GetObject;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;

class LoginStatusCallback extends Callback<JavaScriptObject> {

	private Session session;
	public EventBus eventBus = StateMachine.eventBus;

	public void onSuccess(JavaScriptObject response) {
		Logger.log("LoginStatusCallback.onSuccess()"
				+ response.toString());
		
		session = (Session) GetObject.fromJSO(response, Session.class);
		processSession();
	}

	public void processSession() {
		if (session.getStatus().equalsIgnoreCase(Session.CONECTED)) {
			Logger.log("LoginStatusCallback.processSession() Connected");
			eventBus.fireEvent(new FacebookLoginSuccessEvent(session));
		} else if (session.getStatus().equalsIgnoreCase(Session.NOTAUTHORIZED)) {
			Logger.log("LoginStatusCallback.processSession() Event bus to fire event");
			eventBus.fireEvent(new FacebookInitiateLoginEvent());
		} else if (session.getStatus().equalsIgnoreCase(Session.UNKNOWN)) {
			System.out.println("LoginStatusCallback.processSession() Unknown");
			eventBus.fireEvent(new FacebookLoginSuccessEvent(session));
			//FacebookApi.redirect();
		} else {
			Logger.log("LoginStatusCallback.processSession() Crazy" + session.getStatus());
			FacebookApi.redirect();
		}
	}

	public void onFailure(Throwable caught) {
		Logger.log("exception");
		Logger.exception(caught);
		caught.printStackTrace();
	}
}