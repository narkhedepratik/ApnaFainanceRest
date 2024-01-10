package com.health.main.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.health.main.model.EmailDetails;

@Component
public class EmailUtility {
	
	@Autowired
	 JavaMailSender javaMailSender;
		
		public void emailSend(EmailDetails emailDetails) {
			// TODO Auto-generated method stub
			
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(emailDetails.getToEmail());
			mailMessage.setFrom(emailDetails.getFromEmail());
			mailMessage.setSubject(emailDetails.getSubject());
			mailMessage.setText(emailDetails.getTextMsg());
			
			javaMailSender.send(mailMessage);
			
		
			}

}
