package com.urbansquaremall.service.impl;

import java.util.List;

import com.urbansquaremall.dao.ProductDAO;
import com.urbansquaremall.dao.impl.ProductDAOImpl;
import com.urbansquaremall.model.Product;
import com.urbansquaremall.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO = new ProductDAOImpl();

    @Override
    public boolean addProduct(Product product) {
        return productDAO.addProduct(product);
    }

    @Override
    public Product getProductById(int productId) {
        return productDAO.getProductById(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public boolean updateProduct(Product product) {
        return productDAO.updateProduct(product);
    }

    @Override
    public boolean deleteProduct(int productId) {
        return productDAO.deleteProduct(productId);
    }
}