package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.events.VideoEndedEvent;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class FocusBox extends TextBox  implements KeyDownHandler{

	private TextBox focusBox;
	public FocusBox() {
		super();
		focusBox=this;
		this.setFocus(true);
		this.setSize("1px","1px");
		this.addBlurHandler(new BlurHandler() {
			public void onBlur(BlurEvent event) {
				focusBox.setFocus(true);
			}
		});
		
		/*this.addKeyboardListener(new KeyboardListener() {
			
			public void onKeyUp(Widget sender, char keyCode, int modifiers) {
				if(keyCode == KeyCodes.KEY_RIGHT) {
					Logger.log("Tweedeo.onModuleLoad().new KeyboardListener() {...}.onKeyUp() Next Video");
					StateMachine.eventBus.fireEvent(new VideoEndedEvent());
				}
				
			}
			
			public void onKeyPress(Widget sender, char keyCode, int modifiers) {
				Logger.log("Tweedeo.onModuleLoad().new KeyboardListener() {...}.onKeyPress()" + keyCode);
				
			}
			
			public void onKeyDown(Widget sender, char keyCode, int modifiers) {
				
			}
		});*/
	}
	public void onKeyDown(KeyDownEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	

}
