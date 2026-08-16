package com.urbansquaremall.model;
import java.time.LocalDate;

public class MovieBooking {
	private int bookingId;
	private int customerId;
	private int showId;
	private LocalDate bookingDate;
	private double totalAmount;
	private String status;
	
	public MovieBooking(int bookingId,int customerId,int showId,LocalDate bookingDate,double totalAmount,String status) {
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.showId = showId;
		this.bookingDate = bookingDate;
		this.totalAmount = totalAmount;
		this.status = status;
		
	}

	@Override
	public String toString() {
		return "MovieBooking [bookingId=" + bookingId + ", customerId=" + customerId + ", showId=" + showId
				+ ", bookingDate=" + bookingDate + ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
