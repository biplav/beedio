package com.biplav.tweedeo.client;



import java.util.List;

import com.biplav.tweedeo.client.EPG.EPGManager;
import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.client.video.YoutubeVideo;
import com.biplav.tweedeo.client.youtube.api.YoutubePlayerApi;
import com.biplav.tweedeo.client.youtube.api.models.VideoDetails;
import com.biplav.tweedeo.facebook.FacebookApi;
import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.playerscreen.BottomBar;
import com.biplav.tweedeo.playerscreen.FaviconManager;
import com.biplav.tweedeo.playerscreen.PauseScreen;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Callback;
import com.biplav.tweedeo.utils.GetObject;
import com.biplav.tweedeo.utils.Logger;
import com.biplav.tweedeo.utils.UrlParser;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Tweedeo implements EntryPoint {

	private static BottomBar bottomBar;
	
	private static final String YT_VID_DETAILS_URL = "https://gdata.youtube.com/feeds/api/videos/videoId_value?v=2&alt=json";
	
	private static final String VIDEO_ID_VALUE = "videoId_value";
	
	public void onModuleLoad() {
		
		init();
		
		StateMachine fbStateMachine = GWT.create(StateMachine.class);
		fbStateMachine.init();
		
		YoutubePlayerApi.init();
	}
	
	private void init() {
		String json = "{ \"id\": \"1111111111_11111111\", \"from\": { \"name\": \"Beedio\", \"id\": \"412137128819030\" }, \"message\": \"Watch Videos like never before! \", \"picture\": \"http://i.ytimg.com/vi/l11DDo3PJN4/default.jpg\", \"link\": \"http://www.youtube.com/watch?v=izsJ3X2g6w0\", \"source\": \"http://www.youtube.com/v/l11DDo3PJN4\", \"name\": \"Dewarist Kya Khayal Hai!\", \"caption\": \"www.youtube.com\", \"description\": \"Beedio tries to change the way you watch video!Please share your experience and give feedback at http://www.facebook.com/beedio \", \"icon\": \"https://s-static.ak.facebook.com/rsrc.php/v1/yj/r/v2OnaTyTQZE.gif\", \"actions\": [ { \"name\": \"Comment\", \"link\": \"https://www.facebook.com/511654116/posts/291603654264818\" }, { \"name\": \"Like\", \"link\": \"https://www.facebook.com/511654116/posts/291603654264818\" } ], \"type\": \"video\", \"application\": { \"name\": \"Links\", \"id\": \"2309869772\" }, \"created_time\": \"2012-05-08T20:41:02+0000\", \"updated_time\": \"2012-05-08T20:45:28+0000\", \"comments\": { \"data\": [ { \"id\": \"511654116_291603654264818_1586314\", \"from\": { \"name\": \"Biplav Saraf\", \"id\": \"642660238\" }, \"message\": \"I love beedio.com\", \"created_time\": \"2012-05-08T20:45:28+0000\" } ], \"count\": 1 } }";
		String id=null;
		Post post = GetObject.getObject(Post.class, json);
		List<String> yt = Window.Location.getParameterMap().get("yt");
		if(yt != null) {
			Logger.log(yt.toString());
			id=yt.toString().replace("[", "");
			id=id.replace("]","");
		}
		Logger.log("Video id is" + id);
		if(id==null) {
			id="http://www.youtube.com/v/l11DDo3PJN4";
		} else id = "http://www.youtube.com/v/"+id;
		bottomBar = EPGManager.bottomBar;
		RootPanel.get().add(bottomBar);
		IVideo video = new YoutubeVideo(id, post, "");
		EPGManager.currentVideo = video;
		populateData(video);
		getDetails(video);
	}
	
	public static native void simpleGet(String path,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.$.getJSON(path,function(response) {
			app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
			});
	}-*/;
	
	public static void getDetails(final IVideo video) {

		final String youtubeVideoId = UrlParser.getYoutubeVideoId(video.getUrl());
		getPicture(youtubeVideoId, new Callback<JavaScriptObject>() {
			public void onSuccess(JavaScriptObject result) {
				Logger.log("Got picture");
		        VideoDetails videoDetails = (VideoDetails)GetObject.fromJSO(result, VideoDetails.class);
		        String url = videoDetails.getEntry().getMedia$group().getMedia$thumbnail().get(0).getUrl();
		        String description = videoDetails.getEntry().getMedia$group().getMedia$description().get$t();
		        video.getPost().setPicture(url);
		        video.getPost().setDescription(description);
		        populateData(video);
		    }
		});
	}
	
	private static void getPicture(String videoId, Callback<JavaScriptObject> callback) {
		Logger.log("Get picture");
		String path = YT_VID_DETAILS_URL.replace(VIDEO_ID_VALUE, videoId);
		simpleGet(path, callback);
	}

	private static void populateData(final IVideo video) {
		bottomBar.populateData(video.getPost());
		FaviconManager.updateFavicon(video.getPost().getPicture());
		RootPanel.get("epg").clear();
		PauseScreen pauseScreen = new PauseScreen(EPGManager.currentVideo);
		EPGManager.pauseScreen = pauseScreen;
		RootPanel.get("epg").add(pauseScreen);
		RootPanel.get("epg").setVisible(false);
	}
	
	
}