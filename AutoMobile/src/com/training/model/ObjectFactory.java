package com.training.model;

import com.training.ifaces.AutoMobile;

public class ObjectFactory {

	public AutoMobile getObject(int key)
	{
		switch (key) 
		{
			case 1:
				return new MarutiCar();
			
			case 2: 
				return new ToyotaCar();
			default:
				return null;
		}
		
	}
	
	public void printQuote(AutoMobile poly) 
	{
		if(poly!=null)
		{
		System.out.println(poly.getColor());
		System.out.println(poly.getModel());
		System.out.println(poly.getPrice());
	}
		else
		{
			System.out.println("INVALID INPUT: ENTER EITHER 1 OR 2");
		}
	}
}
