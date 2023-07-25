//driver class
//program to demonstrate on Class and Objects

package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		
		//object creation 
		
		Employee e = new Employee();
		e.empID=132981;
		e.empName="Pranjal Rajole";
		e.salary=45000;
		e.department="IT";
		
		//method call
		
		e.display();
	}

}
