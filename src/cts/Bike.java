package cts.vrs;

public class Bike extends Vehicle {
	
	boolean hasHelmet;
	
	//Constructor
	public Bike(String model, String registrationNumber, double rentalPrice, boolean hasHelmet) {
		super(model, registrationNumber, rentalPrice);
		this.hasHelmet = hasHelmet;
	}
	
	// Getter
	public boolean getHasHelmet() {
		return hasHelmet;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Bike Model: " + model);
		System.out.println("Bike Registration Number: " + registrationNumber);
		System.out.println("Bike Rental Price" + rentalPrice);
		System.out.println("Has Helmet: " + hasHelmet);
	}
}
