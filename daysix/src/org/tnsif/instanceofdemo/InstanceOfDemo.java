//Program to demonstrate the instance of keyword

package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode;
}

class SBI extends RBI
{
	public SBI()
	{
		super.ifscCode="RBISONGPA01";  // super.variable is used bcoz parent and child class have variable with same name 
		// and to access that variable from the parent class in the child class 
		String ifscCode="SBIN0002161";
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
	}
	
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s = new SBI();
		//instanceof keyword is is used to check that an object is an instance of the class  
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);
		
	}

}
