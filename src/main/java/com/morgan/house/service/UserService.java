package com.morgan.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morgan.house.common.model.User;
import com.morgan.house.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> getUsers(){
		return userMapper.getUsers();
	}
}
