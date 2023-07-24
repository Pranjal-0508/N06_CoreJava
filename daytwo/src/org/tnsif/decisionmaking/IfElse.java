//Program to demonstrate on IF-ELSE

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if( age>18 && weight>50)
		{
			System.out.println("Eligible to donate the Blood");
		}
		else
		{
			System.out.println("Not eligible to donate the Blood");
		}

		s.close();
	}
	
}
