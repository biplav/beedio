package com.biplav.tweedeo.client.EPG.events;

import com.biplav.tweedeo.client.EPG.EPGEventHandler;
import com.biplav.tweedeo.client.EPG.IEPGEventHandler;
import com.google.web.bindery.event.shared.Event;

public class ActivateNextEvent extends Event<IEPGEventHandler> {
	@Override
	public final Type<IEPGEventHandler> getAssociatedType() {
		return EPGEventHandler.TYPE;
	}
	
	@Override
	protected void dispatch(IEPGEventHandler handler) {
		handler.onActivateNextEvent(this);
	}

}
