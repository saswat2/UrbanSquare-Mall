package com.urbansquaremall.dao;

import java.util.List;

import com.urbansquaremall.model.StoreManager;

public interface StoreManagerDAO {

    boolean addStoreManager(StoreManager storeManager);

    StoreManager getStoreManagerById(int managerId);

    List<StoreManager> getAllStoreManagers();

    boolean updateStoreManager(StoreManager storeManager);

    boolean deleteStoreManager(int managerId);
}