package com.health.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.main.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByEmployeeEmailAndPassword(String employeeEmail, String password);

}
