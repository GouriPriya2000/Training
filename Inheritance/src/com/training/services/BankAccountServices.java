package com.training.services;

import com.training.model.BankAccount;

public class BankAccountServices {
	
	public double calculateInterest (BankAccount accounts) {
		
		double simpleInterest = 0.05;
		
		if (accounts.getAccountNumber()<=5000) {
			
			simpleInterest = 0.06;
		}
		
		return accounts.getBalance()*1*simpleInterest;
	}

	public BankAccountServices() {
		super();
	
	}
	
	public void calculateInterest(BankAccount[] accounts) 
	{
		
		for(BankAccount eachAccount : accounts) 
		{
		
			System.out.println(calculateInterest (eachAccount));
		}
	}
	
	public double [] findInterest(BankAccount[] accounts)
	{
			double[] values =  new double[2]; 
			
			int i=0;
					
			for(BankAccount eachAccount : accounts)
			{ 
				values[i] = calculateInterest (eachAccount);
				i++;
			}
			return values;
	}

	
	private double calculatebyAccountType(BankAccount account,double rateOfInterest)
	{
		System.out.println("Simple Interest: ");
		return account.getBalance()*1*rateOfInterest;
	}
	
	
	public double[] findInterestbyAccountType (BankAccount[] account) 
	{
				System.out.println("Account Type: " + account.length);
				
				double[] values = new double[account.length];
				int i=0;
		
				for(BankAccount eachAccount : account) 
				{
					if(eachAccount!=null) 
					{
						String key = eachAccount.getAccountType();
			
						switch(key)
						{
							case "savings": 
							values[i]=  calculatebyAccountType(eachAccount,0.05);
							break;
				
							case "fixed":
							values[i]=  calculatebyAccountType(eachAccount,0.07);
							break;
				
							case "recurring":
							values[i]=  calculatebyAccountType(eachAccount,0.07);
							break;
						}
						i++;
					}
				
				}
				return values;
	}
}
