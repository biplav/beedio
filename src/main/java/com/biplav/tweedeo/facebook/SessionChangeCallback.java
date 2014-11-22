package com.biplav.tweedeo.facebook;

import com.biplav.tweedeo.utils.Callback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;

class SessionChangeCallback extends Callback<JavaScriptObject> {
	public void onSuccess (JavaScriptObject response ) {
	    // Make sure cookie is set so we can use the non async method
	    Window.alert(response.toString());
	}
}