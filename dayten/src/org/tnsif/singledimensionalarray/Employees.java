package org.tnsif.singledimensionalarray;
//Program to demonstrate on Arrays of Objects 
public class Employees {

	private int Id;
	private String name;
	private double salary;
	
	//getters and setters method
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Parameterized Constructor
	
	public Employees(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
