package com.urbansquaremall.ui;

import com.urbansquaremall.model.PurchaseItem;

public class TestPurchaseItem {
	public static void main(String[] args) {
		PurchaseItem purchaseItem = new PurchaseItem(1, 1001, 501, 2, 55000.0);
		
		System.out.println(purchaseItem);
	}

}
