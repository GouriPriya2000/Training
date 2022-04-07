package com.training.model;

public class SavingsAccount extends BankAccount 
{
	private String nominee;
	
	//ZERO ARG CONSTRUCTOR
	public SavingsAccount() 
	{
		super();
	}
	
	//GETTING 5 ARGS
	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}
	
	//GETTER & SETTER
	
		public String getNominee() {
			return nominee;
		}

		public void setNominee(String nominee) {
			this.nominee = nominee;
		}
		
		
//	public SavingsAccount()
//	{
//		System.out.println("CONSTRUCTOR OF SUBCLASS IS CALLED");
//	}
	
	
//	public SavingsAccount()
//	{
//		super(1020,"RAM",5000);
//		System.out.println("CONSTTUCTOR OF SUBCLASS IS CALLED");
//	}
	
	
}
