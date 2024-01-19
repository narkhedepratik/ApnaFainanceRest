package com.health.main.service;

import org.springframework.web.multipart.MultipartFile;

import com.health.main.model.Customer;

public interface CustomerService {

	Customer saveLoanApplication(MultipartFile panCard, MultipartFile aadharCard, MultipartFile photo, MultipartFile signature,
			String loanApplicationJson);

	

}
