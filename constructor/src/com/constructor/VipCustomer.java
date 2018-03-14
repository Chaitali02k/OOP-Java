package com.constructor;

public class VipCustomer {

	private String name;
	private double credit_limit;
	private String email;

	public VipCustomer() {
		this("John", 10000, "john@gmail.com");
	}

	public VipCustomer(String name, double credit_limit, String email) {
		this.name = name;
		this.credit_limit = credit_limit;
		this.email = email;
	}

	public VipCustomer(String name, String email) {
		this(name, 20000, email);
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public double getCredit_limit() {
		return credit_limit;
	}

	public String getEmail() {
		return email;
	}

}
