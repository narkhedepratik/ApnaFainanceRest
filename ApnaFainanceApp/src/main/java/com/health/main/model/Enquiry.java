package com.health.main.model;

import com.health.main.enums.EnquiryStatus;
import com.health.main.enums.Profile;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//public class Enquiry {
//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//	private int customerID;		 
//	private String firstName;		 
//	private String lastName; 
//	private int age;	 
//	private String email;	
//	private long mobileNo;
//	private String  pancardNo;
//	@Enumerated(EnumType.STRING)
//	private EnquiryStatus  enquiryStatus;
//	@OneToOne(cascade=CascadeType.MERGE.DETACH.REFRESH.REMOVE)
////	private CibilSCore cibil;
////=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Enquiry {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int customerID;		 
	private String firstName;		 
	private String lastName; 
	private int age;
	private String email;	
	private long mobileNo;
	private String  pancardNo;
	@Enumerated(EnumType.STRING)
	private EnquiryStatus  enquiryStatus;
	@OneToOne(cascade=CascadeType.MERGE.DETACH.REFRESH.REMOVE)
//>>>>>>> refs/remotes/origin/main
	private cibilSCore cibil;
}
