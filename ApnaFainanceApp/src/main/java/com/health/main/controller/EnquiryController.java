package com.health.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/check_cibil/{id}")
	public ResponseEntity<Enquiry> genrateCibil(@PathVariable int id)
	{
	
	  Enquiry enquiry =enquiryservice.setCibliDetails(id);	
		return null;
	}
	
	@GetMapping("getbyId/{enquiryID}")
	public ResponseEntity getSingleEnquiry(@PathVariable int enquiryID) {
		Enquiry enquiry=enquiryservice.getSingleEnquiry(enquiryID);
		return new ResponseEntity(enquiry,HttpStatus.OK);
	}
	
	
}
