package com.customer.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.customer.model.DatabaseSequence;
import com.customer.model.Signup;
import com.customer.repository.Userrepo;


@Service
public class CustomerServiceImplementation implements Customerservice{

	
	@Autowired
	private Userrepo repo;
	
	
	
	@Override
	public Signup addUser(Signup signup) {
		return repo.save(signup);
	
	}

	@Override
	public List<Signup> getuser() {
		List<Signup> users=repo.findAll();
		return users;
	}

	@Override
	public String Updateuser(Signup update) {
		   repo.save(update);
		    return "user updated";
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 return "Deleted sucessfully of Id:"+id;
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

	@Override
	public void deleteUser(Signup user) {
		// TODO Auto-generated method stub
		repo.delete(user);}}
		
	

	