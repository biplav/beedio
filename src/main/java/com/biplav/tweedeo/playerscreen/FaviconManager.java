package com.biplav.tweedeo.playerscreen;

import com.google.gwt.user.client.ui.RootPanel;

public class FaviconManager {
	
	public static void updateFavicon(String src) {
		if(src == null) {
			src="images/favicon.ico";
		}
		RootPanel.get("favicon").getElement().setAttribute("href", src);
	}

}
