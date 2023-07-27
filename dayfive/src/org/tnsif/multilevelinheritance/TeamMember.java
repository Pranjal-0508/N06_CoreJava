package org.tnsif.multilevelinheritance;
 
public class TeamMember extends TeamLead{
	//private data members
	
		private int size;
		private int duration;
		
		//getters and setters method
		
		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		//Parameterized Constructor
		
		public TeamMember(String deptName, String name, int empID, String leadName, String projectName, int size, int duration) {
			super(deptName, name, empID, leadName, projectName);
			this.size = size;
			this.duration = duration;
		}

		//toString() method
		
		@Override
		public String toString() {
			return "TeamManager [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
		}
		


}
