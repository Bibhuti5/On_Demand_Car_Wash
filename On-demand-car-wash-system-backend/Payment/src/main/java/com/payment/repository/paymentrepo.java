package com.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.model.paymentdetails;
@Repository
public interface paymentrepo extends MongoRepository<paymentdetails, Integer> {
	

}
