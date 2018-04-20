package com.polymorphismexample.challenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Base Car", 1);
		System.out.println(car.accelerate());
		System.out.println(car.carBreak());
		System.out.println(car.startEngine());

		Skoda skoda = new Skoda("super", 8);
		System.out.println(skoda.accelerate());
		System.out.println(skoda.carBreak());
		System.out.println(skoda.startEngine());

		Mercedes mercedes = new Mercedes("A-class", 8);
		System.out.println(mercedes.accelerate());
		System.out.println(mercedes.carBreak());
		System.out.println(mercedes.startEngine());

		Bmw bmw = new Bmw("i8", 8);
		System.out.println(bmw.accelerate());
		System.out.println(bmw.carBreak());
		System.out.println(bmw.startEngine());

	}

}
