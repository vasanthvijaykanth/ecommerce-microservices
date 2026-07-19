package com.example.orderapp.dto;


import lombok.Data;

@Data
public class CartDto {

	private Long Id;
	private Integer quantity;
	private ProductDto productDto;	
}
