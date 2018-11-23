package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.User;
import com.example.demo.service.TestService;
import com.example.demo.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private TestService testService;
	@Autowired
	private UserService userService;
	
	@Value("${com.demo.name}")
	private String name;
	
	@Value("${com.demo.want}")
	private String want;
	
	@RequestMapping("/hello")
	public String hello() {
		return name+","+want;
	}
	
	@RequestMapping("/")
	public String hello2() {
		return "Welcome to springboot !";
	}
	
	@RequestMapping("/testdb")
	public List getUsers() {
		return testService.getList();
	}
	
	@ResponseBody
 	@PostMapping("/all")
	public List<User> getMyUsers() {
		return userService.selectAllUser();
	}
	@ResponseBody
	@GetMapping("/getAll")
	public List<User> getMyUser() {
		return userService.selectAllUser();
	}
	@ResponseBody
	@RequestMapping("/getClusterUser")
	public List<User> getClusterUser() {
		return userService.selectClusterUser();
	}
	@ResponseBody
	@RequestMapping("/getMasterUser")
	public List<User> getMasterUser() {
		return userService.selectMasterUser();
	}
	
	@RequestMapping(value="/home")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	

}
