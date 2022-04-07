package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {

	private String qualification;
	
	//ZERO ARG	
	public Professor() {
		super();
	
	}

	//[1] ARG
	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}

	//GETTER SETTER	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	@Override
	public boolean test(Object value) 
	{
		String strValue = (String)value;
		
		boolean result = false;
		
		if(strValue.equals("Professor"))
		{
			result = true;
		}
		return result;
	}

}
