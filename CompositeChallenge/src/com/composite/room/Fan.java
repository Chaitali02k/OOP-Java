package com.composite.room;

public class Fan {

	private String model;
	private String manufacture;
	private String type;

	public Fan(String model, String manufacture, String type) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.type = type;
	}
	
	public void moveFan() {
		System.out.println("Fan is moving");
	}

	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public String getType() {
		return type;
	}

}
