package com.biplav.tweedeo.client.video;

import com.biplav.tweedeo.facebook.models.Post;

public interface IVideo {
	
	String NEW="NEW";
	String SKIPPED="SKIPPED";
	String WATCHED="WATCHED";
	
	String getUrl();
	Post getPost();
	String getUserId();
	String getStatus();
	
	void setUrl(String url);
	void setPost(Post post);
	void setUserId(String userId);
	void setStatus(String status);
	
	int getBeedioScore();
	void setBeedioScore(int score);
	
}