package cts.vrs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		rentalService service = new rentalService();
		
		vehicleDataLoader.loadDefaultVehicles(service);
		
		boolean exit = false;
		
		while(!exit) {
            System.out.println("\n===== Vehicle Rental System Menu =====");
            System.out.println("1. Add Vehicle (User Input)");
            System.out.println("2. Display Available Vehicles");
            System.out.println("3. Rent a Vehicle");
            System.out.println("4. Return a Vehicle");
            System.out.println("5. Sort Vehicles by Price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            String choice = s.nextLine();
            
            switch(choice) {
            case "1":
            	vehicleDataLoader.addVehicleFromUser(service);
            	break;
            case "2":
            	service.displayAvailableVehicles();
            	break;
            case "3":
            	System.out.println("Enter your username");
            	String userName = s.nextLine();
            	System.out.println("Enter the registration number of the vehicle to rent");
            	String regNo = s.nextLine();
            	//try and catch block to catch exceptions when the registration number is not there and display it to the user
            	try{
            		service.rentVehicle(userName, regNo);
            	} catch(VehicleNotAvailableException e) {
            		System.out.println("Error: " + e.getMessage());
            	}
            	break;
            case "4":
            	System.out.println("Enter your username to return the vehicle");
            	String returnUserName = s.nextLine();
            	//try and catch block to verify if user name exists or not(i will put it soon)
            	service.returnVehicle(returnUserName);
            	break;
            case "5":
            	System.out.println("This is the sorted list of available vehicles by price");
            	service.sortVehiclesByPrice();
            	break;
            case "6":
            	exit = true;
            	System.out.println("Thank you for using the Vehicle Rental System. Have a nice day!!!");
            	break;
            default:
            	System.out.println("Enter a valid choice");
		}
	}
	}
}
