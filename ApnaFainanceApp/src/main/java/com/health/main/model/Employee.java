package com.health.main.model;


import org.springframework.web.bind.annotation.CrossOrigin;



import com.health.main.enums.Profile;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Employee {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	@Column(unique = true)
	private String employeeEmail;
	@Enumerated(EnumType.STRING)
	private Profile employeeProfile;
	private String password;
	
	
}
