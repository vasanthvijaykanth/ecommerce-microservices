package com.example.productapp.service;

import java.util.List;

import com.example.productapp.dto.ProductDto;
import com.example.productapp.entity.Product;

public interface ProductService {

	List<Product> getAllProduct();
	
	public Product saveOrUpdateProduct(Product product);
	
	List<ProductDto> getById(List<Long> id);
	
	public void delete(Long id);
}
