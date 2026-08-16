package com.urbansquaremall.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.urbansquaremall.dao.StoreDAO;
import com.urbansquaremall.model.Store;
import com.urbansquaremall.util.DBConnection;

public class StoreDAOImpl implements StoreDAO {

    @Override
    public boolean addStore(Store store) {

        String sql = "INSERT INTO store "
                   + "(store_name, store_type, floor_number, shop_number, contact_number, status) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, store.getStoreName());
            preparedStatement.setString(2, store.getStoreType());
            preparedStatement.setInt(3, store.getFloorNumber());
            preparedStatement.setString(4, store.getShopNumber());
            preparedStatement.setString(5, store.getContactNumber());
            preparedStatement.setString(6, store.getStatus());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Store getStoreById(int storeId) {

        String sql = "SELECT * FROM store WHERE store_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, storeId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Store store = new Store(
                        resultSet.getInt("store_id"),
                        resultSet.getString("store_name"),
                        resultSet.getString("store_type"),
                        resultSet.getInt("floor_number"),
                        resultSet.getString("shop_number"),
                        resultSet.getString("contact_number"),
                        resultSet.getString("status")
                );

                return store;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Store> getAllStores() {

        String sql = "SELECT * FROM store";

        List<Store> stores = new ArrayList<>();

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Store store = new Store(
                        resultSet.getInt("store_id"),
                        resultSet.getString("store_name"),
                        resultSet.getString("store_type"),
                        resultSet.getInt("floor_number"),
                        resultSet.getString("shop_number"),
                        resultSet.getString("contact_number"),
                        resultSet.getString("status")
                );

                stores.add(store);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stores;
    }

    @Override
    public boolean updateStore(Store store) {

        String sql = "UPDATE store SET "
                   + "store_name = ?, "
                   + "store_type = ?, "
                   + "floor_number = ?, "
                   + "shop_number = ?, "
                   + "contact_number = ?, "
                   + "status = ? "
                   + "WHERE store_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, store.getStoreName());
            preparedStatement.setString(2, store.getStoreType());
            preparedStatement.setInt(3, store.getFloorNumber());
            preparedStatement.setString(4, store.getShopNumber());
            preparedStatement.setString(5, store.getContactNumber());
            preparedStatement.setString(6, store.getStatus());
            preparedStatement.setInt(7, store.getStoreId());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteStore(int storeId) {

        String sql = "DELETE FROM store WHERE store_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, storeId);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}