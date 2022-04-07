package com.training.model;

public abstract class Insurance {
	
	private int policyNumber;
	private String policyHolderName;
		
	//ZERO ARG CONSTRUCTOR
	
	public Insurance() 
	{
		super();
		
	}

	//[3] ARGS CONSTRUCTOR
	
	public Insurance(int policyNumber, String policyHolderName) 
	{
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	
	}

	//GETTER SETTER
	
	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	
	//ABSTRACT METHOD
	public abstract double CalculatePremium();

}
