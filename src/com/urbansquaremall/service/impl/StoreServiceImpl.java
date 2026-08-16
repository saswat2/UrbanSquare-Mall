package com.urbansquaremall.service.impl;

import java.util.List;

import com.urbansquaremall.dao.StoreDAO;
import com.urbansquaremall.dao.impl.StoreDAOImpl;
import com.urbansquaremall.model.Store;
import com.urbansquaremall.service.StoreService;

public class StoreServiceImpl implements StoreService {

    private StoreDAO storeDAO = new StoreDAOImpl();

    @Override
    public boolean addStore(Store store) {
        return storeDAO.addStore(store);
    }

    @Override
    public Store getStoreById(int storeId) {
        return storeDAO.getStoreById(storeId);
    }

    @Override
    public List<Store> getAllStores() {
        return storeDAO.getAllStores();
    }

    @Override
    public boolean updateStore(Store store) {
        return storeDAO.updateStore(store);
    }

    @Override
    public boolean deleteStore(int storeId) {
        return storeDAO.deleteStore(storeId);
    }
}