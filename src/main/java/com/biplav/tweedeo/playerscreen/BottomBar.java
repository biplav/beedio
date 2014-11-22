package com.biplav.tweedeo.playerscreen;

import com.biplav.tweedeo.client.EPG.EPGConfig;
import com.biplav.tweedeo.client.EPG.EPGManager;
import com.biplav.tweedeo.client.EPG.events.VideoPausePlayEvent;
import com.biplav.tweedeo.client.EPG.events.VideoReloadEvent;
import com.biplav.tweedeo.client.EPG.events.VideoShareEvent;
import com.biplav.tweedeo.client.EPG.events.VideoSkippedEvent;
import com.biplav.tweedeo.facebook.models.Post;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class BottomBar extends FocusPanel{

	private FocusPanel focusBox;
	private Image user;
	Label title;
	private HorizontalPanel mainPanel;
	private Image next;
	private Image pause;
	private Image plus;
	private Image reload;
	
	

	private void fireNextVideo() {
		Logger.log("Tweedeo.onModuleLoad().new KeyboardListener() {...}.onKeyUp() Next Video");
		if(EPGManager.isNext)
			StateMachine.eventBus.fireEvent(new VideoSkippedEvent());
	}
	
	private void firePauseVideo() {
		Logger.log("Tweedeo.onModuleLoad().new KeyboardListener() {...}.onKeyUp() Pause Video");
		StateMachine.eventBus.fireEvent(new VideoPausePlayEvent());
	}

	private void fireShareVideo() {
		Logger.log("Tweedeo.onModuleLoad().new KeyboardListener() {...}.onKeyUp() Share Video");
		StateMachine.eventBus.fireEvent(new VideoShareEvent());
	}
	
	private void fireReloadVideo() {
		Logger.log("Tweedeo.onModuleLoad().new KeyboardListener() {...}.onKeyUp() Share Video");
		StateMachine.eventBus.fireEvent(new VideoReloadEvent());
		
	}

	public BottomBar() {
		super();
		mainPanel = new HorizontalPanel();
		user = new Image();
		user.setHeight(EPGConfig.bottomBarHeight);
		user.setWidth(EPGConfig.bottomBarHeight);
		user.setStyleName("logoBar");
		
		title = new Label();
		title.setStyleName("titleBar");
		title.setHeight(EPGConfig.bottomBarHeight);
		//title.setWidth("60%");
		
		pause = new Image();
		pause.setWidth("50");
		pause.setHeight("50");
		pause.setAltText("Pause");
		pause.setStyleName("pause");
		pause.setUrl("images/pause.png");
		pause.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				firePauseVideo();
			}
		});
		
		plus = new Image();
		plus.setWidth("50");
		plus.setHeight("50");
		plus.setAltText("Share");
		plus.setStyleName("plus");
		plus.setUrl("images/share.png");
		
		reload = new Image();
		reload.setWidth("50");
		reload.setHeight("50");
		reload.setAltText("Reload");
		reload.setStyleName("reload");
		reload.setUrl("images/rewind.png");
		reload.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				fireReloadVideo();
			}

			
		});
		
		
		next = new Image();
		next.setUrl("images/next.png");
		next.setWidth("50");
		next.setHeight("50");
		next.setAltText("Next");
		next.setStyleName("next");
		next.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				fireNextVideo();
			}
		});
		
		next.setVisible(false);
		pause.setVisible(true);
		plus.setVisible(true);
		
		
		mainPanel.add(user);
		mainPanel.add(title);
		mainPanel.add(pause);
		mainPanel.add(next);
		mainPanel.add(plus);
		mainPanel.add(reload);
		
		this.add(mainPanel);
		mainPanel.setHeight(EPGConfig.bottomBarHeight);
		mainPanel.setWidth(EPGConfig.bottomBarWidth);
		
		this.setHeight(EPGConfig.bottomBarHeight);
		this.setWidth(EPGConfig.bottomBarWidth);
		this.setStyleName("bottomBar");
		this.addKeyUpHandler(new KeyUpHandler() {

			public void onKeyUp(KeyUpEvent event) {
				if(event.getNativeKeyCode() == KeyCodes.KEY_RIGHT) {
					fireNextVideo();
				} else if(event.getNativeKeyCode() == KeyCodes.KEY_DOWN) {
					firePauseVideo();
				} else if(event.getNativeKeyCode() == KeyCodes.KEY_UP) {
					fireShareVideo();
				} else if(event.getNativeKeyCode() == KeyCodes.KEY_LEFT) {
					fireReloadVideo();
				}
			}

		});
		
		focusBox = this;
		this.addBlurHandler(new BlurHandler() {
			
			public void onBlur(BlurEvent event) {
				focusBox.setFocus(true);
			}
		});
	}
	
	private String getTitle(Post post) {
		String title = "";
		if(post.getMessage() != null && !title.contains(post.getMessage())) title = title+" "+ post.getMessage();
		if(post.getDescription() != null && !title.contains(post.getDescription())) title = title+" "+ post.getDescription();
		if(post.getName() != null && !title.contains(post.getName())) title = title+" "+ post.getName();
		if(post.getCaption() != null && !title.contains(post.getCaption())) title = title+" "+ post.getCaption();
		if(post.getStory() != null && !title.contains(post.getStory())) title = title+" "+ post.getStory();
		if(title == "") title = title + post.getLink();
		return title;
	}
	public void populateData(Post post) {
		if(post == null) return;
		title.setText(getTitle(post));
		
		String imageUrl = "https://graph.facebook.com/"
				+ (post.getFrom().getId()) + "/picture";
		user.setUrl(imageUrl);
	}

	public void getFocus() {
		Logger.log("BottomBar.getFocus()");
		this.setFocus(true);
	}
	
	public void activateNext() {
		next.setVisible(true);
		//next.setEnabled(true);
		EPGManager.isNext=true;
	}
	
	public void deactivateNext() {
		next.setVisible(false);
		EPGManager.isNext=false;
	}
	
	public void usePause() {
		pause.setUrl("images/pause.png");
	}
	
	public void usePlay() {
		pause.setUrl("images/play.png");
	}
}
