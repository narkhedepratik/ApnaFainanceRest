package com.health.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.main.model.Ledger;
import com.health.main.repository.LedgerRepository;
import com.health.main.service.LedgerService;
@Service
public class LedgerServiceImpl implements LedgerService{
	@Autowired private LedgerRepository ledgerRepository;
	


	@Override
	public void saveLedgerDetails(Ledger ledger) {
		ledgerRepository.save(ledger);
	}
}