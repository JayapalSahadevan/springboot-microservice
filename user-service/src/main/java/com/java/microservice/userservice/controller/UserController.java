package com.java.microservice.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.microservice.userservice.entity.User;
import com.java.microservice.userservice.service.UserService;
import com.java.microservice.userservice.vo.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
		
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Received request to Save User {} " , user);
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public RestTemplateVO getUser(@PathVariable("id") Long userId) {
		log.info("Received request to get User {} " , userId);
		return userService.findByUserId(userId);
	}

}
