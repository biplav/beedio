package com.biplav.tweedeo.client.EPG;

import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.web.bindery.event.shared.Event.Type;

public class EPGKeyHandler implements KeyDownHandler{
	
	public static final Type<EPGKeyHandler> TYPE = new Type<EPGKeyHandler>();

	public void onKeyDown(KeyDownEvent event) {
		Logger.log("EPGKeyHandler.onKeyDown()" +event.getNativeKeyCode());
	}
	

}
