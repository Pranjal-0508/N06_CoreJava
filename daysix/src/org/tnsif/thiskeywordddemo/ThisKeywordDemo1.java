//Program to demonstrate on :
//this keyword is used to refer the current instance of the class
// pass an argument to the constructor call

package org.tnsif.thiskeywordddemo;

class Account
{
	long accountNo;
	
	void setData(long accountNo)
	{
		this.accountNo = accountNo;
	}
	
	void display()
	{
		System.out.println(accountNo);
	}
}

//driver class

public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		
		Account a = new Account();
		//a.accountNo = 235423546L;
		a.setData(45623541L);
		a.display();

	}

}
