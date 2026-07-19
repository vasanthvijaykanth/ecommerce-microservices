package com.example.usersapp.dto;


import lombok.Data;

@Data
public class CartDto {

	private Long Id;
	private Integer quantity;
	private ProductDto productDto;	
}
