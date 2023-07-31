//2. invoke current class constructor value

package org.tnsif.thiskeywordddemo;

class Team
{
	int size;
	Team()
	{
		//calling to parameterized constructor
		this(7);
		System.out.println("Default Constructor");
	}
	Team(int size)
	{
		System.out.println("Parameterized Constructor : " + size);
	}
}

public class ThisKeywordDemo3 {

	public static void main(String[] args) {

		Team t = new Team();

	}

}
