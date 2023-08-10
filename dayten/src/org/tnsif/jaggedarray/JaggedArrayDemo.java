//Program to demonstrate Jagged Array

package org.tnsif.jaggedarray;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		System.out.println("***** Jagged Array *****");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		// declaring a jagged array
		
		int arr[][] = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		//taking inputs 
		//arr[i].length is for the size of inside member of the array
		System.out.println("Enter the Elements of Array : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		//printing jagged array 
		System.out.println("The Array is : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
