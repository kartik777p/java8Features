package com.nit.main.stream;

public class Address {
	
	private int doorNo;
	
	private String streetName;
	private String cityName;
	
	public Address(int doorNo, String streetName, String cityName) {
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
	}

	//no args cons
	public Address() {
	}
	
	//getters and setters
	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}

}
