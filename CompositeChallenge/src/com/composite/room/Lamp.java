package com.composite.room;

public class Lamp {

	private String model;
	private String manufacture;
	private TypeLamp type;
	private String color;

	public Lamp(String model, String manufacture, TypeLamp type, String color) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.type = type;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("Lamp is on");
	}

	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public TypeLamp getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

}
