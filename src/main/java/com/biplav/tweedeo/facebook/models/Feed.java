package com.biplav.tweedeo.facebook.models;

import java.util.List;

public interface Feed {
	List<Post> getData();
	void setData(List<Post> post);
	
	Paging getPaging();
	void setPaging(Paging paging);

}
