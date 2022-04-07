package com.training;

public class Application2 {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		
//		System.out.println(args[1]);
//		
//		System.out.println(args[2]);
//		
//		int value = Integer.parseInt(args[0]);
//		
//		System.out.println(++value);
		
		CurrencyConverter conv = new CurrencyConverter();
		
		Double dblAmount  = Double.parseDouble(args[0]);
		
		System.out.println(conv.inrTOusd(dblAmount));
		
		Double inrValue = Double.parseDouble(args[1]);
		
		System.out.println(conv.inrTOeuro(inrValue));
	
		double sal = 4500.00;
		
		int intsal = (int)sal;
		
		int age=21;
		String strage = Integer.toString(age);
		
		int intAge = Integer.parseInt(strage);
		}
	
}
