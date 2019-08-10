package com.morgan.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morgan.house.common.model.User;
import com.morgan.house.service.UserService;

@RestController
public class HelloController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	public String hello(ModelMap modelMap) {
		List<User> users = userService.getUsers();
		User one = users.get(0);
		modelMap.put("user", one);
		return "hello";
	}
}
