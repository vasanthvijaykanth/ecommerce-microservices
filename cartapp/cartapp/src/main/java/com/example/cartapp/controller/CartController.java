package com.example.cartapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cartapp.dto.CartDto;
import com.example.cartapp.entity.Cart;
import com.example.cartapp.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/update")
	public Cart saveOrUpdate(@RequestBody Cart cart) {
		
		return cartService.saveOrUpdateCart(cart);
	}
	
	@GetMapping("/get/{id}")
	public List<CartDto> getById(@PathVariable List<Long> id) {
		
		return cartService.fetchCartById(id);
	}
	
	@GetMapping("/fetchcartbyid")
	//public CartDto getById(@RequestParam(required=false) Long id,@RequestParam(required=false) Long ids) {
	public List<CartDto> getByCartId(@RequestParam List<Long> id){
		
		return cartService.fetchCartById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCart(@PathVariable Long id) {
	
		cartService.deleteCart(id);
	}

}
