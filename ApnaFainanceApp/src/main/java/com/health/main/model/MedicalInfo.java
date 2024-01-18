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
public class MedicalInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billId;
	private int patientId;
	private String billingDate;
	private String treatment;
	
}
