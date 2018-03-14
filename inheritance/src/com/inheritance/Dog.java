package com.inheritance;

public class Dog extends Animal {

	private int eyes;
	private int tail;
	private int legs;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int tail, int legs, int teeth, String coat) {
		super(name, 1, size, 1, weight);
		this.eyes = eyes;
		this.tail = tail;
		this.legs = legs;
		this.teeth = teeth;
		this.coat = coat;
	}

	@Override
	public void eat() {
		// Dog override the same method which defined in super class
		System.out.println("Dog class is called");
		chew();
		super.eat();
	}

	private void chew() {
		// TODO Auto-generated method stub
		System.out.println("Dog Chew is called");
	}
   
	public void walk() {
		System.out.println("Dog walk is called");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog run is called");
		move(10);
		}

	@Override
	public void move(int speed) {
		System.out.println("Dog move is called");
		moveLegs(speed);
		super.move(speed);
	}

	private void moveLegs(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Dog moveLegs is called");
		
	}
	
	
	
	
	
	
	
}
