package com.urbansquaremall.ui;

import java.util.Scanner;

import com.urbansquaremall.model.Product;
import com.urbansquaremall.service.ProductService;
import com.urbansquaremall.service.impl.ProductServiceImpl;

public class ProductUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductService productService = new ProductServiceImpl();

        while (true) {

            System.out.println();
            System.out.println("====================================");
            System.out.println("       URBAN SQUARE MALL");
            System.out.println("       PRODUCT MANAGEMENT");
            System.out.println("====================================");

            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. View All Products");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println();
                    System.out.println("--------- ADD PRODUCT ---------");

                    scanner.nextLine();

                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Product product = new Product(
                            0,
                            productName,
                            category,
                            price
                    );

                    boolean result = productService.addProduct(product);

                    if (result) {
                        System.out.println("Product added successfully.");
                    } else {
                        System.out.println("Failed to add product.");
                    }

                    break;

                case 2:

                    System.out.println();
                    System.out.println("--------- VIEW PRODUCT ---------");

                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();

                    Product foundProduct =
                            productService.getProductById(productId);

                    if (foundProduct != null) {
                        System.out.println("Product found:");
                        System.out.println(foundProduct);
                    } else {
                        System.out.println("Product not found.");
                    }

                    break;

                case 3:

                    System.out.println();
                    System.out.println("--------- ALL PRODUCTS ---------");

                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p);
                    }

                    break;

                case 4:

                    System.out.println();
                    System.out.println("--------- UPDATE PRODUCT ---------");

                    System.out.print("Enter product ID: ");
                    int updateId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter new product name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new category: ");
                    String newCategory = scanner.nextLine();

                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();

                    Product updatedProduct = new Product(
                            updateId,
                            newName,
                            newCategory,
                            newPrice
                    );

                    boolean updateResult =
                            productService.updateProduct(updatedProduct);

                    if (updateResult) {
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product update failed.");
                    }

                    break;

                case 5:

                    System.out.println();
                    System.out.println("--------- DELETE PRODUCT ---------");

                    System.out.print("Enter product ID: ");
                    int deleteId = scanner.nextInt();

                    boolean deleteResult =
                            productService.deleteProduct(deleteId);

                    if (deleteResult) {
                        System.out.println("Product deleted successfully.");
                    } else {
                        System.out.println("Product not found / delete failed.");
                    }

                    break;

                case 6:

                    System.out.println();
                    System.out.println("Thank you for using Urban Square Mall.");

                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}