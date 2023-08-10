//Program to demonstrate on Check Exception that is File Not Found

package org.tnsif.catchexception;
import java.io.FileInputStream;
public class CheckExceptionDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			//exception handled for this path
			//FileInputStream f = new FileInputStream("C:\\Users\\Lenovo\\Documents\\NO6-CoreJAVA\\dayeleven\\src\\org\\tnsif\\catchexception.txt");
			FileInputStream f = new FileInputStream("C:\\Users\\Lenovo\\Documents\\NO6-CoreJAVA\\dayeleven/src/org/tnsif/catchexception/CheckExceptionDemo.java");
			System.out.println("File found ..!!");
		}
		catch(Exception e)
		{
			System.out.println(" Exception Handled " + e);
		}

	}

}
