package com.urbansquaremall.ui;

import com.urbansquaremall.model.Movie;

public class TestMovie {

	public static void main(String[] args ) {
		Movie movie = new Movie(101, "Avengers Endgame", "English", "Action", 181);
		
		System.out.println(movie);
	}
}
