package com.urbansquaremall.ui;
import java.time.LocalDateTime;

import com.urbansquaremall.model.Purchase;

public class TestPurchase {

	public static void main(String[] args) {
	Purchase purchase = new Purchase(1001, 1, 101, LocalDateTime.of(2026, 8, 11, 18, 30), 110000.0);	

	System.out.println(purchase);
	}

}
