//Program to demonstrate on static method

package org.tnsif.statickeyword;

public class StaticMethodExecutor {

	/*We can't use non-static variable inside static method*/
	String name = "MET BKC IOE";
	
	static float percentage = 78.2f;
	
	//static method
	/* If any method outside the main function and if you want to access that method inside the main function
	 * make it as STATIC */
	
	static void displayScore(int score)
	{
		
		System.out.println("Score is : " + score);
		System.out.println("Percentage is : "+ percentage);
		//System.out.println("Name is : " + name);
	}
	
	public static void main(String[] args) {
		displayScore(45);

	}

}
