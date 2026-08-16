package com.urbansquaremall.ui;

import java.util.Scanner;

import com.urbansquaremall.model.Store;
import com.urbansquaremall.service.StoreService;
import com.urbansquaremall.service.impl.StoreServiceImpl;
import java.util.List;

public class StoreUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StoreService storeService = new StoreServiceImpl();

        while (true) {

            System.out.println();
            System.out.println("====================================");
            System.out.println("       URBAN SQUARE MALL");
            System.out.println("       STORE MANAGEMENT");
            System.out.println("====================================");

            System.out.println("1. Add Store");
            System.out.println("2. View Store");
            System.out.println("3. View All Stores");
            System.out.println("4. Update Store");
            System.out.println("5. Delete Store");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

            case 1:

                System.out.println();
                System.out.println("--------- ADD STORE ---------");

                scanner.nextLine();

                System.out.print("Enter store name: ");
                String storeName = scanner.nextLine();

                System.out.print("Enter store type: ");
                String storeType = scanner.nextLine();

                System.out.print("Enter floor number: ");
                int floorNumber = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter shop number: ");
                String shopNumber = scanner.nextLine();

                System.out.print("Enter contact number: ");
                String contactNumber = scanner.nextLine();

                System.out.print("Enter status: ");
                String status = scanner.nextLine();

                Store store = new Store(
                        0,
                        storeName,
                        storeType,
                        floorNumber,
                        shopNumber,
                        contactNumber,
                        status
                );

                boolean result = storeService.addStore(store);

                if (result) {
                    System.out.println("Store added successfully.");
                } else {
                    System.out.println("Failed to add store.");
                }

                break;

            case 2:

                System.out.println();
                System.out.println("--------- VIEW STORE ---------");

                System.out.print("Enter store ID: ");
                int storeId = scanner.nextInt();

                Store foundStore = storeService.getStoreById(storeId);

                if (foundStore != null) {
                    System.out.println("Store found:");
                    System.out.println(foundStore);
                } else {
                    System.out.println("Store not found.");
                }

                break;
                
            case 3:

                System.out.println();
                System.out.println("--------- ALL STORES ---------");

                List<Store> stores = storeService.getAllStores();

                if (stores.isEmpty()) {
                    System.out.println("No stores found.");
                } else {

                    for (Store s : stores) {
                        System.out.println(s);
                    }
                }

                break;

            case 4:

                System.out.println();
                System.out.println("--------- UPDATE STORE ---------");

                System.out.print("Enter store ID: ");
                int updateId = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter new store name: ");
                String newStoreName = scanner.nextLine();

                System.out.print("Enter new store type: ");
                String newStoreType = scanner.nextLine();

                System.out.print("Enter new floor number: ");
                int newFloorNumber = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter new shop number: ");
                String newShopNumber = scanner.nextLine();

                System.out.print("Enter new contact number: ");
                String newContactNumber = scanner.nextLine();

                System.out.print("Enter new status: ");
                String newStatus = scanner.nextLine();

                Store updatedStore = new Store(
                        updateId,
                        newStoreName,
                        newStoreType,
                        newFloorNumber,
                        newShopNumber,
                        newContactNumber,
                        newStatus
                );

                boolean updateResult =
                        storeService.updateStore(updatedStore);

                if (updateResult) {
                    System.out.println("Store updated successfully.");
                } else {
                    System.out.println("Store update failed.");
                }

                break;
    
            case 5:

                System.out.println();
                System.out.println("--------- DELETE STORE ---------");

                System.out.print("Enter store ID: ");
                int deleteId = scanner.nextInt();

                boolean deleteResult =
                        storeService.deleteStore(deleteId);

                if (deleteResult) {
                    System.out.println("Store deleted successfully.");
                } else {
                    System.out.println("Store not found / delete failed.");
                }

                break;
                

                case 6:
                    System.out.println("Thank you for using Urban Square Mall.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}