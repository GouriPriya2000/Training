package com.Customer;

public class Customer {
	
	private int customerNumber;
	private String customerName;
	private long phoneNumber;
	private int budget;
	
	//DEFAULT CONSTRUCTOR
	
	public Customer() {
		super();
	}

	//PARAMETERIZED CONSTRUCTOR
	
	public Customer(int customerNumber, String customerName, long phoneNumber, int budget) {
		
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.budget = budget;	
	}

	//GETTERS AND SETTERS
	
	public int getcustomerNumber() {
		return customerNumber;
	}

	public void setcustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}


	}


