package com.inheritance;

public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;

	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, size, 1, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	private void rest() {
		
	}
	
	private void swim(int speed) {
		moveMuscels();
		moveBackFin();
		super.move(10);
	}

	private void moveBackFin() {
		
	}

	private void moveMuscels() {
		
	}

}
