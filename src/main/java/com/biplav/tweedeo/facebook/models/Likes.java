package com.biplav.tweedeo.facebook.models;

import java.util.List;

public interface Likes {
	
	List<FacebookUserDetails> getData();
	void setData(List<FacebookUserDetails> data);
	
	int getCount();
	void setCount(int count);

}
