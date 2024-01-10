package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.EmailDetails;
import com.health.main.service.EmailService;

@RestController("/mail")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@Value("${spring.mail.username}")
	String fromMail;
	
	@PostMapping("/auth_mail")
	public String sendEmail(@RequestBody EmailDetails emailDetails)
	{
		emailDetails.setFromEmail(fromMail);
		
		try
		{
			emailService.sendEmail(emailDetails);
		}
		catch (Exception e2) {
			// TODO: handle exception
			//System.out.println(e2);
			return "Email sending fail";
		}
		
		return "Send Email";
	}

}
