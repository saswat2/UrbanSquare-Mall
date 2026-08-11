package com.urbansquaremall.ui;
import com.urbansquaremall.model.Review;


public class TestReview {

	public static void main(String[] args) {
		Review review = new Review(1, 1, 501, 5, "Excellent mall experience");

		System.out.println(review);
	}

}
