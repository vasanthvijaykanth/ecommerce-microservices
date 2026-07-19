package com.example.orderapp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.orderapp.dto.CartDto;
import com.example.orderapp.dto.OrdersDto;
import com.example.orderapp.entity.Orders;
import com.example.orderapp.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
		
	@Autowired
	WebClient webClient;

	private final ModelMapper modelMapper;
	public OrderServiceImpl(ModelMapper modelMapper) {
		
		this.modelMapper = modelMapper;
	}
	
	@Override
	public List<Orders> fetchOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Orders saveOrUpdate(Orders orders) {
		// TODO Auto-generated method stub
		return orderRepository.save(orders);
	}

	@Override
	public OrdersDto findById(Long id) {
		// TODO Auto-generated method stub
		Orders orders = orderRepository.findById(id).get();
		
		OrdersDto ordersDto = modelMapper.map(orders, OrdersDto.class); 
		
		CartDto cartDto = webClient
				.get()
				.uri("http://localhost:8084/cart/fetchcartbyid?id=" +id)
				.retrieve()
				.bodyToMono(CartDto.class)
				.block();
				
		ordersDto.setCartDto(cartDto);
		
		return ordersDto;
	}

	@Override
	public void deleteOrder(Long id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
	}

}
