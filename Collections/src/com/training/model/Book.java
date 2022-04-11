package com.training.model;

public class Book implements Comparable<Book>
{
	private String bookName;
	private int bookNumber;
	private String author;
	private double price;
	
	
	public Book() 
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(String bookName, int bookNumber, String author, double price) {
		super();
		this.bookName = bookName;
		this.bookNumber = bookNumber;
		this.author = author;
		this.price = price;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getBookNumber() {
		return bookNumber;
	}


	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookNumber=" + bookNumber + ", author=" + author + ", price=" + price
				+ "]";
	}


	@Override
	public int compareTo(Book otherObj) 
	{
		if(otherObj.bookNumber<this.bookNumber)
		{
			return -1;
		}
		if(otherObj.bookNumber>this.bookNumber)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
		//return otherObj.bookName.compareTo(this.bookName);
	}


	
	
	
}
