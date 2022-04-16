package com.washer.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.washer.model.Washers;

public interface WasherRepo extends MongoRepository<Washers, Integer> {

	List<Washers> findBylocation(String location);
	
	Washers findByName(String name);

	
	
}
