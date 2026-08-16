package com.urbansquaremall.ui;
import java.time.LocalDate;
import com.urbansquaremall.model.MovieBooking;
public class TestMovieBooking {
	public static void main(String[] args) {
		
		MovieBooking movieBooking = new MovieBooking(5001, 1, 1001,LocalDate.of(2026, 8, 12) , 500.0, "CONFIRMED");
		
		System.out.println(movieBooking);
		
	}

}
