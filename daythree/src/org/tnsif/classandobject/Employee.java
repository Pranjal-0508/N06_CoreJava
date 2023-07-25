//Program to demonstrate on Class and Objects

package org.tnsif.classandobject;

//Class declaration

public class Employee {
	
	//default data members .. default access specifiers
	
	int empID;
	String empName;
	float salary;
	String department;
	
	//method declaration and definition
	
	void display()
	{
		System.out.println("Employee ID : "+ empID + "Employee Name : " + empName + "Employee Salary : " + salary + "Employee department : " + department);
	}
	
}
