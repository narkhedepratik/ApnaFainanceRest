package com.health.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerLoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerLoanId;
	private int customerLoanNo;
	private double loanAmount;
	private float rateOfInterest;
	private int tenure;
	private double totalAmountToBePaid;
	private float processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EMIDetails emiDetails;
}
