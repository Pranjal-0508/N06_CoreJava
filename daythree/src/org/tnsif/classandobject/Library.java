//Program to demonstrate Default and Parameterized Constructor 

package org.tnsif.classandobject;

public class Library {
	
	//Public Data members .. Public Class Specifier
	
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	
	// this is Default Constructor //source -->> constructor using superclass
	public Library() {
		System.out.println("Default Constructor");
		
	}

	//Parameterized Constructor //source -->> constructor using fields
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		
		System.out.println("Parameterized Constructor");
	}

	//to string method
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}

	
	
}
