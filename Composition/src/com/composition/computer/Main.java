package com.composition.computer;

import java.awt.Dimension;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dimensions d = new dimensions(20, 20, 5);
		Case theCase = new Case("233B", "Dell", "240", d);
		System.out.println("Dimention of pc is:"+theCase.getDimension().getWidth());
		
		Monitor theMonitor = new Monitor("27H", "iss", 27, new resolution(20, 20));
		
		MotherBoard theMotherBoard = new MotherBoard("BJ", "fffff", 4, 6);
		
		PC thePc = new PC(theCase, theMotherBoard, theMonitor);
		thePc.powerUp();
	}

}
