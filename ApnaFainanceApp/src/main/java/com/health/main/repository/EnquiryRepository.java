package com.health.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.health.main.model.Enquiry;

@Repository
public interface EnquiryRepository extends CrudRepository<Enquiry,Integer>{




//	Object findBycustomerID(int customerID);

}
