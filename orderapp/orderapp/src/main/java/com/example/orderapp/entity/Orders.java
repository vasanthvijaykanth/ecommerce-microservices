package com.example.orderapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name ="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer id; 
	
	@Column(name ="cart_id")
	private Integer cartId;
	
	@Column(name ="quantity")
	private Integer quantity;
	
	@Column(name ="order_number")
	private String orderNumber;
	
	@Column(name = "total_amount")
	private Integer totalAmount;
	
	@Column (name="order_date")
	private LocalDateTime orderDate;	
}
