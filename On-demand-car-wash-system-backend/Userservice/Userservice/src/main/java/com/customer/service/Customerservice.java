package com.customer.service;

import java.util.List;

import com.customer.model.Signup;


public interface Customerservice {

	
	  public Signup addUser(Signup signup);
	  public List<Signup> getuser();
      public String Updateuser(Signup update);
	  public String deleteUser(int id);
	  public Long getSequenceNumber(String sequenceName);
	  public void deleteUser(Signup user);
	
}
