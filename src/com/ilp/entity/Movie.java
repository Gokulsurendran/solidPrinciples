package com.ilp.entity;

import com.ilp.interfaces.videoPlayer;

public class Movie extends MediaDetails implements videoPlayer{
	private String director;
	public Movie(String title, String description, String imageUrl, String videoUrl, int genreId,String director) {
		super(title, description, imageUrl, videoUrl, genreId);
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public void play() {
		System.out.println("Playing movie: " + getTitle());
		
	}

	
}
