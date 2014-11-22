package com.biplav.tweedeo.client;


import org.junit.Test;

import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.client.video.YoutubeVideo;
import com.biplav.tweedeo.facebook.models.BeanFactory;
import com.biplav.tweedeo.facebook.models.GetObject;
import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.facebook.models.Property;
import com.biplav.tweedeo.facebook.models.Session;
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;
import com.google.web.bindery.autobean.shared.impl.AutoBeanCodexImpl;
import com.google.web.bindery.autobean.shared.impl.StringQuoter;
import com.google.web.bindery.autobean.shared.impl.AutoBeanCodexImpl.EncodeState;

public class TweedeoTest extends GWTTestCase{

	@Override
	public String getModuleName() {
		return "com.biplav.tweedeo.Tweedeo";
	}

	@Test
	public void testSession() {
		BeanFactory factory = GWT.create(BeanFactory.class);
		String response = "{\"status\": \"connected\",\"authResponse\": {\"accessToken\": \"abc\",\"expiresIn\":\"...\",\"signedRequest\":\"...\",\"userID\":\"...\"}}";
		//String response = "{\"status\": \"connected\",\"authResponse\": \"blah\"}";
		Session s = (AutoBeanCodex.decode(factory, Session.class, response)).as();
		System.out.println("TweedeoTest.test()" + s.getStatus());
		assertTrue(s.getStatus().equalsIgnoreCase("connected"));
		assertTrue(s.getAuthResponse().getAccessToken().equalsIgnoreCase("abc"));
	}
	
	@Test
	public void testProperties() {
		BeanFactory factory = GWT.create(BeanFactory.class);
		String response = "{\"name\": \"Source\",\"text\": \"kolkata - Google News\",\"href\": \"http://news.google.co.in/news?pz=1&ned=in&hl=en&q=kolkata\"}";
		Property s = (AutoBeanCodex.decode(factory, Property.class, response)).as();
		assertTrue(s.getName().equalsIgnoreCase("Source"));
	}
	
	@Test
	public void testYoutubeVideoToFroJson() {
		Post post = null;
		String postJson = "{   \"id\": \"642660238_10150775550130239\",      \"from\": {        \"name\": \"Biplav Saraf\",        \"id\": \"642660238\"      },      \"story\": \"Biplav Saraf is now friends with Santosh Godbole and Abhinav Srivastava.\",      \"story_tags\": {        \"0\": [          {            \"id\": 642660238,            \"name\": \"Biplav Saraf\",            \"offset\": 0,            \"length\": 12,            \"type\": \"user\"          }        ],        \"33\": [          {            \"id\": 100000194311765,            \"name\": \"Santosh Godbole\",            \"offset\": 33,            \"length\": 15,            \"type\": \"user\"          }        ],        \"53\": [          {            \"id\": 100000243367203,            \"name\": \"Abhinav Srivastava\",            \"offset\": 53,            \"length\": 18,            \"type\": \"user\"          }        ]      }}";
		post = GetObject.getObject(Post.class, postJson);
		IVideo video = new YoutubeVideo("123", post, "345");
		GWT.log("______TweedeoTest.testYoutubeVideoToJson()" +	video);
		IVideo vidz = GetObject.getObject(IVideo.class, video.toString());
		assertTrue((vidz.getUrl().equalsIgnoreCase("123")));
	}
	

}
