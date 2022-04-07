package com.training;

public class BankAccount {
	
	//static variable
	private static int count=200;
	
	//instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	

	//static method
	public static int getCount() {
		
			return (++count);
			
	}
		//CONSTRUCTOR 
	
	BankAccount(String accountHolderName, double balance){
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = getCount();
		System.out.println("ACCOUNT HOLDER NAME:" + accountHolderName);
		System.out.println("CURRENT BALANCE: " + balance);
	}
	
	//instance method
	public double getUpdatedBalance (double amount) {
			
		
		double updatedBalance =0;
			
		updatedBalance = this.balance+ amount;
	    
		System.out.print("UPDATED BALANCE: ");
		return (updatedBalance);
			
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	

}
