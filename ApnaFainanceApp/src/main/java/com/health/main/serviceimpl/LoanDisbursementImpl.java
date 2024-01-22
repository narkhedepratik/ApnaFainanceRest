package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.LoanDisbursement;
import com.health.main.repository.LoanDisbursementRepository;
import com.health.main.service.LoanDisbursementService;

@Service
public class LoanDisbursementImpl implements LoanDisbursementService{
	@Autowired LoanDisbursementRepository disbursementRepository;

	@Override
	public void savaLoanDisbursementdata(LoanDisbursement loanDisbursement) {
		disbursementRepository.save(loanDisbursement);
		
	}

}
