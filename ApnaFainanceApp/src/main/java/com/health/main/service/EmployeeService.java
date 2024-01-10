package com.health.main.service;
import java.util.Optional;

import com.health.main.model.Employee;
public interface EmployeeService {

	public Employee saveEmployeeDetails(Employee employee);

	public Employee updateEmployeeDetails(Employee employee);

	public Optional<Employee> getData(int employeeId);

	

	

	

	
	
	
}
