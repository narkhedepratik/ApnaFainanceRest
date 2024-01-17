package com.health.main.service;

import java.util.List;

import com.health.main.model.Enquiry;

public interface EnquiryService {

	public void saveEnquiry(Enquiry enquiry);

	public List<Enquiry> getAllenquiry();

	public Enquiry setCibliDetails(int id);

	

	public Enquiry updateEnquiryDetails(Enquiry enquiry);

}
