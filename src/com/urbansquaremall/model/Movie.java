package com.urbansquaremall.model;

public class Movie {
	private int movieId;
	private String movieName;
	private String language;
	private String genre;
	private int duration;
	
	public Movie(int movieId,String movieName,String language,String genre,int duration) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.genre = genre;
		this.duration = duration;
		
		
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", genre=" + genre
				+ ", duration=" + duration + "]";
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
