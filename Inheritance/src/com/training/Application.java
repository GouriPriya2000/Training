package com.training;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountServices;
import com.training.services.SavingsAccountServices;

public class Application 
{
	public static void main(String[] args)
	{
		
		BankAccount account2 = new BankAccount(1010, "Ramesh", 50000, "savings");
		System.out.println(account2.toString());
		
												  //Acc no,name,balance,type,nominee
		SavingsAccount account = new SavingsAccount(650,"RAMESH",1000,"fixed","RAJESH");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		
		SavingsAccountServices service = new SavingsAccountServices();
		System.out.println(service.getCustomerInfo(account));
		
		System.out.println(service.calculateInterest(account));
		
		BankAccountServices service2 = new SavingsAccountServices();
		
		//services2.getCustomerInfo(account);
		
		SavingsAccountServices savingService2 = (SavingsAccountServices)service2;
		System.out.println(savingService2.getCustomerInfo(account));
	}
	
	
}
