package com.urbansquaremall.model;

public class Store {

    private int storeId;
    private String storeName;
    private String storeType;
    private int floorNumber;
    private String shopNumber;
    private String contactNumber;
    private String status;

    public Store(int storeId, String storeName, String storeType,
                 int floorNumber, String shopNumber,
                 String contactNumber, String status) {

        this.storeId = storeId;
        this.storeName = storeName;
        this.storeType = storeType;
        this.floorNumber = floorNumber;
        this.shopNumber = shopNumber;
        this.contactNumber = contactNumber;
        this.status = status;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Store [storeId=" + storeId
                + ", storeName=" + storeName
                + ", storeType=" + storeType
                + ", floorNumber=" + floorNumber
                + ", shopNumber=" + shopNumber
                + ", contactNumber=" + contactNumber
                + ", status=" + status + "]";
    }
}