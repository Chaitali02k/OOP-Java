package com.oopsechallenge.burger;

import java.util.Scanner;

public class Hamburger {

	private String name;
	private String breadRollType;
	private String meat;
	private double basePrice;

	private String additionalItem1;
	private String additionalItem2;
	private String additionalItem3;
	private String additionalItem4;

	private double additionalItem1Price;
	private double additionalItem2Price;
	private double additionalItem3Price;
	private double additionalItem4Price;

	public Hamburger(String name, String breadRollType, String meat, double basePrice) {
		super();
		this.name = name;
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.basePrice = basePrice;
	}

	public void additionalItem1(String name, double price) {
		this.additionalItem1 = name;
		this.additionalItem1Price = price;
	}

	public void additionalItem2(String name, double price) {
		this.additionalItem2 = name;
		this.additionalItem2Price = price;
	}

	public void additionalItem3(String name, double price) {
		this.additionalItem3 = name;
		this.additionalItem3Price = price;
	}

	public void additionalItem4(String name, double price) {
		this.additionalItem4 = name;
		this.additionalItem4Price = price;
	}

	public double totalPrice() {
		double hamburgerprice = this.basePrice;
		if (this.additionalItem1 != null) {
			hamburgerprice += this.additionalItem1Price;
			System.out.println("Added " + this.additionalItem1 + " for an extra " + this.additionalItem1Price);
		}
		if (this.additionalItem2 != null) {
			hamburgerprice += this.additionalItem2Price;
			System.out.println("Added " + this.additionalItem2 + " for an extra " + this.additionalItem2Price);
		}
		if (this.additionalItem3 != null) {
			hamburgerprice += this.additionalItem3Price;
			System.out.println("Added " + this.additionalItem3 + " for an extra " + this.additionalItem3Price);
		}

		if (this.additionalItem4 != null) {
			hamburgerprice += this.additionalItem4Price;
			System.out.println("Added " + this.additionalItem4 + " for an extra " + this.additionalItem4Price);
		}

		return hamburgerprice;
	}

}
