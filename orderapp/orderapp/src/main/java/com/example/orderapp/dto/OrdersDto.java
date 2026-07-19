package com.example.orderapp.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrdersDto {

	private Integer id; 
	
	private Integer quantity;
	
	private String orderNumber;
	
	private Integer totalAmount;
	
	private LocalDateTime orderDate;

	private CartDto cartDto;
		
}
