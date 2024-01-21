package com.health.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.main.model.Ledger;
import com.health.main.service.LedgerService;

@CrossOrigin("*")


@RestController
@RequestMapping("/ledger")
public class LedgerController {
	@Autowired LedgerService ledgerService;
	
	@PostMapping("/create_ledger")
	public ResponseEntity<Ledger> createLedger(@RequestBody Ledger ledger)
	{
		ledgerService.saveLedgerDetails(ledger);
		 return new ResponseEntity(ledger,HttpStatus.CREATED);
		}
}
