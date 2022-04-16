package com.order.repository.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.order.model.Bookingdetails;
import com.order.model.DatabaseSequence;
import com.order.repository.Bookingrepo;

@Service
public class BookingserviceImplementation implements Bookingservice {


	@Autowired
	private Bookingrepo repo;

	@Override
	public void addorder(Bookingdetails booking) {
		// TODO Auto-generated method stub
		repo.save(booking);
		
	}

	@Override
	public List<Bookingdetails> orderdetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateorder(Bookingdetails update) {
		// TODO Auto-generated method stub
	
		repo.save(update);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	 @Autowired
	  private MongoOperations mongoOperations;



	  public Long getSequenceNumber(String sequenceName) {
	  //get sequence no
	  Query query = new Query(Criteria.where("id").is(sequenceName));
	  //update the sequence no
	  Update update = new Update().inc("seq", 1);
	  //modify in document
	  DatabaseSequence counter = mongoOperations.findAndModify(query,
	  update, options().returnNew(true).upsert(true),
	  DatabaseSequence.class);



	  return !Objects.isNull(counter) ? counter.getSeq() : 1;



	  }

}

	
	




	
