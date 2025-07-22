package com.jsp.employee.repository;




import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.employee.entity.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Long> {

	
	List<Employee> findByRoleAndNameContaining(String role, String name, PageRequest pagination);


}