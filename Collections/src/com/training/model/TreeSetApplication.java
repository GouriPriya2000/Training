package com.training.model;

import java.util.TreeSet;

public class TreeSetApplication 
{
	public static void main(String[] args) 
	{
		Student ram =  new Student(101,"ram",78);
		Student shyam =  new Student(102,"shyam",68);
		Student magesh =  new Student(103,"magesh",88);
		Student chinnaMagesh =  new Student(103,"magesh",88);
		
		TreeSet<Student> set = new TreeSet<>();
		
		set.add(chinnaMagesh);
		set.add(magesh);
		set.add(shyam);
		set.add(ram);
		
		for(Student eachStudent : set)
		{
			System.out.println(eachStudent.getFirstName());
		}

	}

}
