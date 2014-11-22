package com.biplav.tweedeo.stateMachine.states;

import com.biplav.tweedeo.client.stateMachine.IState;
import com.biplav.tweedeo.facebook.FacebookApi;

public class FacebookSessionInit implements IState {
	
	private IState nextState = null;
	


	public void execute() {
		FacebookApi.init();
		FacebookApi.initializeSession();
		//FacebookApi.login();
		FacebookApi.redirectLogin();
		FacebookApi.checkLoginStatus();
	}

}
