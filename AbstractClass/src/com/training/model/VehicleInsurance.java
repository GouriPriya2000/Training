package com.training.model;

public class VehicleInsurance extends Insurance 
{
	
	private String vehicleModel;
	private int yearOfManufacture;
	
	//ZERO ARG CONSTRUCTOR
	public VehicleInsurance() 
	{
		super();
		
	}

	//[5] ARGS CONSTRUCTOR
	public VehicleInsurance(int policyNumber, String policyHolderName, String vehicleModel,
			int yearOfManuacture) 
	{
		super(policyNumber, policyHolderName);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManuacture;
	}

	//GETTER SETTER
	public String getVehicleModel() {
		return vehicleModel;
	}


	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}


	public int getYearOfManuacture() {
		return yearOfManufacture;
	}


	public void setYearOfManuacture(int yearOfManuacture) {
		this.yearOfManufacture = yearOfManuacture;
	}

	//OVERRIDE
	@Override
	public double CalculatePremium() 
	{
		double premium = 1000;
		
		if(yearOfManufacture<2020 && vehicleModel.equalsIgnoreCase("car"))
			{
					premium = 2000;
			}
		return premium;
	}

}
