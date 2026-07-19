package com.example.cartapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.cartapp.dto.CartDto;
import com.example.cartapp.dto.ProductDto;
import com.example.cartapp.entity.Cart;
import com.example.cartapp.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	WebClient webClient;
	
	private final ModelMapper modelMapper;
	public CartServiceImpl(ModelMapper modelMapper) {
		
		this.modelMapper = modelMapper;
	}

	@Override
	public Cart saveOrUpdateCart(@RequestBody Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public CartDto fetchCartById(Long id) {
	
		Cart cart = cartRepository.findById(id).get();
		
		ProductDto products = webClient
				.get()
				.uri("http://localhost:8083/product/getbyid/" + id)
				.retrieve()
				.bodyToMono(ProductDto.class)
				.block();
		
		CartDto cartDto= modelMapper.map(cart, CartDto.class);
		cartDto.setProductDto(products); 
		 return cartDto;
	}

	@Override
	public void deleteCart(Long id) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(id);
		
	}
	

}
