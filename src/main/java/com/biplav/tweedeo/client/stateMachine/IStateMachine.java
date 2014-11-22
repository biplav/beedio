package com.biplav.tweedeo.client.stateMachine;

public interface IStateMachine {
	
	public void transitionTo(IState nextState);
	public void init();
	public void getRegister();
}
