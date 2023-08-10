package org.tnsif.wrapperclass;

//Program to demonstrate on Auto Boxing
//Auto Boxing : Conversion of Primitive to Object type

public class AutoBoxing {

	public static void main(String[] args) {
		
		int num = 45;
		//converting primitive data type into wrapper class object data type
		Integer value = num;
		System.out.println(value);
		System.out.println(value.getClass().getName());
	}

}
