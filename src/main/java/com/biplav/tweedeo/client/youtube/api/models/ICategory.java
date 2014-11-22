package com.biplav.tweedeo.client.youtube.api.models;

public interface ICategory {
	
	public void setLabel(String label);
	public void setScheme(String scheme);
	public void setTerm(String term);
	
	public String getLabel();
	public String getScheme();
	public String getTerm();

}
