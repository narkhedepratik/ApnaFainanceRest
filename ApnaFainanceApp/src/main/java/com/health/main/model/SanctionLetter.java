package com.health.main.model;

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
public class SanctionLetter{
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sanctionId;
	private String sactionDate;
	private String applicantName;
	private Double contactDetails;
	private  Double loanAmtSanctioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private Double monthlyEmiAmount;
	private String modeOfpayment;
	private String remarks;
	private String termsCondition;
	private String status;
	
}