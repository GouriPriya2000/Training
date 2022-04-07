package com.training.services;

public class ExceptionHandling 
{
	
	public void usingArrayIndexException(String[] args )
	{
		try 
		{
			System.out.println(args[2]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Method requires 3 values to be passed [a,b,c]");
			//e.printStackTrace();
		}
	}
	
	public void usingNumberFormatException(String value)
	{
		int age = 0;
		try 
		{
			age = Integer.parseInt(value);
		} 
		catch (NumberFormatException e)
		{
			//e.printStackTrace();
		}
		System.out.println(age);
	}
		
	
		public void usingFinallyBlock()
		{
			int denominator=4;
			
			try {
				
				System.out.println(4/denominator);
			} catch (ArithmeticException e) {
				System.err.println("denominator should not be zero");
				
			}
			finally {
				System.out.println("Inside finally==");
			}
			System.out.println("thanks bye bye");
		}
		
		
		
		public String underStandFinallyBlock()
		{
			int denominator=4;
			
			try {
				
				System.out.println(4/denominator);
			} catch (ArithmeticException e) {
				System.err.println("denominator should not be zero");
				
			}
			finally {
				System.out.println("Inside finally==");
			}
			System.out.println("thanks bye bye");
		return "thanks";
	}
}
