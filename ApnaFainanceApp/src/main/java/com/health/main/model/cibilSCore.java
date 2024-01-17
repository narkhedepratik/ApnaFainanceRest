package com.health.main.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.health.main.enums.CibilStatus;

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
public class cibilSCore {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;	 
	private int cibilScore;	 
	@CreationTimestamp
	private Date cibilScoreDateTime;
	@Enumerated(EnumType.STRING)
	private CibilStatus status;

}
