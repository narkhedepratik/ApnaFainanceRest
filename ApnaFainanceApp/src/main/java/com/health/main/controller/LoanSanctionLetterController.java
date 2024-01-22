package com.health.main.controller;

import java.io.ByteArrayInputStream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/get_pdf")
	public ResponseEntity<InputStreamResource> getPdf()
	{
		ByteArrayInputStream pdfArray=loanSanctionService.createPdf();
		HttpHeaders header=new HttpHeaders();
		header.set("Content-Disposition", "attachment; filename=SanctionLoan.pdf");
		return ResponseEntity.ok()
				.headers(header)
				.contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(pdfArray));
	}
	
	

}
