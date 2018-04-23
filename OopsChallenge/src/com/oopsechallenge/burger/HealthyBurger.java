package com.oopsechallenge.burger;

public class HealthyBurger extends Hamburger {

	private String additionHealthyItem1;
	private double additionHealthyItem1Price;

	private String additionHealthyItem2;
	private double additionHealthyItem2Price;

	public HealthyBurger(String meat, double basePrice) {
		super("Healthy", "Brown rye", meat, basePrice);
	}

	public void additionalHealthyItem1(String name,double price) {
		this.additionHealthyItem1 = name;
		this.additionHealthyItem1Price = price;
	}

	public void additionalHealthyItem2(String name,double price) {
		this.additionHealthyItem2 = name;
		this.additionHealthyItem2Price = price;
	}

	@Override
	public double totalPrice() {

		double hamburgerPrice = super.totalPrice();

		if (this.additionHealthyItem1 != null) {
			hamburgerPrice += this.additionHealthyItem1Price;
			System.out
					.println("Added " + this.additionHealthyItem1 + " for an extra " + this.additionHealthyItem1Price);
		}

		if (this.additionHealthyItem2 != null) {
			hamburgerPrice += this.additionHealthyItem2Price;
			System.out
					.println("Added " + this.additionHealthyItem2 + " for an extra " + this.additionHealthyItem2Price);
		}

		return hamburgerPrice;
	}

}
