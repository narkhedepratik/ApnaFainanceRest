package com.health.main.serviceimpl;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.SanctionLetter;
import com.health.main.repository.LoanSanctionRepository;
import com.health.main.service.LoanSanctionService;
import com.health.main.utility.LoanSanctionUtility;
@Service
public class LoanSanctionServiceImplementation implements LoanSanctionService{
@Autowired LoanSanctionRepository loanSanctionRepository;
@Autowired LoanSanctionUtility loanSanctionUtility;
	@Override
	public SanctionLetter saveLoanSanctionDetails(SanctionLetter sanctionLetter) {
				sanctionLetter=loanSanctionRepository.save(sanctionLetter);
		return sanctionLetter;
	}
	@Override
	public ByteArrayInputStream createPdf() {
		
		ByteArrayInputStream input=loanSanctionUtility.generatePdf();
		return input;
		
	}

}
