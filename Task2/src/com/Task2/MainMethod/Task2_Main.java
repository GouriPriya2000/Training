package com.Task2.MainMethod;

import com.Customer.*;
import com.Employee.*;
import com.Hotel.*;


public class Task2_Main {

	public static void main(String[] args) {
		
		Customer ramesh = new Customer(001, "Ramesh", 87667776586l, 5000);
		Employee suresh = new Employee(002, "Suresh", 10000.00, 09.00, 05.00);
		Hotel foodie = new Hotel("FOODIE'S PALACE", 50000, "CHENNAI", "MULTI-CUISISNE");
		Employee_Service obj = new Employee_Service();
		
		System.out.println(ramesh.getcustomerNumber());
		System.out.println(ramesh.getcustomerName());
		System.out.println(ramesh.getPhoneNumber());
		System.out.println(ramesh.getBudget());
		
		System.out.println(suresh.getemployeeNumber());
		System.out.println(suresh.getemployeeName());
		System.out.println(suresh.getSalary());
		System.out.println(suresh.getShiftStart());
		System.out.println(suresh.getShiftEnd());
		
		System.out.println(foodie.gethotelName());
		System.out.println(foodie.getProfit());
		System.out.println(foodie.getLocation());
		System.out.println(foodie.getcuisine());
		
		System.out.println(obj.calculateBonus(suresh));
		}
}

