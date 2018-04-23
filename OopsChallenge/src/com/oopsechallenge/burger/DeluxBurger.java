package com.oopsechallenge.burger;

public class DeluxBurger extends Hamburger{

	public DeluxBurger() {
		super("Delux", "White", "sauage & chicken", 6.75);
		super.additionalItem1("chips", 2.5);
		super.additionalItem2("cola", 1.50);
	}

	@Override
	public void additionalItem1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item in Delux burger");
	}

	@Override
	public void additionalItem2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item in Delux burger");
	}

	@Override
	public void additionalItem3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item in Delux burger");
	}

	@Override
	public void additionalItem4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional item in Delux burger");
	}
  
	
	


}
