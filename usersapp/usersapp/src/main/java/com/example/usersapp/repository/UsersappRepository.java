package com.example.usersapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.usersapp.entity.Users;

@Repository
public interface UsersappRepository extends  JpaRepository<Users, Long>  {

	
}
