//***** INFOSYS INTERVIEW QUESTION *****

/* There are n people standing in a circle waiting to be executed. 
 * The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. 
 * In each step a certain number of people are skipped and the next person in executed. 
 * The elimination proceeds around the circle ( which is becoming smaller and smaller as the executed people are removed ), 
 * until only the last person remains, who is given freedom. 
 * Given the total number of person n and a number k indicates that k-1 person are skipped and k'th person is killed in the circle.
 * The task is to choose a person in the initial circle that survives. Assume n=5 and k=2 .*/

package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {

	static int survive(int n, int k)
	{
		if (n==1)
			return 1;
		else
			return (survive(n-1,k) + k-1 ) % n + 1;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for n and k : ");
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.println(survive(n,k));
	}

}
