package com.health.main.service;

import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.health.main.model.Customer;

public interface CustomerService {

	Customer saveLoanApplication(MultipartFile panCard, MultipartFile aadharCard, MultipartFile photo, String signature,
			String loanApplicationJson);

	
	void deleteCustomer(UUID customerId);

	

}
