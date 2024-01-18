package com.health.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.health.main.model.Employee;
//<<<<<<< HEAD
//import com.health.main.repository.EmployeeRepository;
//import com.health.main.service.EmailService;
//import com.health.main.utility.EmailUtility;
//
//@Service
//public class EmailServiceImpl implements EmailService {
//
//	@Autowired EmployeeRepository employeeRepository;
//	@Autowired
//	EmailUtility emailUtility;
//	
//	@Override
//	public void sendEmail(int employeeId) {
//		// TODO Auto-generated method stub
//		 Optional<Employee> optionalEmployee= employeeRepository.findById(employeeId);
//		 if(optionalEmployee.isPresent())
//		 {
//		    emailUtility.emailSend(optionalEmployee.get());
//		 }
//	
//=======
import com.health.main.model.Enquiry;
import com.health.main.repository.EmployeeRepository;
import com.health.main.repository.EnquiryRepository;
import com.health.main.service.EmailService;
import com.health.main.utility.EmailUtility;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired 
	EmployeeRepository employeeRepository;
	@Autowired
	EnquiryRepository enquiryRepository;
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

	@Override
	public void sendCibilMail(int customerID) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void sendCibilMail(int customerID) {
//		// TODO Auto-generated method stub
//		Optional<Enquiry> optionalEnquiry = enquiryRepository.findById(customerID);
//		if(optionalEnquiry.isPresent())
//		{
//			emailUtility.sendCIBILMail(optionalEnquiry.get());
//		}
//	}

}
