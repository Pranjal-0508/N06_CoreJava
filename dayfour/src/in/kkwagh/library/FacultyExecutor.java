//Program to demonstrate on public private and default .. access specifiers
//driver class

package in.kkwagh.library;

//import in.bkcmet.library.*;

import in.bkcmet.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		
		Library l = new Library();
		//public method
		l.libraryName = "Bhujbal Library";
		l.displayPublic();

		//userId and displayPrivate() method is private so we can't access into another package or another class. Only we can them in same class 
		//l.userId = 123456;
		//l.displayPrivate();
		
		//booksName and displayDefault() method is default so we can't access them into another package. We can access them only in the same package
		//l.booksName = "Java Programming";
		//l.displayDefault();
		
	}

}
