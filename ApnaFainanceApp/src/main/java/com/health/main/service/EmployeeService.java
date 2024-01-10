package com.health.main.service;

import com.health.main.model.Employee;

public interface EmployeeService {

	public Employee saveEmployeeDetails(Employee employee);

	public Employee loginCheck(String employeeEmail, String password);
	
	
}
