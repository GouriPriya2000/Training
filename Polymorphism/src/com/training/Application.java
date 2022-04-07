package com.training;
import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;

public class Application 
{

	public static void main(String[] args) 
	{
		NewObjectFactory factory = new NewObjectFactory();
		
		Conditional profObject = factory.getConditional(1);
		
		Conditional studObject = factory.getConditional(2);
		
		Conditional principalObject = factory.getConditional(3);
		
		System.out.println(profObject.test("Professor"));
		
		System.out.println("Allowance: " + factory.getValue(profObject, "chennai"));
		
		System.out.println("Allowance: " + factory.getValue(studObject, "30"));
		
		System.out.println("Allowance: " + factory.getValue(principalObject, "engg"));
		

	}

}
