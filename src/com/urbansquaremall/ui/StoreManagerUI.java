package com.urbansquaremall.ui;
import com.urbansquaremall.model.StoreManager;
import com.urbansquaremall.service.StoreManagerService;
import com.urbansquaremall.service.impl.StoreManagerServiceImpl;
import java.util.List;

import java.util.Scanner;

public class StoreManagerUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StoreManagerService service = new StoreManagerServiceImpl();

        int choice;

        do {

            System.out.println("====================================");
            System.out.println("       URBAN SQUARE MALL");
            System.out.println("       STORE MANAGER MANAGEMENT");
            System.out.println("====================================");

            System.out.println("1. Add Store Manager");
            System.out.println("2. View Store Manager");
            System.out.println("3. View All Store Managers");
            System.out.println("4. Update Store Manager");
            System.out.println("5. Delete Store Manager");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

            case 1:

                System.out.println("\n--------- ADD STORE MANAGER ---------");

                System.out.print("Enter manager name: ");
                scanner.nextLine();
                String managerName = scanner.nextLine();

                System.out.print("Enter contact number: ");
                String contactNumber = scanner.nextLine();

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter store ID: ");
                int storeId = scanner.nextInt();

                StoreManager manager = new StoreManager(
                        0,
                        managerName,
                        contactNumber,
                        email,
                        storeId
                );

                boolean result = service.addStoreManager(manager);

                if (result) {
                    System.out.println("Store Manager added successfully.");
                } else {
                    System.out.println("Failed to add Store Manager.");
                }

                break;

            case 2:

                System.out.println("\n--------- VIEW STORE MANAGER ---------");

                System.out.print("Enter manager ID: ");
                int managerId = scanner.nextInt();

                StoreManager foundManager =
                        service.getStoreManagerById(managerId);

                if (foundManager != null) {
                    System.out.println("Store Manager found:");
                    System.out.println(foundManager);
                } else {
                    System.out.println("Store Manager not found.");
                }

                break;
                
           
            case 3:

                System.out.println("\n--------- ALL STORE MANAGERS ---------");

                List<StoreManager> managers =
                        service.getAllStoreManagers();

                if (managers.isEmpty()) {
                    System.out.println("No Store Managers found.");
                } else {
                    for (StoreManager storeManager : managers) {
                        System.out.println(storeManager);
                    }
                }

                break;

           
  
            case 4:

                System.out.println("\n--------- UPDATE STORE MANAGER ---------");

                System.out.print("Enter manager ID: ");
                int updateManagerId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter new manager name: ");
                String updateName = scanner.nextLine();

                System.out.print("Enter new contact number: ");
                String updateContact = scanner.nextLine();

                System.out.print("Enter new email: ");
                String updateEmail = scanner.nextLine();

                System.out.print("Enter new store ID: ");
                int updateStoreId = scanner.nextInt();

                StoreManager updatedManager = new StoreManager(
                        updateManagerId,
                        updateName,
                        updateContact,
                        updateEmail,
                        updateStoreId
                );

                boolean updateResult =
                        service.updateStoreManager(updatedManager);

                if (updateResult) {
                    System.out.println("Store Manager updated successfully.");
                } else {
                    System.out.println("Store Manager not found.");
                }

                break;
            case 5:

                System.out.println("\n--------- DELETE STORE MANAGER ---------");

                System.out.print("Enter manager ID: ");
                int deleteManagerId = scanner.nextInt();

                boolean deleteResult =
                        service.deleteStoreManager(deleteManagerId);

                if (deleteResult) {
                    System.out.println("Store Manager deleted successfully.");
                } else {
                    System.out.println("Store Manager not found.");
                }

                break;
            case 6:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        scanner.close();
    }
}