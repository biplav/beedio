package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.EPGManager;
import com.google.gwt.dom.client.Document;

public class TitleManager {
	
	public static void setTitle(String title) {
		if (Document.get() != null) {
	        Document.get().setTitle (title);
	    }
	}
	
	public static void updateTitlePaused(int no) {
		if (Document.get() != null) {
			if(no < 100)
				Document.get().setTitle (no + "% of video cued.");
			else 
				Document.get().setTitle ("Full Video Cued");
	    }
	}
	
	public static void updateTitlePlaying(int no) {
		if (Document.get() != null) {
	        Document.get().setTitle ("(" + no + ") videos in your playlist" );
	    }
	}

}
