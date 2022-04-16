package com.washerservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.washer.Repository.WasherRepo;
import com.washer.model.Washers;
import com.washer.service.WashService;

@RunWith(SpringRunner.class)
@SpringBootTest
class WasherServiceSystemApplicationTests {
	
	@Autowired
	private WashService service;
	@MockBean
	private WasherRepo repo;


	@Test
	public void getUsersTest() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Washers(22, "Nithin","USA","12345"),
						new Washers(55,"UK","jack","12345")).collect(Collectors.toList()));
		assertEquals(2, service.getwashers().size());
	}

	@Test
	public void getUserbyAddressTest() {
		String location="cc";
		when(repo.findBylocation(location))
				.thenReturn(Stream.of(new Washers(22,"sam","UK","12345"))
						.collect(Collectors.toList()));
		assertEquals(1, service.getwasherbylocation(location).size());
	}

	@Test
	public void saveUserTest() {
		Washers washer = new Washers(2, "Pranya","Pune","123456");
		when(repo.save(washer)).thenReturn(washer);
		assertEquals(washer, service.addWasher(washer));
	}

	@Test
	public void deleteUserTest() {
		Washers washer = new Washers(1, "raju","Hyderabad","123456");	
		service.deletewasher(washer);
		verify(repo, times(1)).delete(washer);
	}
}
