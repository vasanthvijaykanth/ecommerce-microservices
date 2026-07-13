package com.example.cartapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cartapp.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
