package com.urbansquaremall.ui;
import java.time.LocalDate;
import java.time.LocalTime;
import com.urbansquaremall.model.Show;

public class TestShow {
	public static void main(String[] args ) {
		Show show = new Show(1001, 101, 1, LocalDate.of(2026, 8, 12), LocalTime.of(18, 30),LocalTime.of(21, 31) , 250.0);
		
		System.out.println(show);
		
	}

}
