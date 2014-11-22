package com.biplav.tweedeo.client.EPG;

import java.util.ArrayList;
import java.util.Comparator;

import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.utils.Logger;

public class ScoreComparator implements Comparator<IVideo> {
	
	private ArrayList<String> userIdList;

	public ScoreComparator(ArrayList<String> userIdList) {
		this.userIdList = userIdList;
	}

	public int compare(IVideo video1, IVideo video2) {
		if((userIdList != null) && userIdList.contains(video1.getPost().getFrom().getId())) {
			Logger.log("ScoreComparator.compare()" + video1.getPost().getFrom().getId() + " " + video1.getBeedioScore());
			video1.setBeedioScore((int) (video1.getBeedioScore() * (.75)));
			Logger.log("ScoreComparator.compare() " +video1.getBeedioScore());
		}
		if(video1.getBeedioScore() < video2.getBeedioScore())
			return 1;
		else if(video1.getBeedioScore() == video2.getBeedioScore())
			return 0;
		else return -1;
	}
}
