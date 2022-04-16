package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.payment.model.paymentdetails;
import com.payment.service.payservice;
@RestController
@RequestMapping("/gateway")
public class paycontroller {
	
	@Autowired
	public payservice service;
	
	@PostMapping("/pay")
	public paymentdetails pay(@RequestBody paymentdetails payment) {
	//	payment.setTransId(service.getSequenceNumber(paymentdetails.SEQUENCE_NAME));
		return service.pay(payment);
	}

}
