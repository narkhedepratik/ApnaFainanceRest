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
public class LocalAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int localAddressId;
	private String areaname;
	 private String cityname;
	 private String district;
	 private String state;
	 private int pincode;
}
