//Program to demonstrate on User Input

package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String: ");
		//String str1=s.next();
		//System.out.println("String is: "+str1);
		String str1=s.nextLine();
		System.out.println("String is: "+str1);

		s.close(); // to remove bulb warning
	}

}
