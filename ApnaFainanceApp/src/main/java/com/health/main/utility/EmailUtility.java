package com.health.main.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.health.main.constant.MailConstant;

import com.health.main.model.Employee;
//<<<<<<< HEAD
//
//@Component
//public class EmailUtility {
//	
//	@Value("${spring.mail.username}")private String FROMEMAIL;
//	
//	@Autowired
//	 JavaMailSender javaMailSender;
//		
//		public void emailSend(Employee employee) {
//			// TODO Auto-generated method stub
//			String text="Hello "+employee.getEmployeeName()+", \n  Thank you, for registering with ApnaFianace.\n We are pleased to have"
//					+ " you on board.\n Your email ID is: ["+employee.getEmployeeEmail()+"] Your"
//					+ " password is: ["+employee.getPassword()+"] \n    Please ensure to keep your "
//					+ "password secure. You can also reset your password in case you forget "
//					+ "it.We look forward to a great association with you.If you have any "
//					+ "further queries or need assistance, please do not hesitate to reach out"
//					+ " to us. \n \n \n Best Regards, \n ApnaFianace";
//		
//			SimpleMailMessage mailMessage = new SimpleMailMessage();
//			mailMessage.setTo(employee.getEmployeeEmail());
//			mailMessage.setFrom(FROMEMAIL);
//			mailMessage.setSubject(MailConstant.SUBJECT);
//			mailMessage.setText(text);
//			
//			javaMailSender.send(mailMessage);
//			
//		
//			}
//
//=======
import com.health.main.model.Enquiry;

@Component
public class EmailUtility {
	
	@Value("${spring.mail.username}")
	private String FROMEMAIL;
	
	
	@Autowired
	 JavaMailSender javaMailSender;
		
		public void emailSend(Employee employee) {
			// TODO Auto-generated method stub
			String text="Dear "+employee.getEmployeeName()+","
					+ "\n\n                    Thank you, for registering with ApnaFianace."
					+ "We are pleased to have you on board."
					+ "\n\n Your email ID is: ["+employee.getEmployeeEmail()+"] "
					+ "\n Your password is: ["+employee.getPassword()+"] "
					+ "\n\n Please ensure to keep your password secure. You can also reset your password in case you forget it."
					+ "\n\n We look forward to a great association with you."
					+ "\n\n If you have any further queries or need assistance, please do not hesitate to reach out to us."
					+ "\n \n \n Best Regards , \n ApnaFianace";
		
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(employee.getEmployeeEmail());
			mailMessage.setFrom(FROMEMAIL);
			mailMessage.setSubject(MailConstant.SUBJECT);
			mailMessage.setText(text);
			
			javaMailSender.send(mailMessage);
			
			}
		
		public void sendCIBILMail(Enquiry enquiry)
		{
		if(enquiry.getCibil().getCibilScore()>600)
		{
			String text = "Dear Customer,"
					+ "\n \n             Congratulation !!As per your CIBIL SCORE and loan History, Your medical loan is Pre-Approved."
					+ "\n \n We are pleased to provide you with the cibil details for Medical Loan in Apnafinance. Please keep this information confidential and do not share it with unauthorized individuals."
					+ "\n\n Cibil Details:"
					+ "\n - Cibil Id: ["+enquiry.getCibil().getCibilId()+"]"
					+ "\n - Cibil Score: ["+enquiry.getCibil().getCibilScore()+"]"
					+ "\n - Cibil Score Date Time: ["+enquiry.getCibil().getCibilScoreDateTime()+"]"
					+ "\n - Cibil Status: ["+enquiry.getCibil().getStatus()+"]"
					+ "\n\n* Apply now and Get Medical Loan Today."
					+ "\n\n Thank you for using Apnafinance. "
					+ "\n\n We appreciate your business"
					+ "\n\n\nBest Regards,"
					+ "\n Apnafinance";
			
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(enquiry.getEmail());
			mailMessage.setFrom(FROMEMAIL);
			mailMessage.setSubject(MailConstant.cibilSubject);
			mailMessage.setText(text);
			
			javaMailSender.send(mailMessage);
			
			}
			else
			{
				String text = "Dear Customer,"
						+ "\n \n             Sorry..!!As per your CIBIL SCORE and loan History, Your medical loan is not Approved."
						+ "\n\n Cibil Details:"
						+ "\n - Cibil Id: ["+enquiry.getCibil().getCibilId()+"]"
						+ "\n - Cibil Score: ["+enquiry.getCibil().getCibilScore()+"]"
						+ "\n - Cibil Score Date Time: ["+enquiry.getCibil().getCibilScoreDateTime()+"]"
						+ "\n - Cibil Status: ["+enquiry.getCibil().getStatus()+"]"
						+ "\n\n Thank you for using Apnafinance. "
						+ "\n\n\nBest Regards,"
						+ "\n Apnafinance";
				
				SimpleMailMessage mailMessage = new SimpleMailMessage();
				mailMessage.setTo(enquiry.getEmail());
				mailMessage.setFrom(FROMEMAIL);
				mailMessage.setSubject(MailConstant.cibilSubject);
				mailMessage.setText(text);
				
				javaMailSender.send(mailMessage);
				
		}
		}
//>>>>>>> refs/remotes/origin/main
}
