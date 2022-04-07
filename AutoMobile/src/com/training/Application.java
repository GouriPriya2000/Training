package com.training;

import com.training.ifaces.AutoMobile;

import com.training.model.ObjectFactory;


public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory = new ObjectFactory();
		
		AutoMobile maruti = factory.getObject(1);
				
		AutoMobile toyota = factory.getObject(2);
		
		factory.printQuote(toyota);
		
		factory.printQuote(maruti);
	}

}
