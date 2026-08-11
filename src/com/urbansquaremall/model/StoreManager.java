package com.urbansquaremall.model;

public class StoreManager {
	
	private int managerId;
	private String managerName;
	private String contactNumber;
	private String email;
	private int storeId;
	
	



public StoreManager(int managerId,String managerName,String contactNumber,String email,int storeId) {
	
	this.managerId =  managerId;
	this.managerName = managerName;
	this.contactNumber = contactNumber;
	this.email = email;
	this.storeId = storeId;
	
	
}





@Override
public String toString() {
	return "StoreManager [managerId=" + managerId + ", managerName=" + managerName + ", contactNumber=" + contactNumber
			+ ", email=" + email + ", storeId=" + storeId + "]";
}





public int getManagerId() {
	return managerId;
}





public void setManagerId(int managerId) {
	this.managerId = managerId;
}





public String getManagerName() {
	return managerName;
}





public void setManagerName(String managerName) {
	this.managerName = managerName;
}





public String getContactNumber() {
	return contactNumber;
}





public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}





public String getEmail() {
	return email;
}





public void setEmail(String email) {
	this.email = email;
}





public int getStoreId() {
	return storeId;
}





public void setStoreId(int storeId) {
	this.storeId = storeId;
}
}
