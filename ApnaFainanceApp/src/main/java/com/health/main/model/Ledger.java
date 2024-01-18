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
public class Ledger{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int ledgerId;
private String ledgerCreatedDate;
private long totalLoanAmount;
private long payableAmountWithInterest;
private int tenure;
private double monthlyEMI;
private String amountPaidTillDate;
private long remainingAmount;
private String nextEmiDateStart;
private String nextEmiDateEnd;
private int defaulterCount;
private String previousEmiStatus;
private String currentMonthEmiStatus;
private String loanEndDate;
private String loanStatus;
}
