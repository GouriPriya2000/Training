package com.training;

import java.util.Scanner;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application 
{

	public static void main(String[] args) 
	{
		Student ram = null;
		try {
			ram = new Student(1010,"RAMESH",98);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		StudentService service = new StudentService(ram);
		System.out.println(service.printDetails());

		StudentService service2 = new StudentService();
		try {
			System.out.println("Grade: " + service2.findRank());
		} catch (Throwable e) {
			//e.printStackTrace();
		
			//System.err.println("Name is not passed;");
			
		}
		
		ExceptionHandling exHandling = new ExceptionHandling();
		
//		exHandling.usingArrayIndexException(args);
//		
//		exHandling.usingNumberFormatException("Forty Five");
		
		System.out.println(exHandling.underStandFinallyBlock());
		
		try( Scanner scan = new Scanner(System.in))
		{
				System.out.println("Enternumber");
				int num = scan.nextInt();
				
				System.out.println(num);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	}
