package com.example.controller;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Users;
import com.example.service.UserService;


@RestController
@RequestMapping("/User")
public class UserController {
    
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/Userslist")
	public List<Users> fetchUsersList(){
		System.out.println("request reach here");
		logger.debug("service return here");
		return userService.fetchUsersList().size() > 0 ? userService.fetchUsersList() : Collections.emptyList() ;
		
		
		
		
	}
}
