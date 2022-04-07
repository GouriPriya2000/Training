package com.example.demo;

public class Converter {

	public String convert (String str) {
		
		return str.toUpperCase();
	}
	
	public double convert (double farenTemp) {
		
		return (farenTemp-32)* 5/9;
		
	}
	
	public double convert (double amt, int frm) {
		
		if(frm==1) {
			
			amt = amt * 100;
			
		}
		
		else {
			
			amt =  amt * 120;
		}
			return amt;
	}
}
