package com.biplav.tweedeo.facebook.models;

import java.util.List;

public interface Post{
	
	String getId();
	void setId(String id);
	
	FacebookUserDetails getFrom();
	void setFrom(FacebookUserDetails from);
	
	List<FacebookUserDetails> getTo();
	void setTo(List<FacebookUserDetails> toList);
	
	String getMessage();
	void setMessage(String message);
	
	//TODO: to be implemented later
	String getMessage_tags();
	void setMessage_tags(String message_tags);
	
	String getPicture();
	void setPicture(String picture);
	
	String getLink();
	void setLink(String link);
	
	String getName();
	void setName(String name);
	
	String getCaption();
	void setCaption(String caption);
	
	String getDescription();
	void setDescription(String decription);
	
	//Contains video url
	String getSource();
	void setSource(String source);
	
	//Contains video properties. Don't think would need this, flowplayer sd have the data. 
	List<Property> getProperties();
	void setProperties(List<Property> properties);
	
	String getIcon();
	void setIcon(String icon);
	
	List<Action> getActions();
	void setActions(List<Action> actions);
	
	//Needed only while posting. 
	//TODO: IN next cycle
	String getPrivacy();
	void setPrivacy(String privacy);
	
	String getType();
	void setType(String type);
	
	public static String LINK = "link";
	public static String PHOTO = "photo";
	public static String VIDEO = "video";
	public static String STATUS = "status";
	
	Likes getLikes();
	void setLikes(Likes likes);
	
	String getPlace();
	void setPlace(String place);

	void setStory(String story);
	String getStory();

	//TODO:Define a tag object which could be used by this and message_tag
	String getStory_tags();
	void setStory_tags(String story_tags);
	
	Comments getComments();
	void setComments(Comments comments);
	
	String getObject_id();
	void setObject_id(String object_id);
	
	Application getApplication();
	void setApplication(Application application);
	
	String getCreated_time();
	void setCreated_time(String created_time);
	
	String getUpdated_time();
	void setUpdated_time(String updated_time);
	
	Likes getShare();
	void setShare(Likes likes);
	
}
