package com.biplav.tweedeo.client.EPG;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.biplav.tweedeo.client.EPG.events.ActivateNextEvent;
import com.biplav.tweedeo.client.EPG.events.VideoAddedEvent;
import com.biplav.tweedeo.client.video.IVideo;
import com.biplav.tweedeo.stateMachine.StateMachine;
import com.biplav.tweedeo.utils.GetObject;
import com.biplav.tweedeo.utils.Logger;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.storage.client.StorageMap;

public class PlayListManager {

	/*
	 * Having a simple playList which can be later used by channels.
	 */

	private PlayList playlist;

	//private int index = 0;
	private boolean isEmpty = true;
	private Storage viewedStore = null;
	private StorageMap viewedStoreMap;
	private boolean isStorageSupported = false;
	private boolean exhauseted = false;
	
	//TODO: need userId over here.
	protected PlayListManager() {
		super();
		playlist = new PlayList();
		initStorage();
	}
	
	private void initStorage() {
		isStorageSupported = checkStorageSupported();
		Logger.log("Storage is " + isStorageSupported);
		try {
		if(isStorageSupported) {
			long time = System.currentTimeMillis();
			for(String key: viewedStoreMap.keySet()){
				try {
				playlist.put(key, GetObject.getObject(IVideo.class, viewedStoreMap.get(key)));
				StateMachine.eventBus.fireEvent(new VideoAddedEvent(playlist.size()));
				} catch(Throwable e) {
					viewedStoreMap.remove(key);
					Logger.exception(e);
					Logger.log("Looks like invalid JSON" + viewedStoreMap.get(key));
				}
			}
			Logger.log("_______Time taken is " + (System.currentTimeMillis() - time) + " size of the playlist is " + playlist.size());
		}
		} catch(Exception e) {
			Logger.exception(e);
		} catch(Throwable e) {
			Logger.exception(e);
		}
	}

	public void addToPlayList(IVideo video) {
		Logger.log("PlayList.addToPlayList() added" + video.getUrl());
		if(isStorageSupported) video = checkInStorage(video.getUrl()+"?userId="+video.getUserId(), video);
		playlist.put(video.getUrl(), video);
		if(isEmpty) {
			StateMachine.eventBus.fireEvent(new ActivateNextEvent());
			isEmpty=false;
		}
		StateMachine.eventBus.fireEvent(new VideoAddedEvent(playlist.size()));
	}

	private IVideo checkInStorage(String url,IVideo video) {
		  if (viewedStoreMap.containsKey(url)== true){
			  video = (IVideo) GetObject.getObject(IVideo.class, viewedStoreMap.get(url));
		  } else {
			  video.setStatus(IVideo.NEW);
			 addInStorage(url, video.toString());
		  }
		return video;
	}

	private boolean checkStorageSupported() {
		viewedStore = Storage.getLocalStorageIfSupported();
		if(viewedStore == null) return false;
		viewedStoreMap = new StorageMap(viewedStore);
		return true;
	}
	
	private void addInStorage(String url,String video) {
		Logger.log(video);
		viewedStore.removeItem(url);
		viewedStore.setItem(url,video);
		return;
	}

/*	public IVideo getVideoOld() {
		Object[] videoList = playlist.keySet().toArray();
		if(!exhauseted) {
		IVideo video= getVideoByStatus(videoList,IVideo.NEW);
		exhauseted = (video == null);
		return video;
		}
		return getVideoByStatus(videoList, IVideo.WATCHED);
	}*/
	
	public void updateVideoStatus(IVideo video, String status) {
		if(video == null) return;
		video.setStatus(status);
		String vid = GetObject.toJSON(video);
		addInStorage(video.getUrl()+"?userId="+video.getUserId(),vid);
	}
	
	public IVideo getVideo() {
		return playlist.get();
	}

/*	private IVideo getVideoByStatus(Object[] videoList, String status) {
		while(videoList.length > (index + 1)) {
			IVideo video = (IVideo) playlist.get(videoList[index++]);
			if(video.getStatus().equalsIgnoreCase(status)) {
				video.setStatus(IVideo.WATCHED);
				String vid = GetObject.toJSON(video);
				addInStorage(video.getUrl()+"?userId="+video.getUserId(),vid);
				StateMachine.eventBus.fireEvent(new VideoAddedEvent(playlist.size()-index));
				return video;
			}
		}
		return null;
	}
*/	
	public int getSize() {
		return playlist.getCurrentPlayListSize();
	}

	public void updateScore(String userId) {
		playlist.addUserId(userId);
		
	}
}
