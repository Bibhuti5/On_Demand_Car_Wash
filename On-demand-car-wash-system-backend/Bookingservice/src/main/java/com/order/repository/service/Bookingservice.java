package com.order.repository.service;

import java.util.List;

import com.order.model.Bookingdetails;

public interface Bookingservice {

	public void addorder(Bookingdetails booking);

	public List<Bookingdetails> orderdetails();

	public void updateorder(Bookingdetails update);

	public void deleteById(int id);

	  public Long getSequenceNumber(String sequenceName);

}
