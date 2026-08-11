package com.urbansquaremall.model;

public class Inventory {
	private int inventoryId;
	private int productId;
	private int storeId;
	private int quantity;
	
	public Inventory(int inventoryId,int productId,int storeId,int quantity) {
		this.inventoryId = inventoryId;
		this.productId = productId;
		this.storeId = storeId;
		this.quantity = quantity;

	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", productId=" + productId + ", storeId=" + storeId
				+ ", quantity=" + quantity + "]";
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
