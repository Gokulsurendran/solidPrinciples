package com.ilp.utility;

import com.ilp.entity.Adventure;
import com.ilp.entity.Movie;
import com.ilp.interfaces.videoPlayer;
import com.ilp.service.videoPlayerManager;
public class NetflixUtility {

	public static void main(String[] args) {
		
		Movie adventure=new Adventure("Inception", "Mind-bending thriller", "inception.jpg", "inception.mp4", 1, "Christopher Nolan");
		adventure.play();
		videoPlayer videoplayer = new Movie("Inception", "Mind-bending thriller", "inception.jpg", "inception.mp4", 1, "Christopher Nolan");
		videoPlayerManager videoplayermanager = new videoPlayerManager(videoplayer);
		videoplayermanager.videoManage();
		
	}

}
