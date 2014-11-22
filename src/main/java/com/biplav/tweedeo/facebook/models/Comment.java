package com.biplav.tweedeo.facebook.models;

public interface Comment {
	String getId();
	void setId(String Id);
	
	FacebookUserDetails getFrom();
	void setFrom(FacebookUserDetails from);
	
	String getMessage();
	void setMessage(String message);
	
	String getCreated_time();
	void setCreated_time(String created_time);
	
	

}
