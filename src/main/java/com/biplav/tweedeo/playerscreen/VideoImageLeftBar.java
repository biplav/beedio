package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.EPGConfig;
import com.biplav.tweedeo.client.EPG.PlayList;
import com.biplav.tweedeo.facebook.models.Comment;
import com.biplav.tweedeo.facebook.models.Comments;
import com.biplav.tweedeo.facebook.models.FacebookUserDetails;
import com.biplav.tweedeo.facebook.models.Likes;
import com.biplav.tweedeo.facebook.models.Post;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class VideoImageLeftBar extends VerticalPanel {
	
	private Label socialText;
	private HorizontalPanel socialCollage;

	protected VideoImageLeftBar(Post post, int bScore) {
		super();
		int height=0;
		socialText = new Label();
		socialText.setStyleName("commentsTextBar");
		socialText.setSize("100px","100%");

		socialCollage = new HorizontalPanel();
		socialCollage.setSize("100px", "100%");
		int likeCount = populateSocialCollage(post.getLikes());
		int sharesCount = populateSocialCollage(post.getShare());
		int commentCount =populateSocialCollage(post.getComments());
		socialText.setText(getSocialText(likeCount, sharesCount, commentCount,bScore));
		this.add(socialText);
		this.add(socialCollage);
		height = height + socialText.getOffsetHeight();
		height = height + socialCollage.getOffsetHeight();
		this.setSize("75px",height+"px");
	}
	
	private String getSocialText(int like,int share, int comment, int bScore) {
		String socialText = "";
		if(like > 0) {
			socialText = socialText + like + " likes. \n";	
		}
		if(share > 0) {
			socialText = socialText + share + " shares. \n";	
		}
		if(comment > 0) {
			socialText = socialText + comment + " comments.";	
		}
		socialText = socialText + " and BScore is " + bScore;
		return socialText;
		
	}

	private int populateSocialCollage(Comments comments) {
		int commentCount = 0;
		
		if (comments != null && comments.getData() != null) {
			commentCount = comments.getCount();
			for (Comment comment : comments.getData()) {
				Image commentUser = new Image("https://graph.facebook.com/"
						+ comment.getFrom().getId() + "/picture");
				commentUser.setAltText(comment.getFrom().getName());
				commentUser.setSize("25px", "25px");
				socialCollage.add(commentUser);
			}
		}
		return commentCount;
	}

	private int populateSocialCollage(Likes likes) {
		int likeCount = 0;
		if (likes != null) {
			likeCount = likes.getCount();
			if (likes.getData() != null) {
				for (FacebookUserDetails user : likes.getData()) {
					Image liker = new Image("https://graph.facebook.com/"
							+ user.getId() + "/picture");
					liker.setAltText(user.getName());
					liker.setSize("25px", "25px");
					socialCollage.add(liker);
				}
			}
		}
		return likeCount;
	}

}
