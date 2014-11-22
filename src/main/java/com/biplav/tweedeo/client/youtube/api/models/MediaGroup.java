package com.biplav.tweedeo.client.youtube.api.models;

import java.util.List;

public interface MediaGroup {
	
	public void setMedia$thumbnail(List<IThumbnail> thumbnail);
	public List<IThumbnail> getMedia$thumbnail();
	
	public IMediaDescription getMedia$description();
	public void setMedia$description(IMediaDescription mediaDescription);
}
