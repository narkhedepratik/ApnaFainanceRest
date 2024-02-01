package com.health.main.service;


import java.util.List;

import com.health.main.model.Employee;
public interface EmployeeService {

	public Employee saveEmployeeDetails(Employee employee);


	public List<Employee> getAllEmployees();

	public Employee loginCheck(String employeeEmail, String password);

	public Employee getSingleEmployee(int employeeId);


	public Employee updateEmployeeDetails(Employee employee);

	public void deleteEmployee(int employeeId);




	
	public void deletesingleEmployee(int id);


	

	
}
