//Program to demonstrate on Custom Exception

package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws LoginCredentials {
		
		Scanner sc = new Scanner(System.in);
		String userid = sc.nextLine();
		String password = sc.nextLine();
		
		try
		{
			if(userid.equals("pranjalrajole9447@gmail.com") && password.equals("rajole9447"))
			{
				System.out.println(" Credentials are Matched .. !! ");
			}
			else
			{
				throw new LoginCredentials(" Invalid Credentials .. !! ");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println(" Exception Handled .. !! " + e);
		}
		
		sc.close();
		
	}

}
