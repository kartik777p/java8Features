package com.nit.model;

import java.util.List;

import lombok.Data;

@Data
public class Customer {
	
	private int custId;
	private String custName;
	private String emailId;
	private List<String> phoneNumbers;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int custId, String custName, String emailId, List<String> phoneNumbers) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.emailId = emailId;
		this.phoneNumbers = phoneNumbers;
	}
	//getter setter
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}
