package com.jeyaprabakar.advancedprogramming.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.jeyaprabakar.advancedprogramming.model.entity.Product;

public interface ProductService {
	void addProduct(Product p,MultipartFile pic);
	List<Product> findProducts(int sellerId);
	void updateProduct(Product p);
	void deleteProduct(int prodid);
	List<Product> allProducts();
	List<Product> categoryProducts(String pcat,String subcat);
	Product findProductById(int prodid);
	Page<Product> allProductsPaginated(int page,int pagesize);
}
