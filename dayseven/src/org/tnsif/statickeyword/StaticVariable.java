//program to demonstrate on static keyword (static variable) by calling object

package org.tnsif.statickeyword;

class Employee
{
	private int empId;
	private String name;
	private static String CompanyName = "TNSIF"; // static variable
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return CompanyName;
	}
	public static void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	//company name is static variable so we cant use toString method bcoz we can't override static variable (it is a override method)
	public void display()
	{
		System.out.println("Employee ID : "+this.getEmpId()+" "+"Employee Name : "+this.getName()+"Company Name : "+this.getCompanyName());
	}
	
	/*@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}*/
	
	
}
//driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("Shiwani");
		e.display();
		
		Employee e1 = new Employee();
		e.setEmpId(2);
		e.setName("Mansi");
		e.display();
	}

}
