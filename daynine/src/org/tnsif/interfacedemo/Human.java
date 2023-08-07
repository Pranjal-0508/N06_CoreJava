package org.tnsif.interfacedemo;

//implementable class or child class

public class Human implements ColdDrink, AlcoholDrinks{

	@Override
	public void showDrink() {
		System.out.println(colddrinkname + " " + alcoholType + " " + brand);
		
	}

}
