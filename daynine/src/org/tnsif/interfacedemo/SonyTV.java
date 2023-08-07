package org.tnsif.interfacedemo;
//implementable class for Sony
public class SonyTV implements Sony {

	//provides an implementation to all the abstract methods of an interface
	@Override
	public void display() {
		System.out.println("CID");
		
	}

}
