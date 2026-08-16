package com.urbansquaremall.util;

import java.util.List;
import com.urbansquaremall.dao.ProductDAO;
import com.urbansquaremall.dao.impl.ProductDAOImpl;
import com.urbansquaremall.model.Product;

public class TestProductDAO {

    public static void main(String[] args) {

        Product product = new Product(
                0,
                "Nike Shoes",
                "Footwear",
                4999.00
        );

        ProductDAO productDAO = new ProductDAOImpl();

       // boolean result = productDAO.addProduct(product);

       // System.out.println("Product added: " + result);
        Product foundProduct = productDAO.getProductById(5);

        System.out.println("Product found: " + foundProduct);
        List<Product> products = productDAO.getAllProducts();

        System.out.println("All Products:");

        for (Product p : products) {
            System.out.println(p);
        }
        
        Product updatedProduct = new Product(
                7,
                "Nike Running Shoes",
                "Sports",
                5999.00
        );

        boolean result = productDAO.updateProduct(updatedProduct);

        System.out.println("Product updated: " + result);

        Product updatedResult = productDAO.getProductById(7);

        System.out.println("Updated Product: " + updatedResult);
        boolean deleteResult = productDAO.deleteProduct(7);

        System.out.println("Product deleted: " + deleteResult);

        Product deletedProduct = productDAO.getProductById(7);

        System.out.println("Product after delete: " + deletedProduct);
        
        
    }
}