package com.java.microservice.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.microservice.userservice.entity.User;
import com.java.microservice.userservice.repostiory.UserRepository;
import com.java.microservice.userservice.vo.Department;
import com.java.microservice.userservice.vo.RestTemplateVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public RestTemplateVO findByUserId(Long userId) {
		RestTemplateVO vo = new RestTemplateVO();		
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}
