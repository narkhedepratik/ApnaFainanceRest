package com.health.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String customerDateOfBirth;
	private int customerAge;
	private String customerGender;
	@Column(unique = true)
	private String customerEmail;
	private long customerMobileNumber;
	private double customerTotalLoanRequired;
	private String customerAddress;
	private String customerCity;
	private long customerAccountNumber;
	
	
	
	
	
	

	

	

	
	






	

}
