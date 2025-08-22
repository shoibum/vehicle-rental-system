package cts.vrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rentalService{
	List<Vehicle> availableVehicles;
	Map<String, Vehicle> rentedVehicles;
	
	//Constructor
	public rentalService() {
		availableVehicles = new ArrayList<>();
		rentedVehicles = new HashMap<>();
	}
	
	//Add vehicle
	public void addVehicle(Vehicle vehicle) {
		availableVehicles.add(vehicle);
		System.out.println("Success!!!");
	}
	
	//Display Available Vehicles
	public void displayAvailableVehicles() {
		if(availableVehicles.isEmpty()) {
			System.out.println("No vehicles in the inventory.");
			return;
		}
		System.out.println("Available Vehicles:");
		for(Vehicle v: availableVehicles) {
			v.displayDetails();
			System.out.println("======================================");
		}
	}
	
	//Rent vehicle with not available exception
	public void rentVehicle(String userName, String registrationNumber) throws VehicleNotAvailableException {
		Vehicle toRent = null;
		
		for(Vehicle v: availableVehicles) {
			if(v.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
				toRent = v;
			}
		}
		
		if(toRent == null) {
			throw new VehicleNotAvailableException("Vehicle with registration number: " + registrationNumber + " not available");
		}
		
		rentedVehicles.put(userName, toRent);
		availableVehicles.remove(toRent);
		System.out.println(userName + " has rented vehicle with model number: " + toRent.getModel());
		
	}
	
	//Returning Vehicle
	public void returnVehicle(String userName) {
		Vehicle returned = rentedVehicles.remove(userName);
		
		if(returned != null) {
			availableVehicles.add(returned);
			System.out.println(userName + " has returned " + returned.getModel());
		}
		else {
			System.out.println("No vehicle found for user: " + userName);
		}
	}
	
	//Sorting based on price
	public void sortVehiclesByPrice() {
		availableVehicles.sort(new PriceComparator());
		System.out.println("Vehicles sorted by Price:");
		displayAvailableVehicles();
	}
	

}
