package com.jsp.employee;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Rest API Employee", version="0.01",description ="basic details of the project",contact=@Contact(email="afrabiyanaaz@gmail.com",name="Rabiya naaz af",url="")))
public class EmployeeCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCurdApplication.class, args);
	}

}
