package com.customer.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.model.Signup;

@Repository
public interface Userrepo extends MongoRepository<Signup, Integer>{


}
