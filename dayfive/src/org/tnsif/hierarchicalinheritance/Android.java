package org.tnsif.hierarchicalinheritance;

//base class

public class Android {

	//private data members
	
	private String brand;
	private String slotType;
	
	//getters and setters method
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	//toString() method
	
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotType=" + slotType + "]";
	}
	
	//Parameterized Constructor ..... using fields
	
	public Android(String brand, String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
	}
	
	
	
}
