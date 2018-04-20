package com.polymorphismexample.challenge;

public class Bmw extends Car {

	public Bmw(String carName, int cylinder) {
		super(carName, cylinder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "BMW engine has started";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "BMW ->accelerate";
	}

	@Override
	public String carBreak() {
		// TODO Auto-generated method stub
		return "BMW ->Break";
	}
	

}
