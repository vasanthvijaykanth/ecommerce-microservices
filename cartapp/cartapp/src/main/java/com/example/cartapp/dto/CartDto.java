package com.example.cartapp.dto;


import lombok.Data;

@Data
public class CartDto {

	private Long cartId;
	private Long userId;
	private Long productId;
	private Integer quantity;
	private ProductDto productDto;

}
