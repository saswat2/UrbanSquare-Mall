package com.urbansquaremall.model;

public class BookingSeat {
	
	private int bookingSeatId;
	private int bookingId;
	private int seatId;
	private double seatPrice;
	
	public BookingSeat(int bookingSeatId,int bookingId,int seatId,double seatPrice) {
		
		this.bookingSeatId = bookingSeatId;
		this.bookingId = bookingId;
		this.seatId = seatId;
		this.seatPrice = seatPrice;
		
		
	}

	@Override
	public String toString() {
		return "BookingSeat [bookingSeatId=" + bookingSeatId + ", bookingId=" + bookingId + ", seatId=" + seatId
				+ ", seatPrice=" + seatPrice + "]";
	}

	public int getBookingSeatId() {
		return bookingSeatId;
	}

	public void setBookingSeatId(int bookingSeatId) {
		this.bookingSeatId = bookingSeatId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	

}
