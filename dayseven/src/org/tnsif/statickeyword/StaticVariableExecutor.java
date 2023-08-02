package org.tnsif.statickeyword;

public class StaticVariableExecutor {

	// if any variable is outside the main function and if you want to access that variable inside the main function the
	//make the variable as static
	static String str = "TNS India Foundation";
	
	public static void main(String[] args) {
		//System.out.println(str); gives error because you can't use variable outside the class .. 
		/*StaticVariableExecutor s = new StaticVariableExecutor();
		System.out.println(s.str);*/ // creating an object is also a method to access the variable out of the main function but doing this will
		//increase the length code of so instead make that variable static and then use it in the main function
		
		System.out.println(str);
		
	}

}
