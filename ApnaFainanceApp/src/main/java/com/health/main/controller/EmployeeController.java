package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.Employee;
import com.health.main.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
 
	@Autowired EmployeeService employeeService;
	
	@PostMapping("/create_employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
	{
	   Employee storedEmployee = employeeService.saveEmployeeDetails(employee);
		
		return new ResponseEntity<Employee>(storedEmployee, HttpStatus.CREATED);
	}
}
