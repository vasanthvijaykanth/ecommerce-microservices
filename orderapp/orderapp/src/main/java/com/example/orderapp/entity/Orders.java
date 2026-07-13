package com.example.orderapp.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name ="orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "order_id")
	private Integer orderId; 
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name ="product_id")
	private Integer productId;
	
	@Column(name ="quantity")
	private Integer quantity;
	
	@Column(name ="order_number")
	private String orderNumber;
	
	@Column(name = "total_amount")
	private Integer totalAmount;
	
	@Column (name="order_date")
	private LocalDateTime orderDate;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderDate, orderId, orderNumber, productId, quantity, totalAmount, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(orderDate, other.orderDate) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(orderNumber, other.orderNumber) && Objects.equals(productId, other.productId)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(totalAmount, other.totalAmount)
				&& Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", quantity="
				+ quantity + ", orderNumber=" + orderNumber + ", totalAmount=" + totalAmount + ", orderDate="
				+ orderDate + "]";
	}
	
	
	
}
