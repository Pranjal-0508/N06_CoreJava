//Program to demonstrate the number of digits in a number using Do-While Loop

package org.tnsif.looping;

import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		
		int count=0;
		do
		{
			num=num/10;
			count++;
		}
		while(num!=0);
		
		System.out.println("Number of digits in the given number are : " + count);
		
		s.close();
		
	}

}
