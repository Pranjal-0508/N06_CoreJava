package org.tnsif.singledimensionalarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		//here all the datatypes are different that are int string and double so by classname we can include all the datatypes in array-
		Employees arr[] = new Employees[3];
		arr[0] = new Employees(101, "Saish Thorat ", 65000.45);
		arr[1] = new Employees(102,"Abhishek More ", 95000.45);
		arr[2] = new Employees(103, "Sandip Zalte ", 85000.45);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("ID : " + arr[i].getId() + ",  " + "Name : " + arr[i].getName()+ ",  " + "Salary : " + arr[i].getSalary());
		}
		
	}

}
