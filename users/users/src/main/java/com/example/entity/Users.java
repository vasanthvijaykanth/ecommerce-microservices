package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    public Users(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userID;
    
    private String userName;
    private String userMobileNo;
    private String userAddress;
    
}
