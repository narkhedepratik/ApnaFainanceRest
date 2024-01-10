package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.Enquiry;
import com.health.main.repository.EnquiryRepository;
import com.health.main.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	
	@Autowired private  EnquiryRepository enquiryRepository;
	

	@Override
	public void saveEnquiry(Enquiry enquiry) {
		enquiryRepository.save(enquiry);
		
	}

}
