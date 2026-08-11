package com.urbansquaremall.model;

public class Review {
	private int reviewId;
	private int customerId;
	private int visitId;
	private int rating;
	private String comment;
	
	public Review(int reviewId,int customerId,int visitId,int rating,String comment) {
	
		this.reviewId = reviewId;
		this.customerId = customerId;
		this.visitId = visitId;
		this.rating = rating;
		this.comment = comment;
		
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", customerId=" + customerId + ", visitId=" + visitId + ", rating="
				+ rating + ", comment=" + comment + "]";
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
