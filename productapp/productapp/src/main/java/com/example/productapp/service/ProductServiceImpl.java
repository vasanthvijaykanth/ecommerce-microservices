package com.example.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productapp.entity.Product;
import com.example.productapp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> fetchAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product getById(Long id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		
		productRepository.deleteById(id);
		
	}
	
	

}
