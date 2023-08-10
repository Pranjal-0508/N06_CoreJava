//Program to demonstrate on 1D Array Using Compile-Time Input

package org.tnsif.singledimensionalarray;

public class ArrayUsingCompileTime {

	public static void main(String[] args) {
		
		//Array initialization at the Compile-Time
		
		int arr[] = {11,22,33,44,55};
		
		//accessing 2nd elements of an array
		System.out.println(arr[1]);
		
		//printing entire array
		System.out.println("Array Elements are : ");
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}

}
