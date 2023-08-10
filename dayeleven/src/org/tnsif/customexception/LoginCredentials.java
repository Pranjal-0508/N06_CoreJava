package org.tnsif.customexception;

//program to demonstrate on custom exception 
//to use custom exception extends and exception class(parent)

@SuppressWarnings("serial")
public class LoginCredentials extends Exception{

	private String str;
	
	//getters and setters method
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//Parameterized Constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	//to-string method
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
}
