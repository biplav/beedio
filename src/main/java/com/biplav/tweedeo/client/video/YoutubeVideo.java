package com.biplav.tweedeo.client.video;

import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.utils.GetObject;

public class YoutubeVideo implements IVideo{
	
	private String url;
	private Post post;
	private String userId;
	private int beedioScore;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	private String status=NEW;
		
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public YoutubeVideo(String id, Post post, String userId) {
		super();
		this.url = id;
		this.post = post;
		this.userId = userId;
	}

	public String getUrl() {
		return url;
	}

	public Post getPost() {
		return post;
	}
	
	public String toString() {
		String post =  GetObject.toJSON(this.post);
		String json = "{"
				+"\"url\" : \""+this.url+"\","
				+"\"post\" : "+post+","
				+"\"userId\" : \""+this.userId+"\","
				+"\"status\" : \""+this.status+"\"" 
				+"}";
		return json;
	}

	public int getBeedioScore() {
		return beedioScore;
	}

	public void setBeedioScore(int score) {
		beedioScore = score; 	
	}
}
