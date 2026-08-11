package com.urbansquaremall.ui;

import com.urbansquaremall.model.Customer;

public class TestCustomer {
	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Rahul Kumar", "9876543210", "rahul@gmail.com");
		System.out.println(customer);
	}

}
