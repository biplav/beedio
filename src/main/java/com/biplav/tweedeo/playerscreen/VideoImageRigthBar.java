package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.EPGConfig;
import com.biplav.tweedeo.facebook.models.Comment;
import com.biplav.tweedeo.facebook.models.Comments;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class VideoImageRigthBar extends VerticalPanel {

	protected VideoImageRigthBar(Comments comments) {
		super();
		int height=0;
		this.setSize(EPGConfig.pauseScreenImageRightBarWidth+"px","100%");
		if (comments != null && comments.getData() != null) {
			
			for (Comment comment : comments.getData()) {
				HorizontalPanel commentPanel = new HorizontalPanel();
				Image commentUser = new Image("https://graph.facebook.com/"
						+ comment.getFrom().getId() + "/picture");
				commentUser.setAltText(comment.getFrom().getName());
				commentUser.setStyleName("commentsImageBar");

				Label commentText = new Label(comment.getMessage());
				commentText.setStyleName("commentsTextBar");
				
				height = height+commentText.getOffsetHeight();
				commentPanel.add(commentUser);
				commentPanel.add(commentText);
				commentPanel.setVerticalAlignment(ALIGN_TOP);
				

				this.add(commentPanel);
			}
			this.setHeight(height+"px");
		}
	}

}
