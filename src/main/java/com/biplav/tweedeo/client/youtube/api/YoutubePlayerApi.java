package com.biplav.tweedeo.client.youtube.api;

import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.JSScript;
import com.google.gwt.event.shared.EventBus;


public class YoutubePlayerApi {
	
	public static boolean isLoaded = false;
	private static EventBus eventBus = StateMachine.eventBus;
	
	public static void init() {
		setApiReady();
		JSScript.load("http://www.youtube.com/player_api");
		}
		
	
	public static native void setApiReady() /*-{
		$wnd.onYouTubePlayerAPIReady = function() {
			@com.biplav.tweedeo.client.youtube.api.YoutubePlayerApi::onYoutubePlayerAPIReady()();
		};	
	}-*/; 
	
	public static void onYoutubePlayerAPIReady() {
		isLoaded = true;
		System.out.println("YoutubePlayerApi.onYoutubePlayerAPIReady()");
		eventBus.fireEvent(new YoutubeApiEvent());
	}
	 

}
