package com.urbansquaremall.util;

import java.util.List;

import com.urbansquaremall.model.Store;
import com.urbansquaremall.service.StoreService;
import com.urbansquaremall.service.impl.StoreServiceImpl;

public class TestStoreService {

    public static void main(String[] args) {

        StoreService storeService = new StoreServiceImpl();

        // ADD STORE
        Store store = new Store(
                0,
                "Croma",
                "ELECTRONICS",
                2,
                "F-205",
                "9876543211",
                "ACTIVE"
        );

        boolean result = storeService.addStore(store);

        System.out.println("Store added: " + result);

        // GET STORE BY ID
        Store foundStore = storeService.getStoreById(6);

        System.out.println("Store found: " + foundStore);

        // GET ALL STORES
        List<Store> stores = storeService.getAllStores();

        System.out.println("All Stores:");

        for (Store s : stores) {
            System.out.println(s);
        }
        
     // UPDATE STORE

        Store updatedStore = new Store(
                6,
                "Croma Electronics",
                "ELECTRONICS",
                2,
                "F-205",
                "9876543211",
                "ACTIVE"
        );

        boolean updateResult = storeService.updateStore(updatedStore);

        System.out.println("Store updated: " + updateResult);

        Store storeAfterUpdate = storeService.getStoreById(6);

        System.out.println("Updated Store: " + storeAfterUpdate);
        
     // DELETE STORE

        boolean deleteResult = storeService.deleteStore(6);

        System.out.println("Store deleted: " + deleteResult);

        Store deletedStore = storeService.getStoreById(6);

        System.out.println("Store after delete: " + deletedStore);
    }
}