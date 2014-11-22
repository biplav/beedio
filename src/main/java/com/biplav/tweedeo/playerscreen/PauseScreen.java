package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.EPGConfig;
import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.facebook.models.Post;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PauseScreen extends HorizontalPanel {

	private VerticalPanel listings;
	private VerticalPanel videoDetails;
	//private VerticalPanel beedioArea;
	
	//private Label videoCueDetails;
	private Label videoPosition;
	private VideoImageBar videoImage;
	
	public void initiateCueDetails(int percentage,int position,int total) {
		/*if(videoCueDetails == null) return;
		videoCueDetails.setText(percentage+"% of video has been cued.");*/
		if(videoImage != null)
			videoImage.updateSlider(percentage, position, total);
	}
	
	public void updateVideoPositionDetails(int position,int total) {
		if(videoPosition == null) return;
		videoPosition.setText(position+" of " +total);
	}

	public PauseScreen(IVideo video) {
		super();
		this.setSize(EPGConfig.playerWidth+"px", EPGConfig.playerHeight+"px");
		if(video == null) return;
		

		listings = new VerticalPanel();
		listings.setSize("10%", "100%");
		listings.add(new Label("Empty..........."));
		this.add(listings);

		if (video != null) {
			Post post =video.getPost();
			videoDetails= new VerticalPanel();
			videoImage = new VideoImageBar(video);
			videoDetails.setSize("60%", "100%");
			videoDetails.add(videoImage);
						
			/*Creating video Player*/
			
			/*videoCueDetails = new Label();
			videoCueDetails.setText(YoutubePlayerEventHandler.player.getVideoLoadedPercentage() + "% of video is been loaded.");
			videoCueDetails.setStyleName("commentsTextBar");
			videoDetails.add(videoCueDetails);
			
			 Video Ticker 
			videoPosition = new Label();
			videoPosition.setStyleName("commentsTextBar");
			videoPosition.setText("0 of 0 has been watched");
			videoDetails.add(videoPosition);*/
			
			
			this.add(videoDetails);
			
		}

	}

	public void updateVideoCueDetails(int videoLoadedPercentage) {
		videoImage.updateSlider(videoLoadedPercentage);
	}

}
