package cts.vrs;

import java.util.Scanner;

public class vehicleDataLoader {
	public static void loadDefaultVehicles(rentalService service) {
        service.addVehicle(new Car("Swift", "TS09AB1234", 500.0, 5));
        service.addVehicle(new Bike("Pulsar", "TS09XY5678", 300.0, true));
	}
	
	public static void addVehicleFromUser(rentalService service) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Which vehicle type is it?(Car/Bike)");
		String typeVehicle = s.nextLine();
		
		System.out.println("Enter Model Name");
		String modelName = s.nextLine();
		
		System.out.println("Enter the Registration Number");
		String regno = s.nextLine();
		
		System.out.println("Enter the Rental Price");
		double rentPrice = s.nextDouble();
		
		if(typeVehicle.equalsIgnoreCase("Car")) {
			System.out.println("Enter the seating Capacity");
			int seats = s.nextInt();
			s.nextLine();
			service.addVehicle(new Car(modelName, regno, rentPrice, seats));
		}
		else if(typeVehicle.equalsIgnoreCase("Bike")) {
			System.out.println("Do you have the helmet?(true/false");
			boolean helmet = s.nextBoolean();
			s.nextLine();
			service.addVehicle(new Bike(modelName, regno, rentPrice, helmet));
		}
		else {
			System.out.println("Enter a valid vehicle type please.");
		}
	}
}
