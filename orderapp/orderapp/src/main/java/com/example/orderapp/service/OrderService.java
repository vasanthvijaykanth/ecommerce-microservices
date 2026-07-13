package com.example.orderapp.service;

import java.util.List;

import com.example.orderapp.entity.Orders;

public interface OrderService {

	public List<Orders> fetchOrders();
	
	public Orders saveOrUpdate(Orders orders);
	
	public Orders findById(Long id);
	
	public void deleteOrder(Long id);
}
