package com.example.usersapp.service;

import java.util.List;

import com.example.usersapp.dto.UsersDto;
import com.example.usersapp.entity.Users;

public interface UsersappService {

	List<Users> fetchUserList();
	
	public Users saveOrUpdate(Users user);
	
	public UsersDto getuserbyid(Long id);
	
	public void deleteUser(Long id);
}
