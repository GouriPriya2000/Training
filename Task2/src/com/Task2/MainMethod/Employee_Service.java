package com.Task2.MainMethod;
import com.Employee.*;
public class Employee_Service {

	public double calculateBonus (Employee object) {
		
		double updatedSalary = object.getSalary();
		double bonus = (updatedSalary + (0.33*updatedSalary));
		return bonus;
		
	}
}
