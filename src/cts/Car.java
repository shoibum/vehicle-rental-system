package cts.vrs;

public class Car extends Vehicle {
	
	int seatingCapacity;
	
	//Constructor
	public Car(String model, String registrationNumber, double rentalPrice, int seatingCapacity) {
		super(model, registrationNumber, rentalPrice);
		this.seatingCapacity = seatingCapacity;
	}
	
	// Getter
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Car Model: " + model);
		System.out.println("Registration Number: " + registrationNumber);
		System.out.println("Rental Price: " + rentalPrice);
		System.out.println("Seating Capacity: " + seatingCapacity);
	}
}
