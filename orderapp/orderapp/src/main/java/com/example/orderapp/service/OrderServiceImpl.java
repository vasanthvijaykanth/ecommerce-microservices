package com.example.orderapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderapp.entity.Orders;
import com.example.orderapp.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
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
	public Orders findById(Long id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).get();
	}

	@Override
	public void deleteOrder(Long id) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(id);
	}

}
