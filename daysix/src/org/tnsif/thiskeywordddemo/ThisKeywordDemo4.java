//pass as argument in constructor call

package org.tnsif.thiskeywordddemo;

class Director
{
	String name;
	
	//default constructor
	void print()
	{
		this.name = "Sunil Datt";
		display(name);
	}
	
	//parameterized Constructor
	void display(String name) 
	{
		System.out.println("Director name is : " + name);
	}
}

public class ThisKeywordDemo4 {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
	}

}
