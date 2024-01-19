package com.ilp.entity;

import com.ilp.interfaces.videoPlayer;

public class Tvshows extends MediaDetails implements videoPlayer{
	private int noOfSeasons;
	public Tvshows(String title, String description, String imageUrl, String videoUrl, int genreId,int noOfSeasons) {
		super(title, description, imageUrl, videoUrl, genreId);
		this.noOfSeasons = noOfSeasons;
	}
	
	public int getNoOfSeasons() {
		return noOfSeasons;
	}

	public void setNoOfSeasons(int noOfSeasons) {
		this.noOfSeasons = noOfSeasons;
	}

	@Override
	public void play() {
		System.out.println("Playing TvShow: " + getTitle());
	}


}
