package com.training;
import java.util.*;
import com.training.model.BankAccount;
import com.training.services.BankAccountServices;

public class MyApplication 
{

	public static void main(String[] args) 
	{
		
		BankAccountServices service = new BankAccountServices();
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] list = new BankAccount[1]; 
		
		int s=0;
		int i=0;
		
			do{
			
			
					System.out.println("ENTER ACCOUNT NUMBER: ");
					int accountNumber = sc.nextInt();
					
					System.out.println("ENTER ACCOUNT HOLDER NAME: ");
					String accountHolderName = sc.next();
					
					System.out.println("ENTER BALANCE: ");
					double balance = sc.nextDouble();
					
					System.out.println("ENTER ACCOUNT TYPE: ");
					String accountType = sc.next();
					
					BankAccount account = new BankAccount (accountNumber, accountHolderName, 
															balance, accountType);
					
					list[i] = account;
					i++;
					
					System.out.println("ENTER OPTION TO CONTINUE: "); 
					s = sc.nextInt();							
					
			}while(s==1);
		
		 double[] values = service.findInterestbyAccountType(list);
		 for(double eachValue : values)
		 {
			 System.out.println(eachValue);
		
		}
		sc.close();
	}
				
}
