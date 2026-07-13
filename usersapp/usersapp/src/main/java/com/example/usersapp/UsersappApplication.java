package com.example.usersapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= "com.example")
public class UsersappApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersappApplication.class, args);
	}

}
