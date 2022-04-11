package com.training.services;

import java.util.ArrayList;
import java.util.List;
import com.training.model.Book;
import com.training.model.CrudRepository;


public class BookService implements CrudRepository {

	private ArrayList<Book> bookList;
	
		
	public BookService() 
	{
		super();
		this.bookList = new ArrayList<>();
	}

	@Override
	public boolean add(Book book) 
	{
	
		return bookList.add(book);
	}

	@Override
	public Book findById(int id) 
	{
		Book found = null;
		for(Book each : this.bookList)
		{
			if(each.getBookNumber()==id)
			{
				found = each;
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book)
	{
		return bookList.remove(book);
	}

	@Override
	public List<Book> findAll() 
	{
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook, Book newBook) {
		
		if(this.bookList.contains(oldBook)) 
		{
			int idxPos = this.bookList.indexOf(oldBook);
			
			this.bookList.set(idxPos, newBook);
		}
		else
		{
			
			this.bookList.add(newBook);
		}
		return null;
	}

	
}
