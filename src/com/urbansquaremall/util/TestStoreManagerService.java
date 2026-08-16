package com.urbansquaremall.util;

import com.urbansquaremall.model.StoreManager;
import com.urbansquaremall.service.StoreManagerService;
import com.urbansquaremall.service.impl.StoreManagerServiceImpl;

public class TestStoreManagerService {

    public static void main(String[] args) {

        StoreManagerService service =
                new StoreManagerServiceImpl();

        // ADD
        StoreManager manager = new StoreManager(
                0,
                "Amit Kumar",
                "9876543225",
                "amit@gmail.com",
                7
        );

        boolean addResult = service.addStoreManager(manager);

        System.out.println("Store Manager added: " + addResult);


        // GET BY ID
        StoreManager foundManager =
                service.getStoreManagerById(2);

        System.out.println("Store Manager found: " + foundManager);


        // GET ALL
        System.out.println("All Store Managers:");

        for (StoreManager m : service.getAllStoreManagers()) {
            System.out.println(m);
        }
        
     // UPDATE

        StoreManager updatedManager = new StoreManager(
                2,
                "Amit Kumar Updated",
                "9876543226",
                "amit.updated@gmail.com",
                7
        );

        boolean updateResult =
                service.updateStoreManager(updatedManager);

        System.out.println("Store Manager updated: " + updateResult);

        StoreManager afterUpdate =
                service.getStoreManagerById(2);

        System.out.println("Updated Store Manager: " + afterUpdate);


        // DELETE

        boolean deleteResult =
                service.deleteStoreManager(2);

        System.out.println("Store Manager deleted: " + deleteResult);

        StoreManager afterDelete =
                service.getStoreManagerById(2);

        System.out.println("Store Manager after delete: " + afterDelete);
    }
}