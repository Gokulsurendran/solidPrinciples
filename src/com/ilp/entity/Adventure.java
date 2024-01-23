	package com.ilp.entity;
	
	public class Adventure extends Movie {
		private String subGenre;
		public Adventure(String title, String description, String imageUrl, String videoUrl, int genreId, String director,String subGenre) {
			super(title, description, imageUrl, videoUrl, genreId, director);
			this.subGenre=subGenre;
		}
	
	}
