package com.biplav.tweedeo.stateMachine;

import com.biplav.tweedeo.client.EPG.EPGEventHandler;
import com.biplav.tweedeo.client.EPG.EPGManager;
import com.biplav.tweedeo.client.EPG.IEPGEventHandler;
import com.biplav.tweedeo.client.stateMachine.IState;
import com.biplav.tweedeo.client.stateMachine.IStateMachine;
import com.biplav.tweedeo.client.youtube.player.events.YoutubePlayerEventHandler;
import com.biplav.tweedeo.facebook.event.FacebookEventHandler;
import com.biplav.tweedeo.stateMachine.states.FacebookSessionInit;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Timer;

public class StateMachine implements IStateMachine {
	
	public static EventBus eventBus = GWT.create(SimpleEventBus.class);
	
	public void getRegister() {
		// TODO Auto-generated method stub
		
	}


	private IState currentState;

	public void transitionTo(IState nextState) {
		currentState = nextState;
		currentState.execute();
	}

	public void init() {
		currentState = new FacebookSessionInit();
		currentState.execute();
		eventBus.addHandler(FacebookEventHandler.TYPE, new FacebookEventHandler());
		eventBus.addHandler(EPGEventHandler.TYPE, new EPGEventHandler());
		eventBus.addHandler(YoutubePlayerEventHandler.TYPE, new YoutubePlayerEventHandler());
	}

}
