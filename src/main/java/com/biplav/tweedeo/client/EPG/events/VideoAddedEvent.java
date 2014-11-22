package com.biplav.tweedeo.client.EPG.events;

import com.biplav.tweedeo.client.EPG.EPGEventHandler;
import com.biplav.tweedeo.client.EPG.IEPGEventHandler;
import com.google.web.bindery.event.shared.Event;

public class VideoAddedEvent extends Event<IEPGEventHandler> {
	
	private int total;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public VideoAddedEvent(int total) {
		super();
		this.total = total;
	}

	@Override
	public final Type<IEPGEventHandler> getAssociatedType() {
		return EPGEventHandler.TYPE;
	}
	
	@Override
	protected void dispatch(IEPGEventHandler handler) {
		handler.onVideoAddedEvent(this);
	}
}
