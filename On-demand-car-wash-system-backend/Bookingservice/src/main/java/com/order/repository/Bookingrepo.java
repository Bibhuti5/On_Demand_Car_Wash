package com.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.model.Bookingdetails;
@Repository
public interface Bookingrepo  extends MongoRepository<Bookingdetails, Integer>{
	
	boolean save(int id);


	
	

}
