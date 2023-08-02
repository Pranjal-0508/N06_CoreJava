//Program to demonstrate on super keyword with variable

package org.tnsif.superkeyword;

class Building
{
	int floors = 45;
	String name = "Swaroop";
}

class Flat extends Building
{
	String name = "Pranjal Rajole";
	
	//if the parent class and the child class variable name are same and if you want to access parent class variable inside the child class 
	//use super.variable_name;
	
	void print()
	{
		System.out.println(super.name);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
		System.out.println(f.name); //this will print the name of the flat class that is the child class
		//System.out.println();
		f.print(); // this is for printing the name of the parent class through the print method where super keyword is used
	
	}

}
