package com.biplav.tweedeo.client.youtube.api.models;

public interface Rating {
	
	public void setAverage(String average);
	public void setMax(String scheme);
	public void setMin(String term);
	public void setRel(String term);
	
	public String getAverage();
	public String getMax();
	public String getMin();
	public String getRel();

}
