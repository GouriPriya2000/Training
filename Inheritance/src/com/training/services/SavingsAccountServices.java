package com.training.services;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class SavingsAccountServices extends BankAccountServices {

	public String getCustomerInfo(SavingsAccount account)
	{
		return account.getAccountHolderName();
	}

	@Override
	public double calculateInterest(BankAccount accounts) {
		
		double simpleInterest = 0.05;
		
		if (accounts.getAccountNumber()<=5000) {
			
			simpleInterest = 0.06;
		}
		
		return accounts.getBalance()*1*simpleInterest;
		
		}
	
	
}
