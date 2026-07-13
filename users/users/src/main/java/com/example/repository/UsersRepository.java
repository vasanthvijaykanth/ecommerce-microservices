package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>  {
	//public List<Users> getAll();
}
