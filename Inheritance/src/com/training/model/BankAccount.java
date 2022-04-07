package com.training.model;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	private String accountType;
	
	//DEFAULT CONTRUCTOR
	
	public BankAccount() {
		super();
		
		System.out.println("ZERO ARGUMENT CONSTRUCTOR OF SUPER CLASS IS CALLED");
	}

	//PARAMETERIZED CONSTRUCTOR [3]
	
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		
		System.out.println("THREE ARGUMENTS CONSTRUCTOR OF SUPER CLASS IS CALLED");
	}
	
		//PARAMETERIZED CONSTRUCTOR [4]
	
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		
		System.out.println("FOUR ARGUMENTS CONSTRUCTOR OF SUPER CLASS IS CALLED");
	}

	//GETTERS & SETTERS
	
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	
	
	@Override
	public String toString() {
		
		return super.toString() + this.accountNumber + "," + this.accountHolderName + "," + this.balance + "," + this.accountType;
	}
	
	
	
}
