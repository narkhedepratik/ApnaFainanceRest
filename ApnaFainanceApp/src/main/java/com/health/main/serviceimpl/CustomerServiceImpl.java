package com.health.main.serviceimpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.health.main.model.Customer;
import com.health.main.repository.CustomerRepository;
import com.health.main.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired private CustomerRepository customerRepository;

	@Override
	public Customer saveLoanApplication(MultipartFile panCard, MultipartFile aadharCard, MultipartFile photo,
			String signature, String loanApplicationJson) {
		

		ObjectMapper mapper=new ObjectMapper();
		
		try {
		Customer loanApplication	=mapper.readValue(loanApplicationJson,Customer.class);
			
			System.out.println(loanApplicationJson);
			
			loanApplication.getCustomerDocuments().setPanCard(panCard.getBytes());
			loanApplication.getCustomerDocuments().setAadharCard(aadharCard.getBytes());
			loanApplication.getCustomerDocuments().setPhoto(photo.getBytes());
			loanApplication.getCustomerDocuments().setSignature(signature.getBytes());
			
			System.out.println(loanApplication);
			customerRepository.save(loanApplication);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		customer=customerRepository.save(customer);
		return customer;
	}

	
	

}
