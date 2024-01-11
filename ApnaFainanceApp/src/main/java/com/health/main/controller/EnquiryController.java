package com.health.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.Enquiry;
import com.health.main.service.EnquiryService;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {
	
	@Autowired private EnquiryService enquiryservice;
	@PostMapping("/create_enquiry")
	public ResponseEntity createEnquiry(@RequestBody Enquiry enquiry)
	{
		enquiryservice.saveEnquiry(enquiry);
	 return new ResponseEntity(HttpStatus.CREATED);
	}

	@GetMapping("/enquiries")
	public ResponseEntity<?>getallenquiry()
	{
		
		List<Enquiry>list = enquiryservice.getAllenquiry();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
