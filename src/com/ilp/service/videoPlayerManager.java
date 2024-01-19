package com.ilp.service;

import com.ilp.interfaces.videoPlayer;

public class videoPlayerManager {
	private videoPlayer videoplayer;

	public videoPlayerManager(videoPlayer videoplayer) {
		this.videoplayer = videoplayer;
	}
	public void videoManage() {
		videoplayer.play();
	}
}
