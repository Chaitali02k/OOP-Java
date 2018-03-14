package inheritancechallenge;

public class Car extends Vehicle {

	private String model;

	public Car(String name, String type, String model) {
		super(name, type);
		this.model = model;
	}
}
