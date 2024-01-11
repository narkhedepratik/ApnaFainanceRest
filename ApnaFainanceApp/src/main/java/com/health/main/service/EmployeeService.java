package com.health.main.service;

import java.util.List;

import com.health.main.model.Employee;

public interface EmployeeService {

	public Employee saveEmployeeDetails(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee loginCheck(String employeeEmail, String password);

	
	
}
