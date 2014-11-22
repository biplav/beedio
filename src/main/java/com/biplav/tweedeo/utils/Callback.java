package com.biplav.tweedeo.utils;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;



/**
 * Callback that by default logs the response.
 */
public abstract class Callback<T> implements AsyncCallback<T> {
    
    public Callback() {
    }

    public void onFailure(Throwable caught) {
        throw new RuntimeException ( caught );
    }

    public void onSuccess(T result) {
        GWT.log ( result + "" , null );
    }
    
    

}