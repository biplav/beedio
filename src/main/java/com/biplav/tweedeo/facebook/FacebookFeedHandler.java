package com.biplav.tweedeo.facebook;

import java.util.List;

import com.biplav.tweedeo.client.video.YoutubeVideo;
import com.biplav.tweedeo.client.youtube.player.events.YoutubeNewVideoEvent;
import com.biplav.tweedeo.facebook.models.Comment;
import com.biplav.tweedeo.facebook.models.Feed;
import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Logger;
import com.biplav.tweedeo.utils.UrlParser;
import com.google.gwt.event.shared.UmbrellaException;

public class FacebookFeedHandler {

	private Feed feed;

	public FacebookFeedHandler(Feed feed) {
		this.feed = feed;
	}

	public void process() {
		List<Post> wallPosts = feed.getData();
		Logger.log("FacebookFeedHandler.process() total post got"
				+ wallPosts.size());
		for (int i = 0; i < wallPosts.size(); i++) {
			Post post = wallPosts.get(i);
			processPost(post);
		}
	}

	private void processPost(Post post) {
		processMain(post);
		List<Comment> comments = post.getComments().getData();
		if (comments == null || comments.isEmpty())
			return;
		for (Comment comment : comments) {
			String message = comment.getMessage();
			if (checkForYoutube(message, post)) {
				// event would be fired here.
			}

		}

	}

	private void processMain(Post post) {
		try {
			String link = post.getLink();
			String source = post.getSource();
			String message = post.getMessage();
			String description = post.getDescription();
			if (checkForYoutube(link, post) || checkForYoutube(source, post)
					|| checkForYoutube(message, post)
					|| checkForYoutube(description, post)) {
				// Found.
			}
		} catch (Exception e) {
			Logger.exception(e);
		} catch (Throwable e) {
			Logger.exception(e);
		}
		return;
	}

	private boolean checkForYoutube(String link, Post post) {
		try {
			if (link == null || link.isEmpty())
				return false;

			if (link.contains("youtube"))
				Logger.log("FacebookFeedHandler.checkForYoutube() " + link);
			String id = UrlParser.getYoutubeMatches(link);
			if (id == null)
				return false;
			createVideo(id, post);
			return true;
		} catch (Exception e) {
			Logger.exception(e);
		} catch (Throwable e) {
			Logger.exception(e);
		}
		return false;
	}



	private boolean createVideo(String id, Post post) {
		Logger.log("FacebookFeedHandler.createVideo()~~~~~FacebookFeedHandler.processLink()" + id);
		// String id = UrlParser.getUrlProperties(url).get("v");
		if (id == null)
			return false;
		// TODO:Move firing to above function
		// TODO: id can be embedded send the entire URL
		YoutubeVideo ytVideo = new YoutubeVideo("http://www.youtube.com/v/"
				+ id, post, FacebookApi.fbCore.getUserId());
		try {
			StateMachine.eventBus.fireEvent(new YoutubeNewVideoEvent(ytVideo));
		} catch (Exception e) {
			Logger.exception(e);
		} catch (Throwable e) {
			Logger.exception(e);
		}
		return true;
	}

}
