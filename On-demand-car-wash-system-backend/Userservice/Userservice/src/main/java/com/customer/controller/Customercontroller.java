package com.customer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.model.Bookingdetails;
import com.customer.model.CustomerRating;
import com.customer.model.Login;
import com.customer.model.Signup;
import com.customer.model.Washpacks;
import com.customer.service.CustomerServiceImplementation;
import com.customer.service.LoginService;

import io.swagger.annotations.ApiOperation;

import java.util.Collections;
import java.util.Map;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.web.authentication.HttpStatusEntryPoint;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class Customercontroller {

	@Autowired
	private LoginService user;
	@Autowired
	private CustomerServiceImplementation service;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/adduser")
	@ApiOperation(value = "Adds new Customer's details")
	public Signup saveUser(@RequestBody Signup signup) {
		signup.setId(service.getSequenceNumber(Signup.SEQUENCE_NAME));
		return service.addUser(signup);
	}

	@GetMapping("/allusers")
	@ApiOperation(value = "Shows all Customer's details")
	public List<Signup> findAllUsers() {
		return service.getuser();
	}

	@PutMapping("/updateUser")
	@ApiOperation(value = "Updates Customer's details")
	public String updateUser(@RequestBody Signup signup) {
		String result = service.Updateuser(signup);
		return result;
	}

	@DeleteMapping("/deleteUser/{id}")
	@ApiOperation(value = "Deletes customer")
	public String deleteuser(@RequestParam int id) {
		return service.deleteUser(id);
	}

	@PostMapping("/login")
	@ApiOperation(value = "To Add Login Details")
	public String userLogin(@RequestBody Login login) {
		return user.userLogin(login);
	}

	/*-------------------Resttemplates----------------------------- */

	@GetMapping("/allpacks")
	@ApiOperation(value = "Gets all packs")
	public List<Washpacks> getwashpacks() {
		String baseurl = "http://localhost:8081/admin/allpacks";
		Washpacks[] wp = restTemplate.getForObject(baseurl, Washpacks[].class);
		return Arrays.asList(wp);
	}

	@PostMapping("/addorder")
	@ApiOperation(value = "Customer can add new order")
	public String addorder(@RequestBody Bookingdetails order) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Bookingdetails> entity = new HttpEntity<Bookingdetails>(order, headers);

		return restTemplate.exchange("http://localhost:8083/order/addorder", HttpMethod.POST, entity, String.class)
				.getBody();
	}

	@DeleteMapping("/cancelorder")
	@ApiOperation(value = "Customer can cancel order")
	public String deleteorder(@RequestParam int id) {
		String baseurl = "http://localhost:8083/order/cancelorder";
		Bookingdetails order = restTemplate.getForObject(baseurl, Bookingdetails.class);
		return "Your Order is successfully Canceled " + order;
	}

	@PostMapping("/addratings")
	@ApiOperation(value = "Customer can give ratings to washers")
	public String addrating(@RequestBody CustomerRating rating) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<CustomerRating> entity = new HttpEntity<CustomerRating>(rating, headers);

		return restTemplate.exchange("http://localhost:8081/admin/addratings", HttpMethod.POST, entity, String.class)
				.getBody();
	}

	/*
	 * @PostMapping("/addpayment") public String payment(@RequestBody Paymentdetails
	 * payment) { HttpHeaders headers = new HttpHeaders();
	 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 * HttpEntity<Paymentdetails> entity = new HttpEntity<Paymentdetails>(payment,
	 * headers); return restTemplate.exchange("http://localhost:1234/gateway/pay",
	 * HttpMethod.POST, entity, String.class) .getBody();
	 */
	// }

//	protected void configure(HttpSecurity http) throws Exception {
//		// @formatter:off
//        http
//            .authorizeRequests(a -> a
//                .antMatchers("/", "/error", "/webjars/**").permitAll()
//                .anyRequest().authenticated()
//            )
//            .exceptionHandling(e -> e
//                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//            )
//            .oauth2Login();
//        http
//        // ... existing code here
//        .logout(l -> l
//            .logoutSuccessUrl("/").permitAll()
//        );
//        // @formatter:on
//		http
//				// ... existing code here
//				.csrf(c -> c.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()));
//
//	}
//
//	@GetMapping("/user")
//	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
//		return Collections.singletonMap("name", principal.getAttribute("name"));
//	}

}
