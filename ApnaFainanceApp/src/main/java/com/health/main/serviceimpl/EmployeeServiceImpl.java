package com.health.main.serviceimpl;


import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.health.main.exception.EmailIdAlreadyExistsException;
import com.health.main.exception.InvalidAuthDetailsException;

import com.health.main.model.Employee;
import com.health.main.repository.EmployeeRepository;
import com.health.main.service.EmployeeService;
import com.health.main.utility.PasswordGenrator;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmployeeDetails(Employee employee)  {
		
	Optional<Object> existingEmployee=Optional.ofNullable(employeeRepository.findByEmployeeEmail(employee.getEmployeeEmail()));
		
	if(existingEmployee.isPresent()) {
		
			throw new EmailIdAlreadyExistsException("This Email id is already registered. Try with another ");
		}
	else {
		      
		employee.setPassword(PasswordGenrator.getPassword(employee.getEmployeeName()));
		   
		    Employee databaseEmployee = employeeRepository.save(employee);
		
		return databaseEmployee;
	      }
//<<<<<<< HEAD
//=======
	}
	
//	@Override
//	public Employee loginCheck(String employeeEmail, String password) {
//		
//
//		
//		Employee employee=employeeRepository.findByEmployeeEmailAndPassword(employeeEmail, password);
//		
//		
//		if(employee == null) {
//			
//			throw new InvalidAuthDetailsException("Invalid username or password");
//		}
//		return employee;
////>>>>>>> refs/remotes/origin/main
//	}
	
	@Override
	public Employee loginCheck(String employeeEmail, String password) {
		

		
		Employee employee=employeeRepository.findByEmployeeEmailAndPassword(employeeEmail, password);
		
		
		if(employee == null) {
			
			throw new InvalidAuthDetailsException("Invalid username or password");
		}
		return employee;
	}

	
//<<<<<<< HEAD
//<<<<<<< HEAD
//	@Override
//	public void deletesingleEmployee( int id) {
//
//		employeeRepository.deleteById( id);
//	}

//=======
//	public List<Employee> getAllEmployees() {
//		List<Employee> employeeList=employeeRepository.findAll();
//		return employeeList;
//	}

//	@Override
//	public Employee getSingleEmployee(int employeeId) {
//	Optional<Employee> employee=	employeeRepository.findById(employeeId);
//		return employee.get();
//		
//	}

//	@Override
//	public Employee updateEmployeeDetails(Employee employee) {
//		employee =employeeRepository.save(employee);
//		return employee;
//	}


	
	
//>>>>>>> refs/heads/pratik
////=======
//	public List<Employee> getAllEmployees() {
//		List<Employee> employeeList=employeeRepository.findAll();
//		return employeeList;
//	}

//	@Override
//	public Employee getSingleEmployee(int employeeId) {
//	Optional<Employee> employee=	employeeRepository.findById(employeeId);
//		return employee.get();
//		
//	}

//	@Override
//	public Employee updateEmployeeDetails(Employee employee) {
//		employee =employeeRepository.save(employee);
//		return employee;
//	}

//	@Override
//	public void deleteEmployee(int employeeId) {
//		employeeRepository.deleteById(employeeId);
//		
//			
//		
//	}

	

	
	

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList=employeeRepository.findAll();
		return employeeList;
	}

	@Override
	public Employee getSingleEmployee(int employeeId) {
	Optional<Employee> employee=	employeeRepository.findById(employeeId);
		return employee.get();
		
	}

	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		employee =employeeRepository.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
		
			
		
	}

	@Override
	public void deletesingleEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
