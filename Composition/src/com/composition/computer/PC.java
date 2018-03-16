package com.composition.computer;

public class PC {

	private Case theCase;
	private MotherBoard motherboard;
	private Monitor monitor;

	public PC(Case theCase, MotherBoard motherboard, Monitor monitor) {
		super();
		this.theCase = theCase;
		this.motherboard = motherboard;
		this.monitor = monitor;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	private void drawLogo() {
		monitor.drawPixel(1200,1000, "Blue");
	}
	
}
