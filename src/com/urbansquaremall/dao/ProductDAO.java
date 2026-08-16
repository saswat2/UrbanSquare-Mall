package com.urbansquaremall.dao;
import com.urbansquaremall.model.Product;
import java.util.List;

public interface ProductDAO {
	
	boolean addProduct(Product product);

	Product getProductById(int productId);

	List<Product> getAllProducts();
	
	boolean updateProduct(Product product);
	boolean deleteProduct(int productId);
	

}
