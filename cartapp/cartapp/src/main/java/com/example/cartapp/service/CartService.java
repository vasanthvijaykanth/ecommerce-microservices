package com.example.cartapp.service;

import java.util.List;

import com.example.cartapp.dto.CartDto;
import com.example.cartapp.entity.Cart;

public interface CartService {
	
	public Cart saveOrUpdateCart(Cart cart);
	public CartDto fetchCartById(Long id);
	public void deleteCart(Long id);


}
