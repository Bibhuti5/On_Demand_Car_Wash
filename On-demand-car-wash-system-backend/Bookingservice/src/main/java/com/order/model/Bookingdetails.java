package com.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="bookingdetailsdb")
public class Bookingdetails {

@Id
	
	private Long orderId;
    private String carName;
    private String carModel;
	private String username;
	private String date;
	private Long contactno;
	private String address;
	private int washpackId;
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	
	


	public Bookingdetails() {
		super();
	}


	

	public Bookingdetails(Long orderId, String carName, String carModel, String username, String date, Long contactno,
			String address, int washpackId) {
		super();
		this.orderId = orderId;
		this.carName = carName;
		this.carModel = carModel;
		this.username = username;
		this.date = date;
		this.contactno = contactno;
		this.address = address;
		this.washpackId = washpackId;
	}







	public Long getOrderId() {
		return orderId;
	}




	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}




	public String getCarName() {
		return carName;
	}




	public void setCarName(String carName) {
		this.carName = carName;
	}




	public String getCarModel() {
		return carModel;
	}




	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public Long getContactno() {
		return contactno;
	}




	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public int getWashpackId() {
		return washpackId;
	}




	public void setWashpackId(int washpackId) {
		this.washpackId = washpackId;
	}




	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}




	@Override
	public String toString() {
		return "Bookingdetails [orderId=" + orderId + ", carName=" + carName + ", carModel=" + carModel + ", username="
				+ username + ", date=" + date + ", contactno=" + contactno + ", address=" + address + ", washpackId="
				+ washpackId + "]";
	}





	







	
	







	
	
	
	
	
	
	
	
	
	
	
	
	
}