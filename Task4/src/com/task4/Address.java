package com.task4;

public class Address 
{
	private int doorNo;
	private String street;
	private String location;
	
	//ZERO ARG CONSTRUCTOR
	public Address() 
	{
		super();
	}

	//[3] ARG CONSTRUCTOR
	public Address(int doorNo, String street, String location) {
		super();
		this.doorNo = doorNo;
		
		this.street = street;
		
		this.location = location;
		
	}

	//GETTER SETTER
	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	
}
