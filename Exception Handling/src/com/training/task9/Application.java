package com.training.task9;

public class Application {

	public static void main(String[] args) 
	{
		Customer details = new Customer(100,"RAM",8675975847l,"ram00@gmail.com");
		
	try {
		details.setEmail(null);
		
	}
	catch(InvalidEmailException e)
	{
		e.printStackTrace();
	}
	}
	
	

}
