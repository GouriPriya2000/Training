package com.training.services;
import com.training.model.Student;
import com.training.model.Student;

public class StudentService 
{
	private Student student;

	public StudentService() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) 
	{
		super();
		this.student = student;
	}
	
	public String printDetails()
	{
		String name=null;
		try 
		{
			name = this.student.getFirstName();
			
		}
		catch (NullPointerException e) 
		{
			System.err.println("Student obj is not passed, check again");
		}
		return name;
	}
	
	public String findRank() throws Throwable	
	{
		String grade = "A";
		if(this.student.getMarkScored()>90)
		{
			grade= "O";
		}
		return grade;
		
		
			
		
	}
}
