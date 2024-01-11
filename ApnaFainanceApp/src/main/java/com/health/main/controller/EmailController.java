package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	public String sendEmail(@PathVariable int employeeId) {
		
		try
		{
			emailService.sendEmail(employeeId);
		}
		catch (Exception e2) {
			// TODO: handle exception
			//System.out.println(e2);
			return "Error while sending mail";
		}
		
		return "Mail Sent Successfully...";
	}
}
