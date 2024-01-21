package com.health.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.enums.CibilStatus;
import com.health.main.enums.EnquiryStatus;
//<<<<<<< HEAD
import com.health.main.model.Enquiry;
//<<<<<<< HEAD
//import com.health.main.model.CibilSCore;
//import com.health.main.repository.EnquiryRepository;
//import com.health.main.service.EnquiryService;
//
//@Service
//public class EnquiryServiceImpl implements EnquiryService {
//
//	
//	@Autowired private  EnquiryRepository enquiryRepository;
//	
//	private final Random CIBIL_RANDOM=new Random();
//
//	@Override
//	public void saveEnquiry(Enquiry enquiry) {
//		enquiry.setEnquiryStatus(EnquiryStatus.REGISTRED);
//		enquiryRepository.save(enquiry);
//		
//	}
//
//
//	@Override
//	public List<Enquiry> getAllenquiry() {
//		
//		return (List<Enquiry>)enquiryRepository.findAll();
//	}
//
//
//	@Override
//	public Enquiry setCibliDetails(int id) {
//		
//		Optional<Enquiry> optionalEnquiry = enquiryRepository.findById(id);
//		if(optionalEnquiry.isPresent())
//		{
//			Enquiry enquiry=optionalEnquiry.get();
//			CibilSCore cibilSCore=new CibilSCore();
//			cibilSCore.setCibilScore(this.CIBIL_RANDOM.nextInt(300, 900));
//			
//			if(cibilSCore.getCibilScore()<=500) cibilSCore.setStatus(CibilStatus.POOR);
//			else if(cibilSCore.getCibilScore()>500 && cibilSCore.getCibilScore()<=600)
//				cibilSCore.setStatus(CibilStatus.AVERAGE);
//			else if(cibilSCore.getCibilScore()>600 && cibilSCore.getCibilScore()<800)
//				cibilSCore.setStatus(CibilStatus.GOOD);
//			else cibilSCore.setStatus(CibilStatus.EXCELLENT);
//			enquiry.setEnquiryStatus(EnquiryStatus.CIBIL_PROCESSING);
//			enquiry.setCibil(cibilSCore);	
//			enquiryRepository.save(enquiry);
//		}
//		
//		return null;
//	}
//
//
//	@Override
//	public void delete(int customerID) {
//enquiryRepository.deleteById(customerID);		
//	}
//
////<<<<<<< HEAD
////
////	@Override
////	public void delete(int id) {
////		
////		enquiryRepository.deleteById(id);
////		// TODO Auto-generated method stub
////		
////	}
////
////=======
////>>>>>>> refs/remotes/origin/main
//=======
import com.health.main.model.cibilSCore;
import com.health.main.repository.EnquiryRepository;
import com.health.main.service.EnquiryService;
//
//@Service
//public class EnquiryServiceImpl implements EnquiryService {
//
//	
//	@Autowired private  EnquiryRepository enquiryRepository;
//	
//	private final Random CIBIL_RANDOM=new Random();
//
//	@Override
//	public void saveEnquiry(Enquiry enquiry) {
//		enquiry.setEnquiryStatus(EnquiryStatus.REGISTRED);
//		enquiryRepository.save(enquiry);
//		
//	}
//
//
//	@Override
//	public List<Enquiry> getAllenquiry() {
//		
//		return (List<Enquiry>)enquiryRepository.findAll();
//	}
//
//
//	@Override
//	public Enquiry setCibliDetails(int id) {
//		
//		Optional<Enquiry> optionalEnquiry = enquiryRepository.findById(id);
//		if(optionalEnquiry.isPresent())
//		{
//			Enquiry enquiry=optionalEnquiry.get();
//			cibilSCore cibilSCore=new cibilSCore();
//			cibilSCore.setCibilScore(this.CIBIL_RANDOM.nextInt(300, 900));
//			
//			if(cibilSCore.getCibilScore()<=500) cibilSCore.setStatus(CibilStatus.POOR);
//			else if(cibilSCore.getCibilScore()>500 && cibilSCore.getCibilScore()<=600)
//				cibilSCore.setStatus(CibilStatus.AVERAGE);
//			else if(cibilSCore.getCibilScore()>600 && cibilSCore.getCibilScore()<800)
//				cibilSCore.setStatus(CibilStatus.GOOD);
//			else cibilSCore.setStatus(CibilStatus.EXCELLENT);
//			enquiry.setEnquiryStatus(EnquiryStatus.CIBIL_PROCESSING);
//			enquiry.setCibil(cibilSCore);	
//			enquiryRepository.save(enquiry);
//		}
//		
//		return null;
//	}
//
//
//	@Override
//	public Enquiry getSingleEnquiry(int enquiryID) {
//	    Optional<Enquiry> optionalEnquiry=enquiryRepository.findById(enquiryID);
//		return optionalEnquiry.get() ;
//	}
//
//
//	@Override
//	public void delete(int customerID) {
//		
//		enquiryRepository.deleteById(customerID);
//	}
//=======

import com.health.main.exception.EnquiryIdNullException;
import com.health.main.model.Employee;
import com.health.main.model.Enquiry;
import com.health.main.model.cibilSCore;
import com.health.main.repository.EnquiryRepository;
import com.health.main.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	
	@Autowired private  EnquiryRepository enquiryRepository;
	
	private final Random CIBIL_RANDOM=new Random();

	@Override
	public void saveEnquiry(Enquiry enquiry) {
		enquiry.setEnquiryStatus(EnquiryStatus.REGISTRED);
		enquiryRepository.save(enquiry);
		
	}


	@Override
	public List<Enquiry> getAllenquiry() {
		
		return (List<Enquiry>)enquiryRepository.findAll();
	}


	@Override
	public Enquiry setCibliDetails(int id) {
		
		Optional<Enquiry> optionalEnquiry = enquiryRepository.findById(id);
		if(optionalEnquiry.isPresent())
		{
			Enquiry enquiry=optionalEnquiry.get();
			cibilSCore cibilSCore=new cibilSCore();
			cibilSCore.setCibilScore(this.CIBIL_RANDOM.nextInt(300, 900));
			
			if(cibilSCore.getCibilScore()<=500) cibilSCore.setStatus(CibilStatus.POOR);
			else if(cibilSCore.getCibilScore()>500 && cibilSCore.getCibilScore()<=600)
				cibilSCore.setStatus(CibilStatus.AVERAGE);
			else if(cibilSCore.getCibilScore()>600 && cibilSCore.getCibilScore()<800)
				cibilSCore.setStatus(CibilStatus.GOOD);
			else cibilSCore.setStatus(CibilStatus.EXCELLENT);
			enquiry.setEnquiryStatus(EnquiryStatus.CIBIL_PROCESSING);
			enquiry.setCibil(cibilSCore);	
			enquiryRepository.save(enquiry);
		}
		
		return null;
	}


	@Override
	public Enquiry getSingleEnquiry(int enquiryID) {
	    Optional<Enquiry> optionalEnquiry=enquiryRepository.findById(enquiryID);
		return optionalEnquiry.get() ;
	}



	@Override
	public Enquiry updateEnquiryDetails(Enquiry enquiry) {
		
		Optional<Enquiry> existingEnquiry=enquiryRepository.findById(enquiry.getCustomerID());
         
		if(existingEnquiry.isPresent())
		{
			Enquiry existingEntity = existingEnquiry.get();

			enquiryRepository.save(enquiry);

			
			updateEnquiryStatusBasedOn(existingEntity);


			return enquiryRepository.save(existingEntity);

		}
		
		else {
			throw new EnquiryIdNullException("Enquiry ID Does Not Exist");
		}
			
	}


	private void updateEnquiryStatusBasedOn(Enquiry existingEntity) {
		existingEntity.setEnquiryStatus(EnquiryStatus.CIBIL_PROCESSING);
		
	}


	@Override
	public void delete(int customerID) {
	enquiryRepository.deleteById(customerID);
		
	}



	

}
