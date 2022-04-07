package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional 
{
	private String typeOfCollege;

	public Principal() 
	{
		super();
		
	}

	public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	@Override
	public boolean test(Object value) {
	
		String strLocation = (String)value;
		
		boolean result=false;
		
		if(this.typeOfCollege.equals("private") && strLocation.equals("engg"))
		{
			result = true;
		}
		return result;
	}
	
	
}
