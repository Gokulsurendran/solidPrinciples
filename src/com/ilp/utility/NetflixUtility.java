package com.ilp.utility;

import com.ilp.entity.Adventure;
import com.ilp.entity.Movie;
import com.ilp.entity.Tvshows;
import com.ilp.interfaces.videoPlayer;
import com.ilp.service.videoPlayerManager;
public class NetflixUtility {

	public static void main(String[] args) {
		
		Adventure adventure=new Adventure("Inception", "Mind-bending thriller", "inception.jpg", "inception.mp4", 1, "Christopher Nolan","Science fiction");
		adventure.display();
		videoPlayer videoplayer = new Tvshows("Breaking Bad", "Crime Drama","breakingbad.jpg", "breakingbad.mp4", 2, 5);
		videoPlayerManager videoplayermanager = new videoPlayerManager(videoplayer);
		videoplayermanager.videoManage();
		
	}

}
