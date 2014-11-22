package com.biplav.tweedeo.facebook.callback;

import com.biplav.tweedeo.facebook.event.FacebookInitiateLoginEvent;
import com.biplav.tweedeo.facebook.event.FacebookLoginSuccessEvent;
import com.biplav.tweedeo.facebook.models.Session;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Callback;
import com.biplav.tweedeo.utils.GetObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;

public class FacebookLoginCallback extends Callback<JavaScriptObject> {
	
	private Session session;
	public EventBus eventBus = StateMachine.eventBus;

	public void onSuccess(JavaScriptObject response) {
		System.out.println("FacebookLoginCallback.onSuccess()"
				+ response.toString());
		session = (Session) GetObject.fromJSO(response, Session.class);
		processSession();

		}

		public void processSession() {
			if (session.getStatus().equalsIgnoreCase(Session.CONECTED)) {
				eventBus.fireEvent(new FacebookLoginSuccessEvent(session));
			} else if (session.getStatus().equalsIgnoreCase(Session.NOTAUTHORIZED)) {
				System.out.println("LoginStatusCallback.processSession() Event bus to fire event");
				eventBus.fireEvent(new FacebookInitiateLoginEvent());
			} else if (session.getStatus().equalsIgnoreCase(Session.UNKNOWN)) {
				
			} else {

			}
		}

}
