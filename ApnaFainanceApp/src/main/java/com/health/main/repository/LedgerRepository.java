package com.health.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.main.model.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Integer>{

}
