package com.urbansquaremall.model;
import java.time.LocalDateTime;


public class MallVisit {
	
	private int visitId;
	private int customerId;
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private String vehicleType;
	
	public MallVisit(int visitId,int customerId,LocalDateTime entryTime,LocalDateTime exitTime,String vehicleType) {
		
		this.visitId = visitId;
		this.customerId = customerId;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.vehicleType = vehicleType;
		
	}

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	@Override
	public String toString() {
		return "MallVisit [visitId=" + visitId + ", customerId=" + customerId + ", entryTime=" + entryTime
				+ ", exitTime=" + exitTime + ", vehicleType=" + vehicleType + "]";
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	

}
