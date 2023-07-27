package org.tnsif.singleinheritance;

//base class

public class Citizen {
	
	//private data members
	
	private String city;
	private int pincode;
	private String area;
	private long adharNo;
	
	//getters and setters method
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	
	//toStrings method
	
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharNo=" + adharNo + "]";
	}
	
	//default constructor
	
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	
	//Parameterized Constructor
	
	public Citizen(String city, int pincode, String area, long adharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	
	
}
