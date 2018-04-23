package com.oopsechallenge.burger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger hamburger = new Hamburger("cheesy", "white", "chicken", 2.5);
		hamburger.additionalItem1("Mozrella", 0.50);
        hamburger.additionalItem2("lettuce", 0.25);
        System.out.println("Total price of the hamburger is:"+hamburger.totalPrice());
        
        HealthyBurger healthyBurger=new HealthyBurger("sausage", 4.5);
        healthyBurger.additionalHealthyItem1("falaphal", 2.4);
        healthyBurger.additionalItem1("cucumber", 0.50);
        healthyBurger.additionalItem2("Cheese", 1.5);
        System.out.println(healthyBurger.totalPrice());
        
        DeluxBurger deluxBurger=new DeluxBurger();
        System.out.println(deluxBurger.totalPrice());
	}

	// public static Hamburger selectItem() {
	//
	// System.out.println("Please select Burger Option:");
	// System.out.println("1: Hamburger");
	// System.out.println("2: Healthy Burger");
	// System.out.println("3: Delux Burger");
	// Scanner in = new Scanner(System.in);
	// String msg = in.nextLine();
	// int burgerSelect = Integer.valueOf(msg);
	//
	// switch (burgerSelect) {
	// case 1:
	// return new Hamburger("white", "Chicken", 3);
	// case 2:
	// return new HealthyBurger("", "", 4.5);
	// case 3:
	// return new DeluxBurger("", "", 4.5);
	//
	// default:
	// break;
	// }
	// return null;
	// }
}
