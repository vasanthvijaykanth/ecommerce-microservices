package com.example.usersapp.service;

import java.util.List;

import com.example.usersapp.entity.Usersapp;

public interface UsersappService {

	List<Usersapp> fetchUserList();
	
	public Usersapp saveOrUpdate(Usersapp user);
	
	public Usersapp fetchUserDetailsById(Long id);
	
	public void deleteUser(Long id);
}
