package com.example.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productapp.entity.Product;
import com.example.productapp.service.ProductService;

@RestController
@RequestMapping("/product")

public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/getallproduct")
	public List<Product> fetchAllProduct() {
		
		List<Product> response = productService.fetchAllProduct(); 
		
		return response;
	}
	
	@PostMapping("/saveupdateproduct")
	public Product saveProduct(@RequestBody Product product) {
		
		return productService.saveOrUpdateProduct(product);
	}
	
	@GetMapping("/getbyid/{id}")
	public Product getbyid(@PathVariable Long id) {
		return productService.getById(id);
	}
	
	@GetMapping("/deleteproduct/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.delete(id);
	}
}
