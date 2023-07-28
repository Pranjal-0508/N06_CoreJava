//Program to demonstrate on Encapsulation 

package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		
		HDFC h = new HDFC();

		//setting a value to private data members
		
		h.setAccType("Saving Account");
		h.setAccountNo(345623445678L);
		h.setAtmCardNo(145678912304L);
		h.setPinNo(1221);
		
		//System.out.println("Account Number is : " + h.getAccountNo());
		//System.out.println(h.getAccountNo());
		//below line will call to toString() method
		
		System.out.println(h);
		
	}

}
