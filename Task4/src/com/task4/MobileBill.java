package com.task4;

public class MobileBill 
{
	private String customerName;
	private long mobileNumber;
	private String planName;
	
	private Address address;
	
	public static final String BRAND = "JIO";
	
	//ZERO ARG CONSTRUCTOR
	public MobileBill() 
	{
		super();
	}

	
	//[4] ARGS CONSTRUCTOR
	public MobileBill(String customerName, long mobileNumber, String planName,Address address) 
	{
		super();
		this.customerName = customerName;
		
		this.mobileNumber = mobileNumber;
		
		this.planName = planName;
	
		this.address=address;
	}

	//GETTER SETTER
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public Address getAdress() {
		return address;
	}


	public void setAdress(Address address) {
		this.address = address;
	}
	
	
	public int CalculateAmount() 
	{
		int amount =500;
		switch (planName)
		{
			
			case "prepaid": amount = 200;
			break;
			
			case "postpaid": amount = 300;
			break;
			
		}
		return amount;
	}

	
	
	

}
