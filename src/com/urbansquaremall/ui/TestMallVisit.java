package com.urbansquaremall.ui;
import java.time.LocalDateTime;
import com.urbansquaremall.model.MallVisit;

public class TestMallVisit {
	public static void main(String[] args) {
		
		MallVisit mallvisit = new MallVisit(501, 1, LocalDateTime.of(2026, 8, 11, 10, 0), null, "CAR");
		System.out.println(mallvisit);
	}

}
