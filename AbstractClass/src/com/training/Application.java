package com.training;
import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;

public class Application {
	
	public static void printPremium(Insurance object)
	{
		System.out.println(object.CalculatePremium());
	}
	

	public static void main(String[] args) 
	{
		
		VehicleInsurance car = new VehicleInsurance(1010,"RAMESH", "CAR",2019);
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(2000,"RAJESH",48);
		printPremium(life);
		
		String[] illness = {"bp", "sugar", "ent", "thyroid"};
		HealthInsurance health = new HealthInsurance(3000,"VICKY",illness);
		printPremium(health);
	}

}
