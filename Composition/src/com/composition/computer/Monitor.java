package com.composition.computer;

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private resolution nativeResolution;

	public Monitor(String model, String manufacturer, int size, resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public void drawPixel(int x, int y, String color) {
		System.out.println("The pixel at x:" + x + " "+ "at y:" + y +" "+ "in color" + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public resolution getNativeResolution() {
		return nativeResolution;
	}

}
