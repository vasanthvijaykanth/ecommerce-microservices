package com.example.usersapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usersapp.entity.Usersapp;
import com.example.usersapp.repository.UsersappRepository;

@Service
public class UsersappServiceImpl implements UsersappService{

	@Autowired
	UsersappRepository usersappRepository;
	@Override
	public List<Usersapp> fetchUserList() {
		
		List<Usersapp> list = usersappRepository.findAll();
		System.out.println(list);
		System.out.println(list.get(0).getUserName());
		
		return list;
	}
	@Override
	public Usersapp saveOrUpdate(Usersapp user) {
		// TODO Auto-generated method stub
		return usersappRepository.save(user);
	}
	@Override
	public Usersapp fetchUserDetailsById(Long id) {
		// TODO Auto-generated method stub
		return usersappRepository.findById(id).get();
	}
	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		usersappRepository.deleteById(id);
		
	}

}
