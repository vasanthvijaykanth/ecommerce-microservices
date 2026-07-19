package com.example.usersapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class UsersDto {

	private Long id;
	
	private String name;
	
	private String mobileNo;
	
	private String address;
	
	private OrdersDto ordersDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public OrdersDto getOrdersDto() {
		return ordersDto;
	}

	public void setOrdersDto(OrdersDto ordersDto) {
		this.ordersDto = ordersDto;
	}
	
	
}
