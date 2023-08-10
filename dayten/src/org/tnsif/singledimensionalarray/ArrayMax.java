/* Program to demonstrate on Array Using Run-Time input values
 * and to find the largest element in an array. */

package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total number of Elements : ");
		int n = sc.nextInt();
		
		//array declaration
		
		int arr[] = new int[n];
		
		//this for loop is for taking input elements
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements are : ");
		
		//this for loop is for printing the array elements
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		// largest element
		int max = arr[0];
		for(int i=0;i<n;i++)
		{
			max = arr[i];
		}
		
		System.out.println("The largest Element is : " + max);
		
		//sorting in an array
		
		Arrays.sort(arr);
		System.out.println("Sorted Array is : ");
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
