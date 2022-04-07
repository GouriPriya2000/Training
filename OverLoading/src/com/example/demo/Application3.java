package com.example.demo;
import java.util.*;
public class Application3 {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTER NAME: ");
		
		String name = sc.next();
		
		Converter obj = new Converter();
		
		System.out.println("IN UPPER CASE: " + obj.convert(name));
		
		System.out.println("ENTER FAREN HEAT TEMPERATURE");
		
		double farenTemp = sc.nextDouble();
		
		System.out.println("Celcius Temperature" + obj.convert(farenTemp));
		
		System.out.println("ENTER AMOUNT");
		
		double amt = sc.nextDouble();
		
		System.out.println("ENTER NUMBER: {1: USD , 2.Euro}" );
	
		int frm = sc.nextInt();
		
				System.out.println(obj.convert(amt, frm));
		
	sc.close();	
	}
}

