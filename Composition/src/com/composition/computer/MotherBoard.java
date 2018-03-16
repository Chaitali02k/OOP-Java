package com.composition.computer;

public class MotherBoard {
	private String model;
	private String manufacturer;
	private int ramSlot;
	private int cardSlot;

	public MotherBoard(String model, String manufacturer, int ramSlot, int cardSlot) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlot = ramSlot;
		this.cardSlot = cardSlot;
	}
	
	public void loadProgram(String programName) {
		System.out.println("program name is"+programName);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlot() {
		return ramSlot;
	}

	public int getCardSlot() {
		return cardSlot;
	}

}
