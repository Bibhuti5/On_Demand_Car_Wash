package admin.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.model.Admin;
import admin.model.CustomerRating;

import admin.model.washpack;

import admin.repository.Ratingrepo;
import admin.repository.Washrepo;
import admin.repository.adminrepo;

@Service
public class serviceImplementation implements adminservice {

	@Autowired
	private adminrepo AR;
	@Autowired
	private Ratingrepo RR;
	@Autowired
	private Washrepo WR;

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return AR.findAll();
	}

	@Override
	public void saveadmin(Admin admin) {
		// TODO Auto-generated method stub
		AR.save(admin);

	}

	@Override
	public void updateadmin(Admin admin) {
		// TODO Auto-generated method stub
		AR.save(admin);

	}

	@Override
	public void deleteadmin(int id) {
		// TODO Auto-generated method stub
		AR.deleteById(id);

	}


	@Override
	public List<washpack> getwashpack() {
		// TODO Auto-generated method stub
		return WR.findAll();
	}

	@Override
	public void savepack(washpack Washpacks) {
		// TODO Auto-generated method stub
		WR.save(Washpacks);

	}

	@Override
	public void updatepack(washpack updatepack) {
		// TODO Auto-generated method stub
		WR.save(updatepack);

	}

	@Override
	public void deletepack(int id) {
		// TODO Auto-generated method stub
		WR.deleteById(id);

	}

	@Override
	public List<CustomerRating> getuser() {
		// TODO Auto-generated method stub
		return RR.findAll();
	}

	@Override
	public void save(CustomerRating ratings) {
		// TODO Auto-generated method stub
		RR.save(ratings);
		
	}

}
