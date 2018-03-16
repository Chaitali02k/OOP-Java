package com.composition.computer;

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private dimensions dimensions;

	public Case(String model, String manufacturer, String powerSupply, com.composition.computer.dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	public void pressPowerButton() {
		System.out.println("Power is on");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public dimensions getDimension() {
		return dimensions;
	}

}
