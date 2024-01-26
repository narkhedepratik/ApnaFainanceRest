package com.health.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.health.main.model.SanctionLetter;

@Repository
public interface LoanSanctionRepository extends CrudRepository<SanctionLetter, Integer>{

}
