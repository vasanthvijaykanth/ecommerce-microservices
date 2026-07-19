package com.example.orderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderapp.dto.OrdersDto;
import com.example.orderapp.entity.Orders;
import com.example.orderapp.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/fetchallorders")
	public List<Orders> fetchAllOrders(){
		
		return orderService.fetchOrders();
	}
	
	@GetMapping("/getorderbyid/{id}")
	public OrdersDto fetchOrderById(@PathVariable Long id) {
		
		return orderService.findById(id);
	}
	
	@PostMapping("/saveorupdate")
	public Orders saveOrUpdate(@RequestBody Orders orders) {
		
		return orderService.saveOrUpdate(orders);
	}
	
	@DeleteMapping("/deleteorder/{id}")
	public void deleteOrder(@PathVariable Long id) {
		
		orderService.deleteOrder(id);
	}
}
