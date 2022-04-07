package com.training;
import com.training.ifaces.Function;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.services.CurrencyConverter;

public class Application 
{
	public static void main(String[] args)
	{
		
		//CurrencyConverter conv = new CurrencyConverter();
		
		Function conv = new CurrencyConverter();
		
		double response = conv.apply(200);
		System.out.println(Function.COUNTER);
		System.out.println(response);
		
		System.out.println(conv.apply(300));
		
		if(conv instanceof CheckCondition)
		{
			CheckCondition obj = (CheckCondition)conv;
			System.out.println("Is Discount Allowed:  " + (obj.test(300)));
		}
		
		Conditional condobj = new DiscountCalculator();
		
		System.out.println(condobj.test(6000));
		System.out.println(condobj.negate(6000));
		
		
	}
}
