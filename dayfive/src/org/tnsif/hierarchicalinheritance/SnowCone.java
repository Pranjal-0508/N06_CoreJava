package org.tnsif.hierarchicalinheritance;

//child class 2

public class SnowCone extends Android{

	//private data members
	
		private int version;
		
		//getters and setters method
		
		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}
	
	//Parameterized Constructor
	
	public SnowCone(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}

	//toString() method ..... using inherited method
	
	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
}
