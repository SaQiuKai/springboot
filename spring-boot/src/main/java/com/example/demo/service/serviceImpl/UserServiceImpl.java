package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.cluster.ClusterMapper;
import com.example.demo.dao.master.MasterMapper;
import com.example.demo.dao.master.UserMapper;
import com.example.demo.data.User;
import com.example.demo.service.UserService;


@Service(value = "userService")
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private  UserMapper userMapper;
	
	@Autowired
	private  ClusterMapper clusterMapper;
	
	@Autowired
	private  MasterMapper masterMapper;

	@Override
	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}
	@Override
	public List<User> selectClusterUser() {
		return clusterMapper.selectAllUser();
	}
	@Override
	public List<User> selectMasterUser() {
		return masterMapper.selectAllUser();
	}

	@Override
	public User selectByPrimaryKey(String name) {
		return userMapper.selectByPrimaryKey(name);
	}



}
