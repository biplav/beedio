package com.biplav.tweedeo.facebook.models;

public interface Session {
	String getStatus();
	void setStatus(String status);
	
	AuthResponse getAuthResponse();
	void setAuthResponse(AuthResponse authResponse);
	
	public static String CONECTED = "connected";
	public static String NOTAUTHORIZED = "not_authorized";
	public static String UNKNOWN = "unknown";

}
