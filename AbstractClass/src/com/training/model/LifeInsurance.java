package com.training.model;

public class LifeInsurance extends Insurance
{
	private int age;

	//ZERO ARG CONSTRUCTOR
	public LifeInsurance() 
	{
		super();
	}

	//[3] ARG CONSTRUCTOR
	public LifeInsurance(int policyNumber, String policyHolderName, int age) 
	{
		super(policyNumber, policyHolderName);
		this.age = age;
	}

	//GETTER SETTER
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	//OVERRIDE
	
	@Override
	public double CalculatePremium() 
	{
		double premium=10000;
		
			if(age<50)
			{
				premium = 5000;
			}
		
		return premium;
	}
}
