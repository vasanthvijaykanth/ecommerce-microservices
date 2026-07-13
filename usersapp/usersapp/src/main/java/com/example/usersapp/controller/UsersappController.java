package com.example.usersapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usersapp.entity.Usersapp;
import com.example.usersapp.service.UsersappService;

@RestController 
@RequestMapping("/usersapp")
public class UsersappController {

	@Autowired
	UsersappService usersappService;
	

	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome to Userapp";
	}
	
	@GetMapping("/userList")
	public List<Usersapp> fetchUserList(){
		
		List<Usersapp> response = usersappService.fetchUserList();
		return response;
	}
	
	@PostMapping("/saveOrUpdate")
	public Usersapp saveOrUpdate(@RequestBody Usersapp user) {
		
		return usersappService.saveOrUpdate(user);
	}
	
	@GetMapping("/finduserbyid/{id}")
	public Usersapp findUserById(@PathVariable Long id) {
		
		return usersappService.fetchUserDetailsById(id);
	}
	
	@DeleteMapping("/deleteuser/{id}")
		public void deleteUser(@PathVariable Long id) {
			usersappService.deleteUser(id);
		}
	

}

