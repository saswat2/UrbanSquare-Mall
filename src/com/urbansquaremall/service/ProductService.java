package com.urbansquaremall.service;

import java.util.List;
import com.urbansquaremall.model.Product;

public interface ProductService {

    boolean addProduct(Product product);

    Product getProductById(int productId);

    List<Product> getAllProducts();

    boolean updateProduct(Product product);

    boolean deleteProduct(int productId);
}