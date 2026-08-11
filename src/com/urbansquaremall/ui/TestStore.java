package com.urbansquaremall.ui;
import com.urbansquaremall.model.Store;

public class TestStore {
	public static void main(String []args) {
		
		Store store = new Store (101,"Croma","Electronics", 2, "F2-205","9876543210","ACTIVE");
		
		
		System.out.println(store.getStoreId());
		System.out.println(store.getStoreName());
		System.out.println(store.getStoreType());
		System.out.println(store.getFloorNumber());
		System.out.println(store.getShopNumber());
		System.out.println(store.getContactNumber());
		System.out.println(store.getStatus());
		
		System.out.println(store);
				
		
		
	}
}
