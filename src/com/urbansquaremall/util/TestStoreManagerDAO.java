package com.urbansquaremall.util;

import com.urbansquaremall.dao.StoreManagerDAO;
import com.urbansquaremall.dao.impl.StoreManagerDAOImpl;
import com.urbansquaremall.model.StoreManager;

public class TestStoreManagerDAO {

    public static void main(String[] args) {

        StoreManagerDAO storeManagerDAO = new StoreManagerDAOImpl();

        // ADD
        StoreManager manager = new StoreManager(
                0,
                "Rahul Sharma",
                "9876543210",
                "rahul@gmail.com",
                7
        );

        boolean addResult = storeManagerDAO.addStoreManager(manager);

        System.out.println("Store Manager added: " + addResult);


        // READ ONE
        StoreManager foundManager =
                storeManagerDAO.getStoreManagerById(1);

        System.out.println("Store Manager found: " + foundManager);


        // READ ALL
        System.out.println("All Store Managers:");

        for (StoreManager m : storeManagerDAO.getAllStoreManagers()) {
            System.out.println(m);
        }


        // UPDATE
        StoreManager updatedManager = new StoreManager(
                1,
                "Rahul Sharma Updated",
                "9876543211",
                "rahul.updated@gmail.com",
                7
        );

        boolean updateResult =
                storeManagerDAO.updateStoreManager(updatedManager);

        System.out.println("Store Manager updated: " + updateResult);

        StoreManager afterUpdate =
                storeManagerDAO.getStoreManagerById(1);

        System.out.println("Updated Store Manager: " + afterUpdate);


        // DELETE
        boolean deleteResult =
                storeManagerDAO.deleteStoreManager(1);

        System.out.println("Store Manager deleted: " + deleteResult);

        StoreManager afterDelete =
                storeManagerDAO.getStoreManagerById(1);

        System.out.println("Store Manager after delete: " + afterDelete);
    }
}