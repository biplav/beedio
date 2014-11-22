package com.biplav.tweedeo.client.youtube.api.models;

import java.util.List;

public interface Entry {
	
	public List<ICategory> getCategory();
	public void setCategory(List<ICategory> category);
	
	public MediaGroup getMedia$group();
	public void setMedia$group(MediaGroup media$Group);
	
	public Rating getGd$rating();
	public void setGd$rating(Rating gd$rating);

}
