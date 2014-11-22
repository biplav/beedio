package com.biplav.tweedeo.client.EPG;

import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.playerscreen.BottomBar;
import com.biplav.tweedeo.playerscreen.PauseScreen;

public class EPGManager {
	
	public static PlayListManager facebookPlayList = new PlayListManager();
	public static BottomBar bottomBar = new BottomBar();
	public static boolean isNext =false;
	public static IVideo currentVideo;
	public static PauseScreen pauseScreen;

}
