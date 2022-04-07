package com.training.model;

import com.training.ifaces.AutoMobile;

public class ToyotaCar implements AutoMobile {

	@Override
	public String getColor() {
		
		return "GREEN";
	}

	@Override
	public String getModel() {
		
		return "SWIFT";
	}

	@Override
	public int getPrice() {
		
		return 200000;
	}

}
