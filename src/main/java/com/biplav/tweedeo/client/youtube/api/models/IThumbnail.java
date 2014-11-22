package com.biplav.tweedeo.client.youtube.api.models;

public interface IThumbnail {

	public void setUrl(String url);
	public void setHeight(String height);
	public void setWidth(String width);
	public void setName(String name);
	
	public String getUrl();
	public String getHeight();
	public String getWidth();
	public String getName();
}
