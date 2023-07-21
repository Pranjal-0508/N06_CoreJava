//Program to demonstrate on Assignment Operators

package org.tnsif.operators;

import java.util.Scanner;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
//		int x=12;
//		int y=7;
//		x-=y; //x=x-y
//		System.out.println(x);

		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		num1*=num2;
		System.out.println(num1);
	}

}
