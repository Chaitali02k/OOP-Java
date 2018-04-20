package com.polymorphismexample.challenge;

public class Car {
	
	private String carName;
	private boolean engine;
	private int cylinder;
	private int wheels;
	
	public Car(String carName, int cylinder) {
		
		this.carName = carName;
		this.cylinder = cylinder;
		this.engine=true;
		this.wheels=4;
	}

	public String getCarName() {
		return carName;
	}

	public int getCylinder() {
		return cylinder;
	}
	
	public String startEngine() {
		return "Car ->Engine starts";
	}
	
	public String accelerate() {
		 return  "car ->accelerate";
	}
	
	public String carBreak() {
		return "car -> break";
	}

}   
