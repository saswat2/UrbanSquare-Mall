package com.urbansquaremall.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.urbansquaremall.dao.StoreManagerDAO;
import com.urbansquaremall.model.StoreManager;
import com.urbansquaremall.util.DBConnection;

public class StoreManagerDAOImpl implements StoreManagerDAO {

    @Override
    public boolean addStoreManager(StoreManager storeManager) {

        String sql = "INSERT INTO store_manager "
                   + "(manager_name, store_id, contact_number, email) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, storeManager.getManagerName());
            ps.setInt(2, storeManager.getStoreId());
            ps.setString(3, storeManager.getContactNumber());
            ps.setString(4, storeManager.getEmail());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public StoreManager getStoreManagerById(int managerId) {

        String sql = "SELECT * FROM store_manager WHERE manager_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, managerId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new StoreManager(
                        rs.getInt("manager_id"),
                        rs.getString("manager_name"),
                        rs.getString("contact_number"),
                        rs.getString("email"),
                        rs.getInt("store_id")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<StoreManager> getAllStoreManagers() {

        List<StoreManager> managers = new ArrayList<>();

        String sql = "SELECT * FROM store_manager ORDER BY manager_id";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                StoreManager manager = new StoreManager(
                        rs.getInt("manager_id"),
                        rs.getString("manager_name"),
                        rs.getString("contact_number"),
                        rs.getString("email"),
                        rs.getInt("store_id")
                );

                managers.add(manager);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return managers;
    }

    @Override
    public boolean updateStoreManager(StoreManager storeManager) {

        String sql = "UPDATE store_manager SET "
                   + "manager_name = ?, "
                   + "store_id = ?, "
                   + "contact_number = ?, "
                   + "email = ? "
                   + "WHERE manager_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, storeManager.getManagerName());
            ps.setInt(2, storeManager.getStoreId());
            ps.setString(3, storeManager.getContactNumber());
            ps.setString(4, storeManager.getEmail());
            ps.setInt(5, storeManager.getManagerId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteStoreManager(int managerId) {

        String sql = "DELETE FROM store_manager WHERE manager_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, managerId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}