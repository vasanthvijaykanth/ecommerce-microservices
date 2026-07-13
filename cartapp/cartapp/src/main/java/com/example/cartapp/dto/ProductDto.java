package com.example.cartapp.dto;

import java.util.Objects;

import lombok.Data;


@Data
public class ProductDto {
	
	private Long productId;
	private String productName;
	private Integer productPrice;
	private Integer stockQuantity;
	private Long userId;	

}
