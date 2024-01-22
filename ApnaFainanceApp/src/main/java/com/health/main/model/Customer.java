package com.health.main.model;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)

	private UUID customerId;
	private String customerName;
	private String customerDateOfBirth;
	private int customerAge;
	private String customerGender;
	@Column(unique = true)
	private String customerEmail;
            
	private long customerMobileNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDocuments customerDocuments=new CustomerDocuments();
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MedicalInfo medicalInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private cibilSCore cibilSCore;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerLoanDetails customerLoanDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loanDisbursement;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Ledger> ledger;
	
	@OneToOne(cascade = CascadeType.DETACH.MERGE.REFRESH.REMOVE)
	private SanctionLetter sanctionLetter;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerVerification;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Enquiry enquiry;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	

	
	






	

}
