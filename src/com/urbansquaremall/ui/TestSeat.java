package com.urbansquaremall.ui;

import com.urbansquaremall.model.Seat;

public class TestSeat {
	public static void main(String []args) {
		
		Seat seat = new Seat(1, 1, "A1", "REGULAR", "AVAILABLE");
	
		System.out.println(seat);
	}

}
