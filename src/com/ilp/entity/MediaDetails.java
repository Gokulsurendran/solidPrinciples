package com.ilp.entity;

import com.ilp.interfaces.displayContent;

public class MediaDetails implements displayContent{
	private String title;
	private String description;
    private String imageUrl;
    private String videoUrl;
    private int genreId;	

	public MediaDetails(String title, String description, String imageUrl, String videoUrl, int genreId) {
		super();
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
		this.videoUrl = videoUrl;
		this.genreId = genreId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("imageUrl: " +imageUrl);
        System.out.println("videoUrl: " +videoUrl);
        System.out.println("genreId: " +genreId);
	}

}
