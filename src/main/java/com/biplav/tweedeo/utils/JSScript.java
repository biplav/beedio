package com.biplav.tweedeo.utils;

public class JSScript {
	
	public static native void load(String url) /*-{
	var tag = $wnd.document.createElement('script');
	tag.src = url;
	var firstScriptTag = $wnd.document.getElementsByTagName('script')[0];
	firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);
}-*/;

}
