package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.LoanDisbursement;
import com.health.main.service.LoanDisbursementService;

@RestController
@RequestMapping("LoanDisbursement")
public class LoanDisbursementController {

	@Autowired private LoanDisbursementService disbursementService;
	@PostMapping("/savedisbursement")
	public ResponseEntity<?> savedisbursementdata(@RequestBody LoanDisbursement disbursement)
	{
		disbursementService.savaLoanDisbursementdata(disbursement);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
}
