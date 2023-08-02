package org.tnsif.superkeyword;
//parent class

class Google
{
	public Google(String ceo)
	{
		System.out.println("Default Constructor : "+ceo);
	}
}

class Gmail extends Google
{
	String userID;

	public Gmail(String ceo, String userID) {
		//calling to parent class parameterized constructor
		super (ceo);
		this.userID = userID;
		System.out.println(userID);
		System.out.println("Parameterized Constructor : ");
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g = new Gmail("Sundar Pichai", "abcgmail.com");
		

	}

}
