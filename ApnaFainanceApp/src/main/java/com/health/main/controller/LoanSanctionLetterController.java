package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.SanctionLetter;
import com.health.main.service.LoanSanctionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("*")
@RestController
@RequestMapping("/Loan")
public class LoanSanctionLetterController {
	@Autowired
	LoanSanctionService loanSanctionService;
	@PostMapping("/create_LoanSanctionLetter")
	public ResponseEntity createLoanSanctionLetter(@RequestBody SanctionLetter sanctionLetter) {
		sanctionLetter=loanSanctionService.saveLoanSanctionDetails(sanctionLetter);
		
		return new ResponseEntity(sanctionLetter,HttpStatus.CREATED);
	}
	
	
	

}
