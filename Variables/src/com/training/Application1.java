package com.training;

public class Application1 {

	public static void main(String[] args) {
		
		
		BankAccount account1 = new BankAccount ("Ramesh" , 1000);
		System.out.println(account1.getUpdatedBalance(2000));
		System.out.println(account1.getAccountNumber());
	
		BankAccount account2 = new BankAccount ("Suresh" , 2000);
		System.out.println(account2 .getUpdatedBalance(2000));
		System.out.println(account2.getAccountNumber());

	}
}