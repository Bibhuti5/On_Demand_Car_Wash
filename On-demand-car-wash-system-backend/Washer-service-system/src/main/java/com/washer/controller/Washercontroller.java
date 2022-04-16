package com.washer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.washer.model.Bookingdetails;
import com.washer.model.CustomerRating;
import com.washer.model.Washers;
import com.washer.service.WashService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/wash")
public class Washercontroller {

	@Autowired
	private WashService service;
	

	@Autowired
	private RestTemplate restTemplate;
	
	
	//Washer Operations
	@PostMapping("/addwasher")
	@ApiOperation(value = "Adds new washer")
	public Washers saveWasher(@RequestBody Washers washer) {
		return service.addWasher(washer);
	}
	
	@GetMapping("/allwashers")
	@ApiOperation(value = "Gets all washers")
	public List<Washers> findAllwashers() {
		return service.getwashers();
	}

	@GetMapping("/allwashers/{location}")
	@ApiOperation(value = "To find washer by location")
	public List<Washers> findwasherByAddress(@PathVariable String location) {
		return service.getwasherbylocation(location);
	}

	@DeleteMapping("/delete")
	@ApiOperation(value = "Deletes washer")
	public Washers removeUser(@RequestBody Washers washer) {
		service.deletewasher(washer);
		return washer;
	}
	
	
	/*------------------ Resttemplates---------------------------- */
	@GetMapping("/allratings")
	@ApiOperation(value = "Gets all ")
	public List<CustomerRating> getwashpacks() {
		String baseurl = "http://localhost:8081/admin/allratings";
		CustomerRating[] wp = restTemplate.getForObject(baseurl,CustomerRating[].class);
		return Arrays.asList(wp);
	}
	
	
	
        
		@GetMapping("/allbooking")
		@ApiOperation(value = "Gets all orders")
		public List<Bookingdetails> getallbookings(){
			String baseurl="http://localhost:8083/order/allorders";
			Bookingdetails[] allorders=restTemplate.getForObject(baseurl, Bookingdetails[].class);
			
			return Arrays.asList(allorders);
	
	
	


	
}
		
}
