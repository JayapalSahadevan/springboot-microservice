package com.java.microservice.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.microservice.departmentservice.entity.Department;
import com.java.microservice.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);		
	}

	public Department getDepartment(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}
	

}
