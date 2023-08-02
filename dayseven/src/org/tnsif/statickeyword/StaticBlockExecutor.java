//Program to demonstrate on Static Block 

package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	String str;
	static float salary;
	//static block is used to initialize static variable and we cannot initialize any non static variable inside the static block
	
	static
	{
		salary=54635.5f;
		//str = "bkc";
		System.out.println(salary);
	}
	/*static void print()
	{
		System.out.println("Salary is : " + salary);
	}
	*/
	public static void main(String[] args) {
		//print();
		/* Main function is static and hence it calls static block, method and variable by default */
		/* Here by two ways you can print the salary 1. by static method (print) and 2. by static block */
	}

}
