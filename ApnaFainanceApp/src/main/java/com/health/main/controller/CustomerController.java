package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.Customer;
import com.health.main.model.Employee;
import com.health.main.service.CustomerService;
@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired private CustomerService customerService;
	
	@PostMapping("/create_customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
	{
	   Customer storedCustomer = customerService.saveCustomerDetails(customer) ;
		
		return new ResponseEntity<Customer>(storedCustomer, HttpStatus.CREATED);
	}

}
