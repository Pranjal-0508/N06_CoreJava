//Program to demonstrate on Increment & Decrement Operators

package org.tnsif.operators;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
		int x = 23, y = 6;
		int res1 = x++ + ++y;	// 23 + 7
		System.out.println(res1);	//30
		System.out.println(x);	//24
		System.out.println(y);	//7
		
		System.out.println("***** Result2 *****");
		int res2 = x-- + --y;	// 24 + 6 
		System.out.println(res2);	//30
		System.out.println(x);	//23
		System.out.println(y);	//6
		
	}

}
