package com.nit.main.stream;

import java.util.List;

public class Customer {
	
	private int custId;
	private String custName;
	private String location;
	private String contactNumber;
	private List<Address> address;
	
	//param cons
	public Customer(int custId, String custName, String location, String contactNumber, List<Address> address) {
		this.custId = custId;
		this.custName = custName;
		this.location = location;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	//getters and setters
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", location=" + location + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
	}
	

}
