package com.biplav.tweedeo.client.EPG;

import com.google.gwt.user.client.Window;

public class EPGConfig {
	
	public static int areaHeight = Window.getClientHeight() - 50;
	public static int areaWidthtLess100 = Window.getClientWidth()-250;
	public static String playerHeight = "" + areaHeight;
	public static String playerWidth = ""+ Window.getClientWidth();
	public static String bottomBarHeight = "" + 50;
	public static String bottomBarWidth = playerWidth;
	public static String titleBarWidth = ""+areaWidthtLess100;
	public static int pauseScreenImageWidth = (int) (Window.getClientWidth()*.4);
	public static int pauseScreenImageBarWidth = (int) (Window.getClientWidth()*.8);
	public static int pauseScreenImageLeftBarWidth = (int) (Window.getClientWidth()*.1);
	public static int pauseScreenImageRightBarWidth = (int) (Window.getClientWidth()*.3);
	public static int pauseScreenImageHeigth = (int) (Window.getClientHeight()*.4);
}
