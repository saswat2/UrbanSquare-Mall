package com.urbansquaremall.util;

import com.urbansquaremall.model.Product;
import com.urbansquaremall.service.ProductService;
import com.urbansquaremall.service.impl.ProductServiceImpl;

public class TestProductService {

    public static void main(String[] args) {

        // Create Service object
        ProductService productService = new ProductServiceImpl();

        // =====================================
        // 1. GET PRODUCT BY ID
        // =====================================

        Product foundProduct = productService.getProductById(11);

        System.out.println("Product found: " + foundProduct);


        // =====================================
        // 2. UPDATE PRODUCT
        // =====================================

        Product updatedProduct = new Product(
                11,
                "Puma Running Shoes",
                "Sports",
                3499.00
        );

        boolean updateResult =
                productService.updateProduct(updatedProduct);

        System.out.println("Product updated: " + updateResult);


        // =====================================
        // 3. GET PRODUCT AFTER UPDATE
        // =====================================

        Product productAfterUpdate =
                productService.getProductById(11);

        System.out.println(
                "Updated Product: " + productAfterUpdate
        );


        // =====================================
        // 4. DELETE PRODUCT
        // =====================================

        boolean deleteResult =
                productService.deleteProduct(11);

        System.out.println(
                "Product deleted: " + deleteResult
        );


        // =====================================
        // 5. VERIFY DELETE
        // =====================================

        Product productAfterDelete =
                productService.getProductById(11);

        System.out.println(
                "Product after delete: " + productAfterDelete
        );
    }
}