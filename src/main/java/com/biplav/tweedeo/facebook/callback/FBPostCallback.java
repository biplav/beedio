package com.biplav.tweedeo.facebook.callback;

import com.biplav.tweedeo.utils.Callback;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.core.client.JavaScriptObject;

public class FBPostCallback extends Callback<JavaScriptObject> {

	@Override
	public void onFailure(Throwable caught) {
		Logger.log("Error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		caught.printStackTrace();
		super.onFailure(caught);
	}

	@Override
	public void onSuccess(JavaScriptObject result) {
		Logger.log("Success!!!");
		super.onSuccess(result);
	}
	
	

}
