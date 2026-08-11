package com.urbansquaremall.model;

public class PurchaseItem {

	private int purchaseItemId;
	private int purchaseId;
	private int productId;
	private int quantity;
	private double unitPrice;
	
	public PurchaseItem(int purchaseItemId,int purchaseId,int productId,int quantity,double unitPrice) {
		this.purchaseItemId =  purchaseItemId;
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		
		
	}

	@Override
	public String toString() {
		return "PurchaseItem [purchaseItemId=" + purchaseItemId + ", purchaseId=" + purchaseId + ", productId="
				+ productId + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

	public int getPurchaseItemId() {
		return purchaseItemId;
	}

	public void setPurchaseItemId(int purchaseItemId) {
		this.purchaseItemId = purchaseItemId;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
