package com.training.model;

public class HealthInsurance extends Insurance {

	private String[] preExistingDiseases;
	
	//ZERO ARG CONSTRUCTOR
	public HealthInsurance() 
	{
		super();
	}

	//[3] ARG CONSTRUCTOR
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) 
	{
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}

	//GETTER SETTER
	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}


	public void setPreExistingDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}

	//OVERRIDEN METHOD
	@Override
	public double CalculatePremium() 
	{
		
		double premium = 10000;
		
		for(String eachItem : preExistingDiseases)
		{
			if(eachItem.equalsIgnoreCase("BP")|| eachItem.equalsIgnoreCase("SUGAR"))
			{
				premium = 15000;
			}
		}
		return premium;
	}

}
