package com.health.main.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.health.main.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID>{

}
