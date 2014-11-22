package com.biplav.tweedeo.utils;

import com.google.gwt.core.client.GWT;

public class Logger {

	private static int line;
	private static String className;
	private static String methodName;

	public static void log(String message) {
		if (isLogEnabled()) {
			//GWT.log(message);
			System.out.println(message);
			//windowLog(message);
		}
	}

	private static boolean isLogEnabled() {
		/*StackTraceElement[] stackTraceElements = Thread.currentThread()
				.getStackTrace();
		StackTraceElement caller = stackTraceElements[3];
		className = caller.getClassName();
		line = caller.getLineNumber();
		methodName = caller.getMethodName();
		for (String name : Debug.contains) {
			if (name.equalsIgnoreCase(className))
				return true;
		}*/
		return true;
	}

	private static native void windowLog(String message) /*-{
		$wnd.console.log(message);
	}-*/;

	public static void exception(Throwable e) {
		Logger.log(e.getStackTrace().toString());
		e.getMessage();
		e.printStackTrace();
	}

	public static void exception(Exception e) {
		Logger.log(e.getStackTrace().toString());
		e.getMessage();
		e.printStackTrace();
	}

}
