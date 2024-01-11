package com.health.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.health.main.model.Employee;
import com.health.main.repository.EmployeeRepository;
import com.health.main.service.EmailService;
import com.health.main.utility.EmailUtility;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired EmployeeRepository employeeRepository;
	@Autowired
	EmailUtility emailUtility;
	
	@Override
	public void sendEmail(int employeeId) {
		// TODO Auto-generated method stub
		 Optional<Employee> optionalEmployee= employeeRepository.findById(employeeId);
		 if(optionalEmployee.isPresent())
		 {
		    emailUtility.emailSend(optionalEmployee.get());
		 }
	
	}

}
