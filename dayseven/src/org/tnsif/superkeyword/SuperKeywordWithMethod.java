//Program to demonstrate on super keyword with method

package org.tnsif.superkeyword;
//parent class
class MET
{
	String ownerName = "Chhagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner name : " + ownerName);
	}
}
//child class
class BKC extends MET
{
	String ownerName = "Shefali Bhujbal";
	void displayName()
	{
		//if parent class and child class method name are same and if you want to access that method then use super.method_name
		super.displayName();
		System.out.println("Owner name : " + ownerName);
	}	
}
//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayName();

	}

}
