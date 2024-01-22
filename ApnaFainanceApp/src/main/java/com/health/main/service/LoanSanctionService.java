package com.health.main.service;

import java.io.ByteArrayInputStream;

import com.health.main.model.SanctionLetter;

public interface LoanSanctionService {

	SanctionLetter saveLoanSanctionDetails(SanctionLetter sanctionLetter);

	public ByteArrayInputStream createPdf();

	

}
