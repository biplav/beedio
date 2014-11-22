package com.biplav.tweedeo.utils;

import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.client.youtube.api.models.Entry;
import com.biplav.tweedeo.client.youtube.api.models.ICategory;
import com.biplav.tweedeo.client.youtube.api.models.IMediaDescription;
import com.biplav.tweedeo.client.youtube.api.models.IThumbnail;
import com.biplav.tweedeo.client.youtube.api.models.MediaGroup;
import com.biplav.tweedeo.client.youtube.api.models.Rating;
import com.biplav.tweedeo.client.youtube.api.models.VideoDetails;
import com.biplav.tweedeo.facebook.models.Action;
import com.biplav.tweedeo.facebook.models.Application;
import com.biplav.tweedeo.facebook.models.AuthResponse;
import com.biplav.tweedeo.facebook.models.Comment;
import com.biplav.tweedeo.facebook.models.Comments;
import com.biplav.tweedeo.facebook.models.FacebookUserDetails;
import com.biplav.tweedeo.facebook.models.Feed;
import com.biplav.tweedeo.facebook.models.Likes;
import com.biplav.tweedeo.facebook.models.Paging;
import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.facebook.models.Property;
import com.biplav.tweedeo.facebook.models.Session;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;


//@Category(YoutubeVideo.class)
public interface BeanFactory extends AutoBeanFactory {
	AutoBean<Session> session();
	AutoBean<AuthResponse> authResponse();
	AutoBean<Action> action();
	AutoBean<Comment> comment();
	AutoBean<Comments> comments();
	AutoBean<FacebookUserDetails> facebookUserDetails();
	AutoBean<Feed> feed();
	AutoBean<Paging> paging();
	AutoBean<Post> post();
	AutoBean<Property> property();
	AutoBean<Application> application();
	AutoBean<Likes> likes();
	AutoBean<IVideo> video();
	
	AutoBean<Entry> entry();
	AutoBean<ICategory> category();
	AutoBean<IMediaDescription> mediaDescription();
	AutoBean<IThumbnail> thumbnail();
	AutoBean<MediaGroup> media$Group();
	AutoBean<Rating> rating();
	AutoBean<VideoDetails> videoDetails();
	
}
