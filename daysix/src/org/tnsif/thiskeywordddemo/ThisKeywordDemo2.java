//

package org.tnsif.thiskeywordddemo;

class Bank
{
	long accountNo;
	
	Bank(long accountNo)
	{
		this.accountNo = accountNo;
	}
	
	void display()
	{
		System.out.println(accountNo);
	}
}

public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		Bank b = new Bank(1546546789);
		b.display();
		

	}

}
