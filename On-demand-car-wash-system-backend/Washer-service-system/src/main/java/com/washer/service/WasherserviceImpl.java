package com.washer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.Repository.WasherRepo;
import com.washer.model.Washers;
@Service
public class WasherserviceImpl implements WashService {
	@Autowired
	private WasherRepo repo;

	@Override
	public Washers addWasher(Washers washer) {
		// TODO Auto-generated method stub
		return repo.save(washer);
	}

	@Override
	public List<Washers> getwashers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Washers> getwasherbylocation(String location) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deletewasher(Washers washer) {
		// TODO Auto-generated method stub
		repo.delete(washer);
		
	}

	
	
	
	
	

}
