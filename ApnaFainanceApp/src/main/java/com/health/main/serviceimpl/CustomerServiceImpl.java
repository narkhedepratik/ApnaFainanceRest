package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.Customer;
import com.health.main.repository.CustomerRepository;
import com.health.main.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		Customer databaseCustomer=customerRepository.save(customer);
		return databaseCustomer;
	}
	

}
