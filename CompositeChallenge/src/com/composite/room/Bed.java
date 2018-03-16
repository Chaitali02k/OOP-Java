package com.composite.room;

public class Bed {
	
	private String model;
	private String manufacture;
	private String type;
	private Dimentions dimentions;
	
	public Bed(String model, String manufacture, String type, Dimentions dimentions) {
		super();
		this.model = model;
		this.manufacture = manufacture;
		this.type = type;
		this.dimentions = dimentions;
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

	public Dimentions getDimentions() {
		return dimentions;
	}
	
	

}
