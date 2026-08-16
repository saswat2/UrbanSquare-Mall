package com.urbansquaremall.model;

public class Seat {
	private int seatId;
	private int screenId;
	private String seatNumber;
	private String seatType;
	private String status;
	
	public Seat(int seatId, int screenId, String seatNumber,String seatType,String status) {
		
		this.seatId = seatId;
		this.screenId = screenId;
		this.seatNumber = seatNumber;
		this.seatType =seatType;
		this.status = status;
		
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", screenId=" + screenId + ", seatNumber=" + seatNumber + ", seatType="
				+ seatType + ", status=" + status + "]";
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
