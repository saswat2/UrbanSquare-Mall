package com.urbansquaremall.model;
import java.time.LocalDateTime;

public class Purchase {
	
	private int purchaseId;
	private int customerId;
	private int storeId;
	private LocalDateTime purchaseDate;
	private double totalAmount;
	
	public Purchase (int purchaseId,int customerId,int storeId,LocalDateTime purchaseDate,double totalAmount) {
	
		this.purchaseId = purchaseId;
		this.customerId = customerId;
		this.storeId = storeId;
		this.purchaseDate = purchaseDate;
		this.totalAmount = totalAmount;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", customerId=" + customerId + ", storeId=" + storeId
				+ ", purchaseDate=" + purchaseDate + ", totalAmount=" + totalAmount + "]";
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
