package com.urbansquaremall.model;

public class Screen {
	private int screenId;
	private String screenName;
	private int totalSeats;
	
	public Screen(int screenId, String screenName,int totalSeats) {
		this.screenId = screenId;
		this.screenName = screenName;
		this.totalSeats = totalSeats;
		
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", totalSeats=" + totalSeats + "]";
	}

}
