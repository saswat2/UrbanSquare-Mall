package com.urbansquaremall.service.impl;

import java.util.List;

import com.urbansquaremall.dao.StoreManagerDAO;
import com.urbansquaremall.dao.impl.StoreManagerDAOImpl;
import com.urbansquaremall.model.StoreManager;
import com.urbansquaremall.service.StoreManagerService;

public class StoreManagerServiceImpl implements StoreManagerService {

    private StoreManagerDAO storeManagerDAO;

    public StoreManagerServiceImpl() {
        storeManagerDAO = new StoreManagerDAOImpl();
    }

    @Override
    public boolean addStoreManager(StoreManager storeManager) {
        return storeManagerDAO.addStoreManager(storeManager);
    }

    @Override
    public StoreManager getStoreManagerById(int managerId) {
        return storeManagerDAO.getStoreManagerById(managerId);
    }

    @Override
    public List<StoreManager> getAllStoreManagers() {
        return storeManagerDAO.getAllStoreManagers();
    }

    @Override
    public boolean updateStoreManager(StoreManager storeManager) {
        return storeManagerDAO.updateStoreManager(storeManager);
    }

    @Override
    public boolean deleteStoreManager(int managerId) {
        return storeManagerDAO.deleteStoreManager(managerId);
    }
}