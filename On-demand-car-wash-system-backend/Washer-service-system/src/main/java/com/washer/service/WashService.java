package com.washer.service;

import java.util.List;

import com.washer.model.Washers;








public interface WashService {

	public Washers addWasher(Washers washer);

	public List<Washers> getwashers();

	public List<Washers> getwasherbylocation(String location);

	public void deletewasher(Washers washer);

}
