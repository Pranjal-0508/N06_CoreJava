//Program to demonstrate on public private and default .. access specifiers

package in.bkcmet.library;

public class Library {
	
	//different access specifiers
	
	public String libraryName;
	private long userId;
	String booksName;  //default

	//public method
	
	public void displayPublic()
	{
		System.out.println("Library Name : " + libraryName);
	}
	
	//private method
	
	private void displayPrivate()
	{
		System.out.println("User ID : " + userId);
	}
	
	//default method
	
	void displayDefault()
	{
		System.out.println("Book Name : " + booksName);
	}
}
