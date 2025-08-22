package cts.vrs;

public abstract class Vehicle {
	
	String model;
	String registrationNumber;
	Double rentalPrice;
	
	// Constructor to initialize the vehicle
	public Vehicle(String model, String registrationNumber, Double rentalPrice) {
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.rentalPrice = rentalPrice;
	}
	
	// Getter methods
	public String getModel() {
		return model;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public double getRentalPrice() {
		return rentalPrice;
	}
	
	//Abstract Method to be displayed by other subclasses
	public abstract void displayDetails();

}
