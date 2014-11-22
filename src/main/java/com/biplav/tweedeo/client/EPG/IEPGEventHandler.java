package com.biplav.tweedeo.client.EPG;

import com.biplav.tweedeo.client.EPG.events.ActivateNextEvent;
import com.biplav.tweedeo.client.EPG.events.VideoAddedEvent;
import com.biplav.tweedeo.client.EPG.events.VideoEndedEvent;
import com.biplav.tweedeo.client.EPG.events.VideoPausePlayEvent;
import com.biplav.tweedeo.client.EPG.events.VideoReloadEvent;
import com.biplav.tweedeo.client.EPG.events.VideoShareEvent;
import com.biplav.tweedeo.client.EPG.events.VideoSkippedEvent;
import com.biplav.tweedeo.client.EPG.events.YoutubePlayerLoadedEvent;
import com.biplav.tweedeo.client.youtube.player.events.YoutubeNewVideoEvent;
import com.google.gwt.event.shared.EventHandler;

public interface IEPGEventHandler extends EventHandler {
	void onNewVideo(YoutubeNewVideoEvent youtubeNewVideoEvent);
	void onVideoEnded(VideoEndedEvent videoEndedEvent);
	void onActivateNextEvent(ActivateNextEvent sctivateNextEvent);
	void onVideoAddedEvent(VideoAddedEvent videoAddedEvent);
	void onVideoPausePlayEvent(VideoPausePlayEvent videoPausePlayEvent);
	void onYoutubePlayerLoadedEvent(
			YoutubePlayerLoadedEvent youtubePlayerLoadedEvent);
	void onVideoSkippedEvent(VideoSkippedEvent videoSkippedEvent);
	void onVideoShareEvent(VideoShareEvent videoShareEvent);
	void onVideoReloadEvent(VideoReloadEvent videoReloadEvent);

}
