
package com.health.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.service.EmailService;

@RestController
@RequestMapping("/mail")
public class EmailController {
	
	
	@Autowired
	EmailService emailService;
	
	@GetMapping("/auth_mail/{employeeId}")
	public ResponseEntity sendEmail(@PathVariable int employeeId) {
		
		try
		{
			emailService.sendEmail(employeeId);
		}
		catch (Exception e2) {
			// TODO: handle exception
			//System.out.println(e2);
			return  new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
		}
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/cibil_mail/{customerID}")
	public ResponseEntity sendEmailCibil(@PathVariable int customerID)
	{
		
		try
		{
			emailService.sendCibilMail(customerID);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity(HttpStatus.OK);
		
	}
}
