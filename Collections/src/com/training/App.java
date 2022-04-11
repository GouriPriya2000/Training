package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.training.model.Book;
import com.training.model.CrudRepository;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;

public class App {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("RAMESH");
		names.add("ANAND");
		names.add("ZAHIR");
		names.add("PAWAN");
		names.add("CHANDRU");
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
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
		
		List<Book> bookList = service.findAll();
		Collections.sort(bookList);
		System.out.println();
		print(bookList);
		
		Collections.sort(bookList, new BookNameComparator());
		System.out.println();
		print(bookList);
		
	}
	public static void print(List<Book> args)
	{
		
		for(Book eachBook : args)
		{
			System.out.println(eachBook);
		}
	}

}
