package com.health.main.controller;
import java.util.Optional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> refs/heads/pratik
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
<<<<<<< HEAD
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deletesingledata(@PathVariable int id)
	{

		employeeService.deletesingleEmployee(id);
		return new ResponseEntity(HttpStatus.GONE);
	}
=======



	@GetMapping("/GetAllEmployeesData")
	public ResponseEntity <List <Employee>> getAll(){
		
		List<Employee> employeeList=employeeService.getAllEmployees();
		return new ResponseEntity <List <Employee>> (employeeList,HttpStatus.FOUND);
		
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


	@PutMapping("/employee")
	public ResponseEntity updateEmployee(@RequestBody Employee employee)
	{
		employee=employeeService.updateEmployeeDetails(employee);
		return new ResponseEntity(employee,HttpStatus.OK);
		
	}

>>>>>>> refs/heads/pratik
}

