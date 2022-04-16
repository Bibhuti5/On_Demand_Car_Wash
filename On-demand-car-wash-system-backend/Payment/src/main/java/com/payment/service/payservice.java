package com.payment.service;

//import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

//import java.util.Objects;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;


import com.payment.model.paymentdetails;
import com.payment.repository.paymentrepo;

@Service
public class payservice {
	@Autowired
	private paymentrepo repo;
	
	public paymentdetails pay(paymentdetails payment) {
		payment.setPaymentstatus(paystatus());
		payment.setTransId(UUID.randomUUID().toString());
		return repo.save(payment);
	}
	
	private String paystatus() {
		return new Random().nextBoolean()?"success":"failure";
	}
	
	
	
	
	/*
	 * @Autowired private MongoOperations mongoOperations;
	 * 
	 * 
	 * 
	 * public long getSequenceNumber(String sequenceName) { //get sequence no Query
	 * query = new Query(Criteria.where("id").is(sequenceName)); //update the
	 * sequence no Update update = new Update().inc("seq", 1); //modify in document
	 * DatabaseSequence counter = mongoOperations.findAndModify(query, update,
	 * options().returnNew(true).upsert(true), DatabaseSequence.class);
	 * 
	 * 
	 * 
	 * return !Objects.isNull(counter) ? counter.getSeq() : 1;
	 * 
	 * 
	 * 
	 * }
	 */

}
