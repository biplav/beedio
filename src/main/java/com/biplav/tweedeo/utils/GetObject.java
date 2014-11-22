package com.biplav.tweedeo.utils;

import com.biplav.tweedeo.facebook.models.Session;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

public class GetObject {
	Session s;

	public static BeanFactory factory = GWT.create(BeanFactory.class);

	public static <T> Object fromJSO(JavaScriptObject jso, Class<T> clazz) {

		// JSONObject jsonObject = new JSONObject(jso);
		/*
		 * Not using GWT internal json lib as it throws an exception when trying
		 * to parse an array sometimes in case of toString
		 */
		Object obj = null;
		try {
			//String response = jsonObject.toString();
			String response = toJsonString(jso);
			//Logger.log("GetOnject.convertJSOtoObject()" + response);
			obj = getObject(clazz, response);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static <T> T getObject(Class<T> clazz, String response) {
		return (AutoBeanCodex.decode(factory, clazz, response)).as();
	}
	
	public static String toJSON(Object obj) {
		return AutoBeanCodex.encode(AutoBeanUtils.getAutoBean(obj)).getPayload();
	}
	

/*	public static String serialize(Object obj) {
		Serializer serializer = (Serializer)GWT.create(Serializer.class);
		return serializer.serialize(obj);
	}*/
	
	public static native String toJsonString(Object jso) /*-{
	return $wnd.$.toJSON(jso);
}-*/;

}
