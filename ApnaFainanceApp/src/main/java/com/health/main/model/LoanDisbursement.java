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
public class LoanDisbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agreementId;
	private int loanNo;
	private String agreementDate;
	private String amountPayType;
	private double totalAmount;
	private long accountNumber;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;
	
}
