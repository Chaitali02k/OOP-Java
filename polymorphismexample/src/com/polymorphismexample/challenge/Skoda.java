package com.polymorphismexample.challenge;

public class Skoda extends Car {

	public Skoda(String carName, int cylinder) {
		super(carName, cylinder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "skoda engine has started";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+ "->accelerate";
		
	}

	@Override
	public String carBreak() {
		// TODO Auto-generated method stub
		return "Skoda ->break";
	}

}
