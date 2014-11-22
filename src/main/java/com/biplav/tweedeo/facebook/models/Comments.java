package com.biplav.tweedeo.facebook.models;

import java.util.List;

public interface Comments {
	
	List<Comment> getData();
	void setData(List<Comment> comments);
	
	int getCount();
	void setCount(int count);

}
