package com.example.demo.service;

import java.util.List;

import com.example.demo.data.User;


public interface UserService {

	
	public  List<User> selectAllUser();
	
	public  List<User> selectClusterUser();
	
	public  List<User> selectMasterUser();
	
	public User selectByPrimaryKey(String id);
}
