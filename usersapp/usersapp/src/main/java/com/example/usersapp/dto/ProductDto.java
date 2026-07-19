package com.example.usersapp.dto;

import lombok.Data;


@Data
public class ProductDto {
	
	private Long id;
	private String name;
	private Integer price;
	private Integer stockQuantity;
}
