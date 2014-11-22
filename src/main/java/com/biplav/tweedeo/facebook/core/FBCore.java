package com.biplav.tweedeo.facebook.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Class that wraps facebook Javascript SDK
 * 
 * @author ola the wrapper
 */
public class FBCore {

	/**
	 * Wrapper method
	 * 
	 * @see http://developers.facebook.com/docs/reference/javascript/FB.init
	 */
	public native void init(String appId, boolean status, boolean cookie,
			boolean xfbml) /*-{
		$wnd.FB.init({
			'appId' : appId,
			'status' : status,
			'cookie' : cookie,
			'xfbml' : xfbml
		});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void api(String path, AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB
				.api(
						path,
						function(response) {
							app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
						});
	}-*/;

	public native void api(String path, String params,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB
				.api(
						path,
						params,
						function(response) {
							app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
						});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void api(String path, JavaScriptObject params,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB
				.api(
						path,
						params,
						function(response) {
							app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
						});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void api(String path, String method, JavaScriptObject params,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB
				.api(
						path,
						method,
						params,
						function(response) {
							app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
						});
	}-*/;
	
	public native void post(String accessCode, String link,String picture,String caption,String description, AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.objApp = {
          method: 'feed',
          display: 'popup', 
          link: link,
          picture: picture,
          caption: caption,
          description: description
        };
		$wnd.FB.ui($wnd.objApp,function(response) {
							app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
						});
				
	}-*/;
	
	public native void activityUpdate(String accessCode, String id,String picture,String caption,String description, AsyncCallback<JavaScriptObject> callback) /*-{
	var app = this;
	$wnd.FB.api('/me/video.watches','post',
		{
		video:"http://www.beedio.com/?yt="+id+"&title="+caption+"&description="+description+"&image="+picture
		},function(response) {
						app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
					});
	}-*/;

	public native void simpleGet(String path,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.$.getJSON(path,function(response) {
			app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
			});
	}-*/;
	
	public native String getAccessToken() /*-{
		return $wnd.FB._authResponse.accessToken;
	}-*/;
	
	public native void setAccessToken(String token) /*-{
	$wnd.FB._authResponse= {accessToken:token};
}-*/;
	
	public native String getUserId() /*-{
	return ""+$wnd.FB._userID;
}-*/;
	
	public native void feedGet(String path,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		path = path.replace("me_value",$wnd.FB._userID);
		if(path.indexOf("accessToken_value") > -1)
			path = path.replace("accessToken_value",$wnd.FB._authResponse.accessToken);
		$wnd.$.get(path,function(response) {
				app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
			},"json");
	}-*/;

	/**
	 * Wrapper method for the OLD REST API
	 */
	public native void api(JavaScriptObject params,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB.api(params,function(response) {
					app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
			});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void getLoginStatus(AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB.getLoginStatus(function(response) {
					app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
				});

	}-*/;

	/**
	 * Wrapper method
	 */
	public native JavaScriptObject getAuthResponse() /*-{
		return $wnd.FB.getAuthResponse();
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void login(AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB.login(function(response) {
					app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
				});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void login(AsyncCallback<JavaScriptObject> callback,
			String permissions) /*-{
		var app = this;
		$wnd.FB.login(function(response) {
				app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
			}, {scope : permissions	});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void logout(AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB
				.logout(function(response) {
					app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
				});
	}-*/;

	/**
	 * Wrapper method
	 */
	public native void ui(JavaScriptObject params,
			AsyncCallback<JavaScriptObject> callback) /*-{
		var app = this;
		$wnd.FB
				.ui(
						params,
						function(response) {
							app.@com.biplav.tweedeo.facebook.core.FBCore::callbackSuccess(Lcom/google/gwt/user/client/rpc/AsyncCallback;Lcom/google/gwt/core/client/JavaScriptObject;)(callback,response);
						});
	}-*/;

	/*
	 * Called when method succeeded.
	 */
	protected void callbackSuccess(AsyncCallback<JavaScriptObject> callback,
			JavaScriptObject obj) {
		callback.onSuccess(obj);
	}

}
