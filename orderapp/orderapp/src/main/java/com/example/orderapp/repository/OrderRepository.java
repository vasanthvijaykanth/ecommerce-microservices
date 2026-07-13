package com.example.orderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderapp.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
