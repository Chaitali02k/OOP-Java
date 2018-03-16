package com.composite.room;

public class Room {

	private Bed bed;
	private Lamp lamp;
	private Fan fan;

	public Room(Bed bed, Lamp lamp, Fan fan) {
		super();
		this.bed = bed;
		this.lamp = lamp;
		this.fan = fan;
	}	
	
	public Bed getBed() {
		return bed;
	}

	public Lamp getLamp() {
		return lamp;
	}

	public Fan getFan() {
		return fan;
	}

}
