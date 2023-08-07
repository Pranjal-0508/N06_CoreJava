//driver class

package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// we can't instantiate in interface //as it has abstract methods
		//Sony s = new Sony(); 

		SonyTV s1 = new SonyTV();
		s1.display();
		s1.show(); //default method
		//for static method: interface_name.method_name
		Sony.accept();
		
		//for ISRO class in ChandrayaanThree Interface
		ISRO i = new ISRO();
		i.status();
		
		Human h = new Human();
		h.showDrink();
	}

}
