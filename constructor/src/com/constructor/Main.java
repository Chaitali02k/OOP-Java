package com.constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VipCustomer cust = new VipCustomer();
		System.out.println("First Customer is:" + cust.getName());
		VipCustomer cust1 = new VipCustomer("Karl", "karl@gmail.com");
		System.out.println("Second Customer is:" + cust1.getName());
		VipCustomer cust2 = new VipCustomer("penny", 20000, "penny@gmail.com");
		System.out.println("Third Customer is:" + cust2.getName());

	}

}
