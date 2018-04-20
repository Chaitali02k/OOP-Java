package com.polymorphismexample.challenge;

public class Mercedes extends Car {

	public Mercedes(String carName, int cylinder) {
		super(carName, cylinder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Mercede engine started";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Mercedes ->accelerate";
	}

	@Override
	public String carBreak() {
		// TODO Auto-generated method stub
		return "Mercedes ->break";
	}

	
}
