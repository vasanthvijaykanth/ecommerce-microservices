package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Users;
import com.example.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService{

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UsersRepository usersRepository;
	@Override
	public List<Users> fetchUsersList() {
		
		// List<Users> li = usersRepository.getAll();
		 //Users li = usersRepository.findById(1L).get();
	List<Users> list = usersRepository.findAll();
		//System.out.println(list.size());
		logger.debug("service return here");
		ArrayList<Users> al = new ArrayList<>();
		Users us1 = new Users(1,"Dummyssssss", 9191919, "velacher");
		
		al.add(us1);
		
		return al; 
	}
	
	// @Override
	public String putUsersList(Users users) {
		
		usersRepository.save(users);
		return "Succesfully Updated"; 
	}
	
	// @Override
	/*
	 * public String patchUsersList(String username, String address) {
	 * 
	 * Users user = usersRepository.findById(1L).get(); user.setUserName(username);
	 * user.setUserAddress(address); usersRepository.save(user); return
	 * "Succesfully Updated"; }
	 */
}
