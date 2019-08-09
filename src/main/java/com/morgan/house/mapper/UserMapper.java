package com.morgan.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.morgan.house.common.model.User;

@Mapper
public interface UserMapper {

	public List<User> getUsers();
}
