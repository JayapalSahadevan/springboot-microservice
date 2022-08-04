package com.java.microservice.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.microservice.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
