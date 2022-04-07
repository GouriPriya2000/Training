package com.training.model;

import com.training.ifaces.AutoMobile;

public class MarutiCar implements AutoMobile {

	@Override
	public String getColor() {
		
		return "BLUE";
	}

	@Override
	public String getModel() {
		
		return "SUZUKI";
	}

	@Override
	public int getPrice() {
		
		return 100000;
	}
	

}
