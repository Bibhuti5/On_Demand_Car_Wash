package com.customer.service;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.model.Login;
import com.customer.model.Signup;
import com.customer.repository.Userrepo;


@Service
public class LoginService {
	@Autowired
	private Userrepo userRepository;

	public String userLogin(Login login) {
		ArrayList<Signup> list = (ArrayList<Signup>) userRepository.findAll();
		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getUsername().equals(login.getUsername())
					&& list.get(i).getPassword().equals(login.getPassword())) {

				count++;
			}
		}

		if (count == 1) {
			return "logged in";
		} else {
			return "wrong credentials";
		}

	}

}
