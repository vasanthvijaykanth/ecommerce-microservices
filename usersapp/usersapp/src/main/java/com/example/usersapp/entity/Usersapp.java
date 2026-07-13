package com.example.usersapp.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usersapp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_id")
	private Long userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_mobile_no")
	private String userMobileNo;
	
	@Column (name = "user_address")
	private String userAddress;

//	public Long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getUserMobileNo() {
//		return userMobileNo;
//	}
//
//	public void setUserMobileNo(String userMobileNo) {
//		this.userMobileNo = userMobileNo;
//	}
//
//	public String getUserAddress() {
//		return userAddress;
//	}
//
//	public void setUserAddress(String userAddress) {
//		this.userAddress = userAddress;
//	}
//
//	@Override
//	public String toString() {
//		return "Usersapp [userId=" + userId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
//				+ ", userAddress=" + userAddress + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(userAddress, userId, userMobileNo, userName);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usersapp other = (Usersapp) obj;
//		return Objects.equals(userAddress, other.userAddress) && Objects.equals(userId, other.userId)
//				&& Objects.equals(userMobileNo, other.userMobileNo) && Objects.equals(userName, other.userName);
//	}
//	
	
	
}
