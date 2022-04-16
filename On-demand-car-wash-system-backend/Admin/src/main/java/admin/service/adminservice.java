package admin.service;



import java.util.List;


import admin.model.Admin;
import admin.model.CustomerRating;

import admin.model.washpack;

public interface adminservice {
	
	//Admin
	public List<Admin> findAll();
	public void saveadmin(Admin admin);
	public void updateadmin(Admin admin);
	public void deleteadmin(int id);
	
	//Ratings
	public List<CustomerRating> getuser();
	public void save(CustomerRating ratings);
	
	//washpacks
	public List<washpack> getwashpack();
	public void savepack(washpack Washpacks);
	public void updatepack(washpack updatepack);
	public void deletepack(int id);
	
	
	
	
	
	
	    
	

}
