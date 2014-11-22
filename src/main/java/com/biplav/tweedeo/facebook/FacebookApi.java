package com.biplav.tweedeo.facebook;

import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.client.youtube.api.models.VideoDetails;
import com.biplav.tweedeo.facebook.callback.FBPostCallback;
import com.biplav.tweedeo.facebook.callback.FacebookGetFeedCallback;
import com.biplav.tweedeo.facebook.core.FBCore;
import com.biplav.tweedeo.facebook.core.FBEvent;
import com.biplav.tweedeo.facebook.event.FacebookLoginSuccessEvent;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.BrowserHacks;
import com.biplav.tweedeo.utils.Callback;
import com.biplav.tweedeo.utils.GetObject;
import com.biplav.tweedeo.utils.Logger;
import com.biplav.tweedeo.utils.UrlParser;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;

public class FacebookApi {

	private static final String VIDEO_ID_VALUE = "videoId_value";

	private static final String YT_VID_DETAILS_URL = "https://gdata.youtube.com/feeds/api/videos/videoId_value?v=2&alt=json";

	private static final String ACCESS_TOKEN = "code";

	private static final String PERMISSIONS = "user_location, friends_location,user_photos,friends_photos,user_status,friends_status,user_videos,friends_videos,user_likes,friends_likes,user_interests,friends_interests,user_hometown,friends_hometown,user_education_history,friends_education_history,user_checkins,friends_checkins,user_activities,friends_activities,user_about_me,friends_about_me,user_religion_politics,friends_religion_politics,user_website,friends_website,user_work_history,friends_work_history,read_friendlists,read_stream,publish_actions";

	private static final String LIMIT = "250";

	// public static String APPID = "127886660844";
	public static String APPID = "197474359545";
	public static FBCore fbCore = GWT.create(FBCore.class);
	public static FBEvent fbEvent = GWT.create(FBEvent.class);

	public static boolean status = true;
	public static boolean xfbml = true;
	public static boolean cookie = true;

	private static String accessCode;

	public static void init() {
		// TODO:Need a callback for success or failure.
		fbCore.init(APPID, status, cookie, xfbml);
	}

	public static void initializeSession() {
		fbEvent.subscribe("auth.sessionChange", new SessionChangeCallback());
	}

	public static void checkLoginStatus() {
		Logger.log("Checking login status!!!!");
		fbCore.getLoginStatus(new LoginStatusCallback());
	}

	/*
	 * get url and check for access token, if access toekn exists then check for
	 * its validity else redirect the user to
	 * https://www.facebook.com/dialog/oauth? client_id=YOUR_APP_ID
	 * &redirect_uri=YOUR_REDIRECT_URI
	 * &scope=COMMA_SEPARATED_LIST_OF_PERMISSION_NAMES &response_type=token,
	 * whenever access token expires redo the same step.
	 */

	public static void redirectLogin() {
		accessCode = Window.Location.getHash().replace("#access_token=", "");
		if (accessCode.contains("&expires_in")) {
			accessCode = accessCode.substring(0,
					accessCode.indexOf("&expires_in"));
		}
		Logger.log("AccessCode is " + accessCode);
		// getParameter(ACCESS_TOKEN);
		if (accessCode != null && !accessCode.isEmpty()) {
			fbCore.setAccessToken(accessCode);
			Logger.log("Logged in checking status");
			handleLogin();
		} else {
			Logger.log("Not Logged in, redirecting");
			redirect();
			// Window.Location.reload();
		}
	}

	public static void handleLogin() {
		if (BrowserHacks.INTENETEXPLORER)
			StateMachine.eventBus
					.fireEvent(new FacebookLoginSuccessEvent(null));
		else
			fbCore.getLoginStatus(new LoginStatusCallback());
	}

	public static void redirect() {
		String currentUrl = Window.Location.createUrlBuilder().buildString();
		String loginUrl = "https://www.facebook.com/dialog/oauth?"
				+ "client_id=" + APPID + "&redirect_uri=" + currentUrl
				+ "&scope=" + PERMISSIONS + "&response_type=token";
		Logger.log("Redireting to " + loginUrl);
		Window.Location.replace(loginUrl);
	}

	public static void login(/*
							 * AsyncCallback<JavaScriptObject> callback,String
							 * permissions
							 */) {
		Logger.log("Attempting FB login");
		fbCore.login(new LoginStatusCallback(), PERMISSIONS);
	}

	public static void getFeeds(String nextUrl) {
		if (nextUrl == null) {
			nextUrl = "https://graph.facebook.com/me/home/?access_token=accessToken_value&limit=250&type=link&callback=?";
			if (accessCode != null)
				nextUrl = nextUrl.replace("accessToken_value", accessCode);
			Logger.log("Fetching log " + nextUrl);
			// fbCore.feedGet(nextUrl, new FacebookGetFeedCallback());
			fbCore.simpleGet(nextUrl, new FacebookGetFeedCallback());
		} else {
			fbCore.simpleGet(nextUrl, new FacebookGetFeedCallback());
		}
	}

	/*
	 * TODO:Need some mechanism to let know when no ore feeds are available.
	 */
	public static void getFeedsWithApi(String nextUrl) {
		try {
			if (nextUrl == null) {
				Logger.log("FacebookApi.getFeeds() init");
				fbCore.api("/me/home", new FacebookGetFeedCallback());
			} else {
				Logger.log("FacebookApi.getFeeds()");
				JavaScriptObject feedParams = getFeedParamsWithUntil(nextUrl);
				fbCore.api("/me/home", "GET", feedParams,
						new FacebookGetFeedCallback());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public static JavaScriptObject getFeedParams(String next) {
		if (next == null)
			return null;
		else {
			String until = UrlParser.getUrlProperties(next).get("until")
					.toString();
			// System.out.println("FacebookApi.getFeedParams()" + until);
			JavaScriptObject untilJs = getUntil(until);
			return untilJs;
		}
	}

	public static JavaScriptObject getFeedParamsWithUntil(String next) {
		if (next == null)
			return null;
		else {
			String until = UrlParser.getUrlProperties(next).get("until")
					.toString();
			JavaScriptObject untilJs = getUntilWithLimit(until, LIMIT);
			return untilJs;
		}
	}

	public static native JavaScriptObject getUntil(String until) /*-{
																	return {
																	until : until
																	};
																	paramss = {};
																	paramss.unitl = until;
																	console.log(paramss);
																	return paramss;
																	}-*/;

	public static native JavaScriptObject getUntilWithLimit(String until,
			String limit) /*-{
							return {
							until : until
							};
							paramss = {};
							paramss.unitl = until;
							paramss.limit = limit;
							return paramss;
							}-*/;

	public static void post(final IVideo video) {
		Logger.log(accessCode);
		final String youtubeVideoId = UrlParser.getYoutubeVideoId(video.getUrl());
		getPicture(youtubeVideoId, new Callback<JavaScriptObject>() {
			public void onSuccess(JavaScriptObject result) {
		        VideoDetails videoDetails = (VideoDetails)GetObject.fromJSO(result, VideoDetails.class);
		        String url = videoDetails.getEntry().getMedia$group().getMedia$thumbnail().get(0).getUrl();
		        video.getPost().setPicture(url);
		        fbCore.post(
						accessCode,"http://www.beedio.com/?yt="+youtubeVideoId,
						UrlParser.encode(video.getPost().getPicture()),
						video.getPost().getName(),
						video.getPost().getDescription(),
						new FBPostCallback());
		    }
		});
	}
	
	public static <T> void activityUpdate(final IVideo video) {
		Logger.log(accessCode);
		final String youtubeVideoId = UrlParser.getYoutubeVideoId(video.getUrl());
		getPicture(youtubeVideoId, new Callback<JavaScriptObject>() {
			
			public void onSuccess(JavaScriptObject result) {
		        VideoDetails videoDetails = (VideoDetails)GetObject.fromJSO(result, VideoDetails.class);
		        String url = videoDetails.getEntry().getMedia$group().getMedia$thumbnail().get(0).getUrl();
		        video.getPost().setPicture(url);
		        fbCore.activityUpdate(
						accessCode,youtubeVideoId,
						UrlParser.encode(video.getPost().getPicture()),
						UrlParser.encode(video.getPost().getName()),
						UrlParser.encode(video.getPost().getDescription()),
						new FBPostCallback());
		    }
		});
	}
	
	private static void getPicture(String videoId, Callback<JavaScriptObject> callback) {
		String path = YT_VID_DETAILS_URL.replace(VIDEO_ID_VALUE, videoId);
		fbCore.simpleGet(path, callback);
	}

}
