package com.example.productapp.dto;

import lombok.Data;


@Data
public class ProductDto {
	
	private Long productId;
	private String name;
	private Integer price;
	private Integer quantity;
	private Long cartId;
}
