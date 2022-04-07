package com.Employee;

public class Employee {
	
	private int employeeNumber;
	private String employeeName;
	private double salary;
	private double shiftStart;
	private double shiftEnd;
	
	
	
	//DEFAULT CONSTRUCTOR
	
	public Employee() {
		super();
		
	}
	
	//PARAMETERIZED CONSTRUCTOR

	public Employee (int employeeNumber, String employeeName, double salary, double shiftStart, double shiftEnd) {
		
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
		this.shiftStart = shiftStart;
		this.shiftEnd = shiftEnd;
	}
	
	//GETTERS AND SETTERS

	public int getemployeeNumber() {
		return employeeNumber;
	}

	public void setemployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getShiftStart() {
		return shiftStart;
	}

	public void setShiftStart(double shiftStart) {
		this.shiftStart = shiftStart;
	}

	public double getShiftEnd() {
		return shiftEnd;
	}

	public void setShiftEnd(double shiftEnd) {
		this.shiftEnd = shiftEnd;
	}
	
}
