package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.EPGConfig;
import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.facebook.models.Post;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class VideoImageBar extends HorizontalPanel {
	
	VideoImageLeftBar leftBar;
	public Slider videoSlider;
	
	public void updateSlider(int loaded,int position, int total) {
		videoSlider.updateSlider(loaded, position, total);
	}
	
	public void updateSlider(int loaded) {
		videoSlider.updateSlider(loaded);
	}

	protected VideoImageBar(IVideo video) {
		super();
		Post post = video.getPost();
		this.setSize(EPGConfig.pauseScreenImageBarWidth+"px","100%");
		leftBar = new VideoImageLeftBar(post,video.getBeedioScore());
		this.add(leftBar);
		
		VerticalPanel imagePanel = new VerticalPanel();
		String picture = post.getPicture();
		if(picture == null) picture = "http://graph.facebook.com/"+post.getFrom().getId()+"/picture";
		Image videoImage = new Image(picture);
		videoImage.setStyleName("videoImageBar");
		videoImage.setSize(EPGConfig.pauseScreenImageWidth+"px",EPGConfig.pauseScreenImageHeigth+"px");
		imagePanel.add(videoImage);
		
		Label videoCaption = new Label(post.getDescription());
		videoCaption.setStyleName("videoCaptionBar");
		imagePanel.add(videoCaption);
		
		TextArea enterCommentArea = new TextArea();
		enterCommentArea.setText("Write a comment here.. <currently disabled.>");
		enterCommentArea.setEnabled(true);
		enterCommentArea.setWidth("100%");
		imagePanel.add(enterCommentArea);
		
		videoSlider = new Slider("videoSlider");
		videoSlider.setSize("100%", "10px");
		//slider.add(videoSlider);
		
		imagePanel.add(videoSlider);
		
		this.add(imagePanel);
		
		
		VideoImageRigthBar commentBar = new VideoImageRigthBar(post.getComments());
		this.add(commentBar);
		
		
		
	}
	
	

}
