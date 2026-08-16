package com.urbansquaremall.util;

import com.urbansquaremall.dao.StoreDAO;
import com.urbansquaremall.dao.impl.StoreDAOImpl;
import com.urbansquaremall.model.Store;
import java.util.List;

public class TestStoreDAO {

    public static void main(String[] args) {

        Store store = new Store(
                0,
                "Nike",
                "FOOTWEAR",
                1,
                "G-101",
                "9876543210",
                "ACTIVE"
        );

        StoreDAO storeDAO = new StoreDAOImpl();

        boolean result = storeDAO.addStore(store);

        System.out.println("Store added: " + result);
        
        Store foundStore = storeDAO.getStoreById(1);

        System.out.println("Store found: " + foundStore);
        
        List<Store> stores = storeDAO.getAllStores();

        System.out.println("All Stores:");

        for (Store s : stores) {
            System.out.println(s);
        }
        
        Store updatedStore = new Store(
                1,
                "Nike Store",
                "SPORTS",
                1,
                "G-101",
                "9876543210",
                "ACTIVE"
        );

        boolean updateResult = storeDAO.updateStore(updatedStore);

        System.out.println("Store updated: " + updateResult);

        Store storeAfterUpdate = storeDAO.getStoreById(1);

        System.out.println("Updated Store: " + storeAfterUpdate);
        
        boolean deleteResult = storeDAO.deleteStore(1);

        System.out.println("Store deleted: " + deleteResult);

        Store deletedStore = storeDAO.getStoreById(1);

        System.out.println("Store after delete: " + deletedStore);
    }
}