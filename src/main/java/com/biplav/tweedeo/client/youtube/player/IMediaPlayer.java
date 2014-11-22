package com.biplav.tweedeo.client.youtube.player;

public interface IMediaPlayer {

	void loadMedia(String mediaURL);

	void playMedia();

	void stopMedia();

	void pauseMedia();

	int getMediaDuration();

	int getPlayPosition();

	void setPlayPosition(int position);

	int getVolume();

	void setVolume(int volume);

	int getVideoHeight();

	int getVideoWidth();
}
