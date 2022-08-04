package com.java.microservice.userservice.vo;

import com.java.microservice.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestTemplateVO {
	
	private User user;
	private Department department;

}
