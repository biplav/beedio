package com.biplav.tweedeo.client.youtube.player;

import com.biplav.tweedeo.client.youtube.player.events.YouTubeErrorEvent;
import com.biplav.tweedeo.client.youtube.player.events.YouTubePlaybackQualityChangedEvent;
import com.biplav.tweedeo.client.youtube.player.events.YouTubeStateChangedEvent;
import com.biplav.tweedeo.client.youtube.player.events.YoutubePlayerEventHandler;
import com.biplav.tweedeo.client.youtube.player.events.YoutubePlayerReadyEvent;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.BrowserHacks;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class YouTubePlayer extends Widget implements IMediaPlayer {

	public static PlayerWrapper youTubePlayerWrapper;
	
	public static void initYouTubePlayerWrapper() {
		Logger.log("YouTubePlayer.initYouTubePlayerWrapper()");
		youTubePlayerWrapper = RootPanel.get("vid").getElement().cast();
		//RootPanel.get("vid").getElement().setClassName("vid");
		StateMachine.eventBus.fireEvent(new YoutubePlayerReadyEvent());
	}

	public static void setYouTubePlayerWrapper(JavaScriptObject youTubePlayerWrapper) {
		youTubePlayerWrapper = (PlayerWrapper)youTubePlayerWrapper.cast();
	}

	private String videoId;

	public YouTubePlayer(String videoId, PlayerWrapper youTubePlayerWrapper) {
		youTubePlayerWrapper = youTubePlayerWrapper;
	}

	public YouTubePlayer(String videoId, String divId, String width,
			String height) {
		try {
			YoutubePlayerEventHandler.isPlayerReady = false;
			/*if(BrowserHacks.FIREFOX) {
				initPlayerFlashWithSwfObject(videoId,height, width, divId);
				//initPlayerFlash(divId, videoId, height, width);
				initplayerReady();
				//this.youTubePlayerWrapper.addEventListener("onStateChange", "@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onStateChanged(I)(changeCode)");
				YoutubePlayerEventHandler.player = this;
			}else*/ this.youTubePlayerWrapper = (PlayerWrapper) initPlayer(divId,
					videoId, height, width);
		} catch (Exception e) {
			Logger.exception(e);
		} catch (Throwable e) {
			Logger.exception(e);
		}
	}

	private final native JavaScriptObject initPlayer(String divId,
			String videoId, String height, String width) /*-{
		return new $wnd.YT.Player(
				divId,
				{
					height : height,
					width : width,
					videoId : videoId,
					playerVars : {
						'autoplay' : 1,
						'controls' : 0,
						'wmode' : 'opaque'
					},
					events : {
						'onStateChange' : function(changeCode) {
							@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onStateChanged(I)(changeCode.data);
						},
						'onReady' : function(changeCode) {
							@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onPlayerReady()();
						},
						'onPlaybackQualityChange' : function(changeCode) {
							@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onPlaybackQualityChanged(Ljava/lang/String;)(changeCode.data);
						},
						'onError' : function(errorCode) {
							@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onError(I)(errorCode.data);
						}
					}
				});
	}-*/;

	private final native JavaScriptObject initPlayerJS(String divId,
			String videoId, String height, String width) /*-{
		var player = $wnd.createYoutubePlayer(divId, videoId, width, height);
		$wnd.console.log(player);
		return player;
	}-*/;

	private JavaScriptObject initPlayerFlash(String divId, String videoId,
			String height, String width) {
		Logger.log("Embedding YT");
		Element objectElement = Document.get().createObjectElement();
		Element embedElement = Document.get().createElement("embed");
		embedElement.setAttribute("type", "application/x-shockwave-flash");
		//embedElement.setAttribute("frameborder", "0");
		embedElement.setAttribute("allowfullscreen", "false");
		embedElement.setAttribute("src", "https://www.youtube.com/v/"+videoId+"?version=3&feature=player_embedded&autoplay=1&cc_load_policy=1&controls=0&enablejsapi=1&iv_load_policy=3&playerapiid=vidPlayer");
		embedElement.setAttribute("allowscriptaccess", "always");
		embedElement.setAttribute("control", "0");
		embedElement.setAttribute("autoplay", "1");
		embedElement.setAttribute("width", width);
		embedElement.setAttribute("height", height);
		//embedElement.setAttribute("id", divId);
		//embedElement.setAttribute("wmode", "opaque");
		embedElement.setAttribute("version", "3");
		Element paramElement = Document.get().createElement("param");
		paramElement.setAttribute("name", "movie");
		paramElement.setAttribute("value", "https://www.youtube.com/v/"+videoId+"?version=3&feature=player_embedded&autoplay=1&cc_load_policy=1&controls=0&enablejsapi=1&iv_load_policy=3&playerapiid=vidPlayer");
		objectElement.appendChild(paramElement);
		Element paramElementScript = Document.get().createElement("param");
		paramElementScript.setAttribute("name", "allowScriptAccess");
		paramElementScript.setAttribute("value", "always");
		objectElement.appendChild(paramElementScript);
		Element paramElementControls = Document.get().createElement("param");
		paramElementControls.setAttribute("name", "controls");
		paramElementControls.setAttribute("value", "0");
		objectElement.appendChild(paramElementControls);
		Element paramElementAutoplay = Document.get().createElement("param");
		paramElementAutoplay.setAttribute("name", "autoplay");
		paramElementAutoplay.setAttribute("value", "1");
		objectElement.appendChild(paramElementAutoplay);
		Element paramElementWMode = Document.get().createElement("param");
		paramElementWMode.setAttribute("name", "wmode");
		paramElementWMode.setAttribute("value", "opaque");
		objectElement.appendChild(paramElementWMode);
		String inner = embedElement.getString();
		objectElement.setAttribute("id", divId);
		String outer = objectElement.getString();
		String result = outer.replace("</object>", "").replace("</OBJECT>", "")
				+ inner + "</object>";
		Panel video = RootPanel.get("vidPlayer");
		if (video == null)
			Logger.log("Div not found");
		//Widget parent = video.getParent();
		//RootPanel.getBodyElement().replaceChild(objectElement, video.getElement());
		video.getElement().setInnerHTML(result);
		initplayerReady();
		return embedElement.cast();
		//return video.asWidget().;

	}
	
	public final native void initPlayerFlashWithSwfObject(String videoId,String height,String width,String divId) /*-{
	var params = { allowScriptAccess: "always" , controls:"0",autoplay:"1",wmode:"opaque",version:"3"};
    var atts = { id: "vid", allowfullscreen:"false",controls:"0",autoplay:"1"};
    $wnd.swfobject.embedSWF("http://www.youtube.com/v/"+videoId+"?version=3&feature=player_embedded&autoplay=1&cc_load_policy=1&controls=0&enablejsapi=1&iv_load_policy=3&playerapiid=vidPlayer",
                       divId, width, height, "8", null, null, params, atts);
		
	}-*/;
	
	public static native JavaScriptObject getPlayerWrapper() /*-{
		return $wnd.ytplayer;
	}-*/;
	
	public final native void initplayerReady() /*-{
		$wnd.onYouTubePlayerReady = function(playerId) {
		$wnd.stateChange=function(changeCode) {
			@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onStateChanged(I)(changeCode);
		}
		$wnd.onReady = function(changeCode) {
			@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onPlayerReady()();
		}
		$wnd.onPlaybackQualityChange = function(changeCode) {
			@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onPlaybackQualityChanged(Ljava/lang/String;)(changeCode.data);
		}
		$wnd.onError = function(errorCode) {
			@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::onError(I)(errorCode.data);
		}	
		$wnd.console.log("player Ready " + playerId);
	    $wnd.ytplayer = $wnd.document.getElementById("vid");
	    $wnd.console.log($wnd.ytplayer);
	    $wnd.ytplayer.addEventListener("onStateChange", "stateChange");
	    $wnd.ytplayer.addEventListener("onReady", "onReady")
	    $wnd.ytplayer.addEventListener("onPlaybackQualityChange", "onPlaybackQualityChange")
	    $wnd.ytplayer.addEventListener("onError", "onError")
	    $wnd.tmp = $entry(function() {
	    	@com.biplav.tweedeo.client.youtube.player.YouTubePlayer::initYouTubePlayerWrapper()();
	    });
	    $wnd.tmp();
    	}
 	}-*/;
	
	public final native JavaScriptObject getPlayer() /*-{
		return $wnd.ytplayer;
	}-*/;

	public String getVideoId() {
		return videoId;
	}

	// @Override
	public int getMediaDuration() {
		return youTubePlayerWrapper.getDuration();
	}

	// @Override
	public int getPlayPosition() {
		return youTubePlayerWrapper.getCurrentTime();
	}

	// @Override
	public int getVideoHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	// @Override
	public int getVideoWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	// @Override
	public int getVolume() {
		return youTubePlayerWrapper.getVolume();
	}

	// @Override
	public void loadMedia(String mediaURL) {
		youTubePlayerWrapper.loadVideoByUrl(mediaURL, 0);
	}

	// @Override
	public void pauseMedia() {
		if(YoutubePlayerEventHandler.isPlayerReady)
			youTubePlayerWrapper.pauseVideo();
	}

	// @Override
	public void playMedia() {
		try {
			Logger.log("YouTubePlayer.playMedia() " +youTubePlayerWrapper.getVideoUrl());
		if(YoutubePlayerEventHandler.isPlayerReady)
			youTubePlayerWrapper.playVideo();
		} catch(Throwable e){
			Logger.exception(e);
		}
	}

	// @Override
	public void setPlayPosition(int position) {
		youTubePlayerWrapper.seekTo(position, false);
	}

	// @Override
	public void setVolume(int volume) {
		youTubePlayerWrapper.setVolume(volume);
	}

	// @Override
	public void stopMedia() {
		youTubePlayerWrapper.stopVideo();
	}
	
	public int getVideoLoadedPercentage() {
		
		int videoBytesTotal = getVideoBytesTotal();
		int videoBytesLoaded = getVideoBytesLoaded();
		if(videoBytesTotal < videoBytesLoaded) return 100;
		if(videoBytesLoaded < 0 || videoBytesTotal < 0) return 0;
		if(videoBytesLoaded == 0 || videoBytesTotal == 0) return 0;
		int percentage =  ((videoBytesLoaded*100)/videoBytesTotal);
		if(percentage < 0) return 100;
		if(percentage > 100) return 0;
		Logger.log("videoBytesLoaded " + videoBytesLoaded + " videoBytesTotal " + videoBytesTotal + " percentage " + percentage);
		return percentage;
	}
	
	public int getPercentageOfVideoWatched() {
		return (getPlayPosition()*100)/getMediaDuration();
		
	}

	public int getVideoBytesLoaded() {
		return this.youTubePlayerWrapper.getVideoBytesLoaded();
	}

	public int getVideoBytesTotal() {
		return this.youTubePlayerWrapper.getVideoBytesTotal();
	}

	public void setPlaybackQuality(String suggestedQuality) {
		this.youTubePlayerWrapper.setPlaybackQuality(suggestedQuality);
	}

	/**
	 * This event is fired whenever the player's state changes. Possible values
	 * are unstarted (-1), ended (0), playing (1), paused (2), buffering (3),
	 * video cued (5). When the SWF is first loaded it will broadcast an
	 * unstarted (-1) event. When the video is cued and ready to play it will
	 * broadcast a video cued event (5).
	 */
	public static void onStateChanged(int changeCode) {
		Logger.log("YouTubePlayer.onStateChanged() state changed");
		StateMachine.eventBus.fireEvent(new YouTubeStateChangedEvent(
				YouTubeVideoState.get(changeCode)));
	}

	/**
	 * This event is fired when an error in the player occurs. The possible
	 * error codes are 100, 101, and 150. The 100 error code is broadcast when
	 * the video requested is not found. This occurs when a video has been
	 * removed (for any reason), or it has been marked as private. The 101 error
	 * code is broadcast when the video requested does not allow playback in the
	 * embedded players. The error code 150 is the same as 101, it's just 101 in
	 * disguise!
	 */
	public static void onError(int errorCode) {
		StateMachine.eventBus.fireEvent(new YouTubeErrorEvent(YouTubeError
				.get(errorCode)));
	}

	/**
	 * This event is fired whenever the video playback quality changes. For
	 * example, if you call the setPlaybackQuality(suggestedQuality) function,
	 * this event will fire if the playback quality actually changes. Your code
	 * should respond to the event and should not assume that the quality will
	 * automatically change when the setPlaybackQuality(suggestedQuality)
	 * function is called. Similarly, your code should not assume that playback
	 * quality will only change as a result of an explicit call to
	 * setPlaybackQuality or any other function that allows you to set a
	 * suggested playback quality. <br/>
	 * <br/>
	 * The value that the event broadcasts is the new playback quality. Possible
	 * values are "small", "medium", "large" and "hd720".
	 */
	public static void onPlaybackQualityChanged(String quality) {
		StateMachine.eventBus.fireEvent(new YouTubePlaybackQualityChangedEvent(
				YouTubeVideoQuality.get(quality)));
	}

	public static void onPlayerReady() {
		StateMachine.eventBus.fireEvent(new YoutubePlayerReadyEvent());
	}

}
