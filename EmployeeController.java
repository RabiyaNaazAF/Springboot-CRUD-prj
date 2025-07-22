package com.jsp.employee.controler;
import java.util.LinkedHashMap;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.employee.entity.Employee;
import com.jsp.employee.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/employees")
	public ResponseEntity<Map<String,Object>>saveEmployee(@RequestBody Employee employee){
		Map<String,Object> map=new LinkedHashMap<String, Object>();
		map.put("message", "Data saved success");
		map.put("content", service.save(employee));
		return ResponseEntity.status(201).body(map);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<Map<String,Object>> findAllEmployees(
			@RequestParam(defaultValue = "id")String sort,
			@RequestParam(defaultValue = "false")boolean desc,
			@RequestParam(defaultValue="1") int page,
			@RequestParam(defaultValue = "10") int size,
			@RequestParam(required=false)String role,
			@RequestParam(required=false)String name
			){
		Map<String,Object> map=new LinkedHashMap<String, Object>();
		map.put("message", "Data Found");
		map.put("content", service.fetchRecords(sort,desc,page,size,role,name));
		return ResponseEntity.status(200).body(map);
	}
	
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Map<String, Object>> fetchTheRecord(@PathVariable Long id)
//	{
//		service.fetch(id);
//		Map<String,Object>map=new LinkedHashMap<String,Object>();
//		map.put("message", "Data fetched Success");
//		return ResponseEntity.status(HttpStatus.OK).body(map);
//	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Object>> deleteRecord(@PathVariable Long id)
	{
		service.delete(id);
		Map<String,Object>map=new LinkedHashMap<String,Object>();
		map.put("message", "Data deleted Success");
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}
	
	@PutMapping("/employees")
	@Operation(summary="save employee")
	public ResponseEntity<Map<String,Object>> updateEmployee(@RequestBody Employee employee){
		Map<String,Object> map=new LinkedHashMap<String,Object>();
		map.put("message", "Data Updated success");
		map.put("content", service.save(employee));
		return ResponseEntity.status(200).body(map);
	}

	@PatchMapping("/employees/{id}")
	@Operation(summary="fetch employee")
	public ResponseEntity<Map<String,Object>>updateEmployee(@RequestBody Employee employee,@PathVariable Long id){
		Map<String,Object> map=new LinkedHashMap<String,Object>();
		map.put("message", "Data Updated success");
		map.put("content", service.update(employee,id));
		return ResponseEntity.status(200).body(map);
	}
	}
