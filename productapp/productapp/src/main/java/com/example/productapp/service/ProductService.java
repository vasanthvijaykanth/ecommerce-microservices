package com.example.productapp.service;

import java.util.List;

import com.example.productapp.entity.Product;

public interface ProductService {

	List<Product> fetchAllProduct(); 
	
	public Product saveOrUpdateProduct(Product product);
	
	Product getById(Long id);
	
	public void delete(Long id);
}
