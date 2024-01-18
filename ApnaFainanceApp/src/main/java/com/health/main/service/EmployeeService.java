package com.health.main.service;
//<<<<<<< HEAD
//=======
//import java.util.Optional;
//
//>>>>>>> refs/remotes/origin/main
import java.util.List;

import com.health.main.model.Employee;
public interface EmployeeService {

	public Employee saveEmployeeDetails(Employee employee);


	public List<Employee> getAllEmployees();

	public Employee loginCheck(String employeeEmail, String password);

	public Employee getSingleEmployee(int employeeId);


	public Employee updateEmployeeDetails(Employee employee);


//<<<<<<< HEAD
////<<<<<<< HEAD
////=======
//	public void deleteEmployee(int employeeId);
//
//
//
//
////>>>>>>> refs/remotes/origin/main
//=======
//	public void deleteEmployee(int employeeId);
//
//
//
//
//>>>>>>> refs/remotes/origin/main
	
	public void deletesingleEmployee(int id);


	void deleteEmployee(int employeeId);
	

	
}
