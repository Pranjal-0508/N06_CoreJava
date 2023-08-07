//program to demonstrate on interface 

package org.tnsif.interfacedemo;

public interface Sony {

	/* By default all the variables inside an interface are public, static and final */
	int noOfChannels = 8;
	
	// by default all the method inside an interface are is abstract method
	void display();
	//core java 1.8 version provides the static and default method inside an interface
	//static method
	static void accept()
	{
		System.out.println("Static Method");
	}
	
	//default method
	default void show()
	{
		System.out.println("Default Method");
	}
}
