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
public class EMIDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiId;
	private double emiMonthlyAmount;
	private String nextEmiDueDate;
	private String previousEmiStatus;
}
