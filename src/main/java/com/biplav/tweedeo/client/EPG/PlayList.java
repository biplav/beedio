package com.biplav.tweedeo.client.EPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.facebook.models.Comments;
import com.biplav.tweedeo.facebook.models.Likes;
import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.utils.Logger;


public class PlayList extends HashMap<String, IVideo>{
	
	//allVideos Map
	//currentPlaylist
	
	ArrayList currentPlayList;
	private boolean isSortNeeded = false;
	ArrayList userIdList;
	
	public static int LIKES = 1;
	public static int COMMENTS = 100;
	public static int SHARES = 1000;
	

	protected PlayList() {
		super();
		currentPlayList  =new ArrayList<IVideo>();
		userIdList = new ArrayList<String>();
	}

	@Override
	public IVideo put(String key, IVideo video) {
		if(super.containsKey(key)) return super.put(key, video);
		else if(video.getStatus().equalsIgnoreCase(IVideo.NEW)) {
			int score = calcScore(video);
			video.setBeedioScore(score);
			currentPlayList.add(video);
			isSortNeeded = true;
		}
		return super.put(key, video);
	}

	private int calcScore(IVideo video) {
		int score = 0;
		Post post = video.getPost();
		if(post == null) return 0;
		Comments comments = post.getComments();
		Likes likes = post.getLikes();
		Likes share = post.getShare();
		if(comments != null)
			score = score + comments.getCount()*COMMENTS;
		if(likes != null)
			score = score + likes.getCount()*LIKES;
		if(share != null)
			score = score + share.getCount()*SHARES;
		return score;
	}
	
	public IVideo get() {

		if(isSortNeeded || (userIdList.size() > 0)) {
			Logger.log("PlayList.get() Sprting because " + isSortNeeded + " " + userIdList.size());
			Collections.sort(currentPlayList, new ScoreComparator(userIdList));
			userIdList = new ArrayList<String>();
		}
		IVideo video = (IVideo)currentPlayList.remove(0);
		//currentPlayList.remove(0);// remove(video);
		return video;
	}
	
	int getCurrentPlayListSize() {
		return currentPlayList.size();
	}

	public void addUserId(String userId) {
		userIdList.add(userId);	
	}


	
}


