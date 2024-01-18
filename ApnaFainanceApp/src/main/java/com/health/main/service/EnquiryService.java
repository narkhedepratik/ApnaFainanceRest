package com.health.main.service;

import java.util.List;

import com.health.main.model.Enquiry;

public interface EnquiryService {

	public void saveEnquiry(Enquiry enquiry);

	public List<Enquiry> getAllenquiry();

	public Enquiry setCibliDetails(int id);

	public void delete(int customerID);

//<<<<<<< HEAD
//	public void delete(int id);
//=======
//>>>>>>> refs/remotes/origin/main
	public Enquiry getSingleEnquiry(int enquiryID);

	


}
