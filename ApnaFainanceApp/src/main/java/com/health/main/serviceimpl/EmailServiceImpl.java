package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.EmailDetails;
import com.health.main.service.EmailService;
import com.health.main.utility.EmailUtility;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailUtility emailUtility;
	
	@Override
	public void sendEmail(EmailDetails emailDetails) {
		// TODO Auto-generated method stub
		emailUtility.emailSend(emailDetails);
	}

}
