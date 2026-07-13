package com.example.cartapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.cartapp.dto.CartDto;
import com.example.cartapp.dto.ProductDto;
import com.example.cartapp.entity.Cart;
import com.example.cartapp.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	@Override
	public Cart saveOrUpdateCart(@RequestBody Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public CartDto fetchCartById(Long id) {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.findById(id).get();
	//	ProductDto product= restTemplate.gethjhg(cart.getId()) new ProductDto();  //
		ProductDto product=  new ProductDto();
		CartDto cartDto= modelMapper.map(cart,CartDto.java);
		cartDto.setProduct(product);
		
		 
		 return cartDto;
	}

	@Override
	public void deleteCart(Long id) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(id);
		
	}
	

}
