package com.urbansquaremall.dao;

import java.util.List;

import com.urbansquaremall.model.Store;

public interface StoreDAO {

    boolean addStore(Store store);

    Store getStoreById(int storeId);

    List<Store> getAllStores();

    boolean updateStore(Store store);

    boolean deleteStore(int storeId);
}