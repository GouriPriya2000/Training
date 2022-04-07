package com.training;

import com.training.ifaces.Conditional;

public class DiscountCalculator implements Conditional {

	@Override
	public boolean test(int value) {
	
		return value>500;
	}

	@Override
	public boolean negate (int value) {
		
		return value<500;
	}

}
