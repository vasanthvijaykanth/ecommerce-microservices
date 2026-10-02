package com.example.productapp.controller;

import java.util.List;

import com.example.productapp.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.productapp.entity.Product;
import com.example.productapp.service.ProductService;

@RestController
@RequestMapping("/product")

public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/getallproduct")
	public List<Product> getAllProduct() {
		
		List<Product> response = productService.getAllProduct();
		
		return response;
	}
	
	@PostMapping("/saveupdateproduct")
	public Product saveProduct(@RequestBody Product product) {
		
		return productService.saveOrUpdateProduct(product);
	}
	
	@GetMapping("/getbyid")
	public List<ProductDto> getbyid(@RequestParam List<Long> id) {
		return productService.getById(id);
	}
	
	@GetMapping("/deleteproduct/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.delete(id);
	}
}
