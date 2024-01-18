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
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerAddressId;
	@OneToOne(cascade = CascadeType.ALL)
	private PermanentAddress permanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private LocalAddress localAddress;
}
