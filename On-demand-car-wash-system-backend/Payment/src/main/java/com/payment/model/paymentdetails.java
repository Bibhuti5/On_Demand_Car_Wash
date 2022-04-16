package com.payment.model;

import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pay")
public class paymentdetails {
	@Id
	private int orderId;
	private Float Amount;
	private String paymentstatus;
	private String transId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Float getAmount() {
		return Amount;
	}
	public paymentdetails(int orderId, Float amount, String paymentstatus, String transId) {
		super();
		this.orderId = orderId;
		Amount = amount;
		this.paymentstatus = paymentstatus;
		this.transId = transId;
	}
	public void setAmount(Float amount) {
		Amount = amount;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	@Override
	public String toString() {
		return "paymentdetails [orderId=" + orderId + ", Amount=" + Amount + ", paymentstatus=" + paymentstatus
				+ ", transId=" + transId + "]";
	}

	/*
	 * @Transient public static final String SEQUENCE_NAME = "users_sequence";
	 * 
	 * public static String getSequenceName() { return SEQUENCE_NAME;
	 */

}
