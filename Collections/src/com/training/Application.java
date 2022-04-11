package com.training;

import java.util.List;

import com.training.model.Book;
import com.training.model.CrudRepository;
import com.training.services.BookService;
public class Application 
{
	public static void print(List<Book> args)
	{
		
		for(Book eachBook : args)
		{
			System.out.println(eachBook);
		}
	}
	public static void main(String[] args)
	{
		Book java = new Book( "JAVA",101,  "SUBA", 450);
		Book spring = new Book( "SPRING",102,  "MAD", 650);
		Book maven = new Book("MAVEN",103, "HARISH", 550);
		Book html = new Book("HTML",104, "PRIYA", 1450);
		Book python = new Book("PYTHON",105, "SATYA", 450);
		
		CrudRepository service = new BookService();
		
		System.out.println(service.add(java));
		System.out.println(service.add(spring));
		System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));
		
		print(service.findAll());
		
		System.out.println();
		System.out.println(service.findById(105));
		
		System.out.println();
		System.out.println(service.remove(html));
		System.out.println(service.findAll().size());
		System.out.println();
		
		print(service.findAll());
		
		Book react = new Book( "REACT",201,  "RAHUL", 6450);
		service.add(react);
		
		System.out.println();
		print(service.findAll());
		
		Book react2 = new Book( "REACT 2.0",201,  "RAHUL KANWAL", 7850);
		

		service.update(react,react2);
		
		Book javaNew = new Book("JAVA",101,"KEERTHI",1450);
		print(service.findAll());
		System.out.println();
		service.update(java,javaNew);
		print(service.findAll());
	}
	
}
