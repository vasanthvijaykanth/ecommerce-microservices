package com.example.productapp.service;

import java.util.ArrayList;
import java.util.List;

import com.example.productapp.dto.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productapp.entity.Product;
import com.example.productapp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository productRepository;
	private final ModelMapper modelMapper;
	public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper)
	{
		this.productRepository = productRepository;
		this.modelMapper = modelMapper;
	}


	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public List<ProductDto> getById(List<Long> ids) {
		List<ProductDto> prodDtoList = new ArrayList<>();
		try{

		List<Product> products = productRepository.findByCartIdIn(ids);

		 for(Product p : products){
			ProductDto productDto = modelMapper.map(p, ProductDto.class);

			 prodDtoList.add(productDto);
		 }

		}catch (Exception e){
			System.out.println("Exception "+e);
		}
		return prodDtoList;
	}

	@Override
	public void delete(Long id) {
		
		productRepository.deleteById(id);
		
	}
	
	

}
