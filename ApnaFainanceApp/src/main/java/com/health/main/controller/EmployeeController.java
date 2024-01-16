package com.health.main.controller;
import java.util.Optional;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.health.main.model.Employee;
import com.health.main.service.EmployeeService;


@CrossOrigin("*")



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



	@GetMapping("/GetAllEmployeesData")
	public ResponseEntity <List <Employee>> getAll(){
		
		List<Employee> employeeList=employeeService.getAllEmployees();
		return new ResponseEntity <List <Employee>> (employeeList,HttpStatus.OK);
		
	}


	@GetMapping("/login/{username}/{password}")
	public ResponseEntity<Employee> login(@PathVariable("username") String employeeEmail  , @PathVariable("password") String password) {
		Employee employee=employeeService.loginCheck(employeeEmail, password);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		
	}

	@GetMapping("employee/{employeeId}")
	public Employee getSingleEmployee(@PathVariable int employeeId)
	{
		Employee employee= employeeService.getSingleEmployee(employeeId);
		
		return employee;
	}


	@PutMapping("/update")
	public ResponseEntity updateEmployee(@RequestBody Employee employee)
	{
		employee=employeeService.updateEmployeeDetails(employee);
		return new ResponseEntity(employee,HttpStatus.OK);	
	}

	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity <Employee>deleteEmployee(@PathVariable   int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		return new ResponseEntity<Employee>(HttpStatus.GONE);
		
	}
}

