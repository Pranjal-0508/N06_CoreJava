package org.tnsif.multilevelinheritance;

//Parent Class A

public class Manager {

	//Private Data Members
	
	private String deptName;
	private String name;
	private int empID;
	
	//getters and setters method ..... used when private data members are used
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	//toString() method
	
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empID=" + empID + "]";
	}
	
	//Parameterized Constructor
	
	public Manager(String deptName, String name, int empID) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empID = empID;
	}
	
	
	
}
