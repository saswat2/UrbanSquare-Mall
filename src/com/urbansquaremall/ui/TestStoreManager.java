package com.urbansquaremall.ui;

import com.urbansquaremall.model.StoreManager;

public class TestStoreManager {

    public static void main(String[] args) {

      StoreManager manager = new StoreManager(1, "Rahul Kumar", "9876543210", "rahul@gmail.com", 101);
    	
      System.out.println(manager);
    }
}