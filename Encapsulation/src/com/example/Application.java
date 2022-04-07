package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student();
		
		//public method able to access
		//ram.setRollNumber(001);
		
		//default unable to access since both classes are in 2 different packages
		//ram.setFirstName("RAM");
		
		//unable to access since application is not a subclass of student
		//ram.setMarkScored(100);
		
		//unable to access because it is private and it is not visible
		//ram.setBranch("CSE");
		
		System.out.println("RAM ROLL NUMBER:" + ram.getRollNumber());
		System.out.println("RAM MARKS SCORED:" + ram.getMarkScored());
		
			
		Student shyam = new Student(10, "SHYAM", 100, "SE");
				System.out.println("SHYAM ROLL NUMBER: " + shyam.getRollNumber());
				System.out.println("SHYAM FIRST NAME: " + shyam.getFirstName());
				System.out.println("SHYAM BRANCH: " + shyam.getBranch());
				System.out.println("SHYAM MARKS SCORED: " + shyam.getMarkScored());
				
				Student Mahesh = new Student(989, "Subramani", "Textile");
				System.out.println("MAHESH ROLL NUMBER: " + Mahesh.getRollNumber());
				System.out.println("MAHESH MARK SCORED: " + Mahesh.getMarkScored());
						System.out.println();
	}

}
