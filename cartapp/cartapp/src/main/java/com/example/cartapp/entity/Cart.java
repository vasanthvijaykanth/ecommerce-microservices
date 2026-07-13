package com.example.cartapp.entity;

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
@Table(name = "cart")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "cart_id")
	private Long cartId;
	
	@Column(name ="user_id")
	private Long userId;
	
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "quantity")
	private Integer quantity;

	/*
	 * public Long getCartId() { return cartId; }
	 * 
	 * public void setCartId(Long cartId) { this.cartId = cartId; }
	 * 
	 * public Long getUserId() { return userId; }
	 * 
	 * public void setUserId(Long userId) { this.userId = userId; }
	 * 
	 * public Long getProductId() { return productId; }
	 * 
	 * public void setProductId(Long productId) { this.productId = productId; }
	 * 
	 * public Integer getQuantity() { return quantity; }
	 * 
	 * public void setQuantity(Integer quantity) { this.quantity = quantity; }
	 * 
	 * @Override public int hashCode() { return Objects.hash(cartId, productId,
	 * quantity, userId); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Cart other = (Cart) obj; return Objects.equals(cartId, other.cartId)
	 * && Objects.equals(productId, other.productId) && Objects.equals(quantity,
	 * other.quantity) && Objects.equals(userId, other.userId); }
	 * 
	 * @Override public String toString() { return "Cart [cartId=" + cartId +
	 * ", userId=" + userId + ", productId=" + productId + ", quantity=" + quantity
	 * + "]"; }
	 * 
	 * 
	 */	
}
