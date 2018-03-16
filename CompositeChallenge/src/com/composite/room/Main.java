package com.composite.room;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Dimentions dimensions=new Dimentions(20, 5);
		Bed bed =new Bed("222", "Ekia", "Single", dimensions);
	
		TypeLamp type=new TypeLamp("small", "onWall");
		Lamp lamp=new Lamp("Phf","Philips",type,"Pink");
		
		Fan fan= new Fan("B11","Asian","3Wheels");
		
		Room room=new Room(bed, lamp, fan);
		room.getLamp().powerOn();	
		System.out.println("bed manufacturer is:"+room.getBed().getManufacture());
	
	}

}
