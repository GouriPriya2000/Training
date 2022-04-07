package com.task4;
import com.task4.Address;
import com.task4.MobileBill;
public class Application {

	public static void main(String[] args) 
	{
		Address address = new Address(20,"TEMPLE STREET", "CHENNAI");
		MobileBill bill = new MobileBill("SHEELA", 9087658976l, "postpaid",address);
		System.out.println(MobileBill.BRAND);
		System.out.println("DOOR NO: " + address.getDoorNo());
		System.out.println("STREET: " + address.getStreet());
		System.out.println("LOCATION: " + address.getLocation());
		System.out.println("CUSTOMER NAME: " + bill.getCustomerName());
		System.out.println("PHONE NUMBER: " + bill.getMobileNumber());
		System.out.println("PLAN: " + bill.getPlanName());
		System.out.println(bill.CalculateAmount());
	}

}
