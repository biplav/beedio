package com.biplav.tweedeo.utils;

import com.biplav.tweedeo.client.youtube.player.events.YoutubePlayerEventHandler;
import com.google.gwt.user.client.Window;

public class BrowserHacks {
	//Chromes user agent
	//Mozilla/5.0 (X11; Linux i686) AppleWebKit/535.2 (KHTML, like Gecko) Ubuntu/11.10 Chromium/15.0.874.106 Chrome/15.0.874.106 Safari/535.2
	
	//firefox
	//Mozilla/5.0 (Ubuntu; X11; Linux i686; rv:9.0.1) Gecko/20100101 Firefox/9.0.1
	
	private static String userAgent = Window.Navigator.getUserAgent();
	private static boolean IPAD_IPHONE_IPOD = isApple();
	public static boolean FIREFOX = isMozilla();
	public static boolean INTENETEXPLORER = isInternetExplorer();
	
	
	public static void fixMask(String width,String height) {
		if(IPAD_IPHONE_IPOD) fixMaskNative(width, "5");
		else fixMaskNative(width, height);
	}
	
	public static native void clearDiv(String divId) /*-{
		$wnd.$('#'+divId).replaceWith('<div id="'+divId+'"></div>');
	}-*/;
	
	public static void loadMedia(String mediaURL) {
		/*userAgent=Window.Navigator.getUserAgent();
		if(FIREFOX) {
			clearDiv("vid");
			String id = UrlParser.getYoutubeVideoId(mediaURL);
			YoutubePlayerEventHandler.player = new YouTubePlayer(id, "vid", EPGConfig.playerWidth, EPGConfig.playerHeight);
			//fixMask(EPGConfig.playerWidth, EPGConfig.playerHeight);
		} else {*/
			YoutubePlayerEventHandler.player.loadMedia(mediaURL);
		//}
	}
	
	public static void fixNextVidPaused() {
		/*if(FIREFOX)
			EPGManager.bottomBar.deactivateNext();*/
	}
	
	public static void activateNextVid() {
		/*if(FIREFOX)
			EPGManager.bottomBar.activateNext();*/
	}
	
	private static boolean isApple() {
		userAgent=Window.Navigator.getUserAgent();
		return userAgent.toLowerCase().contains("iphone") || userAgent.toLowerCase().contains("ipad") || userAgent.toLowerCase().contains("ipod");
	}
	
	private static boolean isMozilla() {
		userAgent=Window.Navigator.getUserAgent();
		Logger.log(userAgent);
		return userAgent.toLowerCase().contains("firefox");
	}
	
	private static boolean isInternetExplorer() {
		userAgent=Window.Navigator.getUserAgent();
		Logger.log(userAgent);
		return userAgent.toLowerCase().contains("msie");
	}
	
	private static native void fixMaskNative(String width,String height) /*-{
	$wnd.$("#overlay").width(width);
	$wnd.$("#overlay").height(height);
}-*/;

}
