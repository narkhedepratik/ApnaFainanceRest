package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.SanctionLetter;
import com.health.main.repository.LoanSanctionRepository;
import com.health.main.service.LoanSanctionService;
@Service
public class LoanSanctionServiceImplementation implements LoanSanctionService{
@Autowired LoanSanctionRepository loanSanctionRepository;
	@Override
	public SanctionLetter saveLoanSanctionDetails(SanctionLetter sanctionLetter) {
				sanctionLetter=loanSanctionRepository.save(sanctionLetter);
		return sanctionLetter;
	}

}
