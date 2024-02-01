package com.health.main.controller;


import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.health.main.model.Customer;
import com.health.main.service.CustomerService;
@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired private CustomerService customerService;
	

	@PostMapping("/create_customer")
	public ResponseEntity createLoanApplication(
			@RequestPart("panCard") MultipartFile panCard,
			@RequestPart("aadharCard") MultipartFile aadharCard,
			@RequestPart("photo") MultipartFile photo,
			@RequestPart("signature") String signature,
			@RequestPart("loanApplicationJson") String loanApplicationJson
			)
	 {
	Customer loanApplication = customerService.saveLoanApplication(panCard,aadharCard,photo,signature,loanApplicationJson);
		return new ResponseEntity(HttpStatus.CREATED);
	}

	
	@DeleteMapping("/delete/{customerId}")
	public ResponseEntity <Customer>deleteCustomer(@PathVariable   UUID customerId)
	{
		customerService.deleteCustomer(customerId);
		return new ResponseEntity<Customer>(HttpStatus.GONE);

	}
	@GetMapping("/getAllCustomer")
	public ResponseEntity<?> getAllCustomer()
	{
		List<Customer> list = customerService.getAllCustomer();
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	@GetMapping("Customer/{customerId}")
	public Customer getSingaleCustomer(@PathVariable ("customerId")  UUID id) {
		 Customer Customer =    customerService.getSingleCustomer(id);
		
		return Customer;
	}
}
	
