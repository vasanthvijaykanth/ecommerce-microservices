package com.example.usersapp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.usersapp.dto.OrdersDto;
import com.example.usersapp.dto.UsersDto;
import com.example.usersapp.entity.Users;
import com.example.usersapp.repository.UsersappRepository;

@Service
public class UsersappServiceImpl implements UsersappService{

    @Autowired
	UsersappRepository usersappRepository;
    
    @Autowired
    WebClient webClient;
	
	private final ModelMapper modelMapper;
    public UsersappServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
	
	@Override
	public List<Users> fetchUserList() {
		
		List<Users> list = usersappRepository.findAll();
				
		return list;
	}
	@Override
	public Users saveOrUpdate(Users user) {
		// TODO Auto-generated method stub
		return usersappRepository.save(user);
	}
	
	@Override
	public UsersDto getuserbyid(Long id) {
		System.out.println("sfsdf");
		// TODO Auto-generated method stub
		Users usersapp = usersappRepository.findById(id).get();
		
		UsersDto usersDto = modelMapper.map(usersapp, UsersDto.class);
		
		OrdersDto ordersDto = webClient
				.get()
				.uri("http://localhost:8085/order/getorderbyid/" +id)
				.retrieve()
				.bodyToMono(OrdersDto.class)
				.block();
				
		usersDto.setOrdersDto(ordersDto);
		
		return usersDto;
	}
	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		usersappRepository.deleteById(id);
		
	}

}
