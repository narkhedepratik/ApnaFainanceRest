package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.health.main.exception.InvalidAuthDetailsException;
import com.health.main.model.Employee;
import com.health.main.repository.EmployeeRepository;
import com.health.main.service.EmployeeService;
import com.health.main.utility.PasswordGenrator;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		      
		employee.setPassword(PasswordGenrator.getPassword(employee.getEmployeeName()));
		   
		    Employee databaseEmployee = employeeRepository.save(employee);
		
		return databaseEmployee;
	}

	@Override
	public Employee loginCheck(String employeeEmail, String password) {
		

		
		Employee employee=employeeRepository.findByEmployeeEmailAndPassword(employeeEmail, password);
		
		
		if(employee == null) {
			
			throw new InvalidAuthDetailsException("Invalid username or password");
		}
		return employee;
	}

}
