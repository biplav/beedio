package com.biplav.tweedeo.facebook.models;

public interface AuthResponse {
	
	String getAccessToken();
	String getExpiresIn();
	String getSignedRequest();
	String getUserId();
	
	void setAccessToken(String accessToken);
	void setExpiresIn(String expiresIn);
	void setSignedRequest(String signedRequest);
	void setUserId(String userId);

}
