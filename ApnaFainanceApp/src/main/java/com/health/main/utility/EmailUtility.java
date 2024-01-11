package com.health.main.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.health.main.constant.MailConstant;

import com.health.main.model.Employee;

@Component
public class EmailUtility {
	
	@Value("${spring.mail.username}")private String FROMEMAIL;
	
	@Autowired
	 JavaMailSender javaMailSender;
		
		public void emailSend(Employee employee) {
			// TODO Auto-generated method stub
			String text="Hello "+employee.getEmployeeName()+", \n  Thank you, for registering with ApnaFianace."
					+ "\n We are pleased to have"
					+ " you on board.\n Your email ID is: ["+employee.getEmployeeEmail()+"] Your"
					+ " password is: ["+employee.getPassword()+"] \n    Please ensure to keep your "
					+ "password secure. You can also reset your password in case you forget "
					+ "it.We look forward to a great association with you.If you have any "
					+ "further queries or need assistance, please do not hesitate to reach out"
					+ " to us. \n \n \n Best Regards, \n ApnaFianace";
		
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(employee.getEmployeeEmail());
			mailMessage.setFrom(FROMEMAIL);
			mailMessage.setSubject(MailConstant.SUBJECT);
			mailMessage.setText(text);
			
			javaMailSender.send(mailMessage);
			
			}
}
