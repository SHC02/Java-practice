/**
 * @author Sehyun Cho
 * 
 * DrivingCars.java
 * 
 * Allows the user to create car object, fill the information of the car,
 * select either accelerate or decelerate.
 * Once user accelerate or decelerate, the speed store to option 1(display car info) and it must shows.
 * 
 * 
 * 
 */
package drivingCars;
// Import Class
import java.util.Scanner;

public class DrivingCars {
	//Scanner object for standard input
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declare variable
		int option;
		
		//Intro
		System.out.println("Driving Cars App . . . ");
		System.out.println("");
		
		// Create car object
		Car userCar = new Car();
		
		System.out.print("Enter car make: ");
		userCar.setYmake(stdIn.nextLine());
		
		System.out.print("Enter car year: ");
		userCar.setyModel(stdIn.nextInt());
		
		// Loop for option
		do {
			System.out.println("\nChoose one of the following options:");
			System.out.println("\t1. Display Car Info.");
			System.out.println("\t2. Accelerate Car.");
			System.out.println("\t3. Decelerate Car.");
			System.out.println("\t4. Quit.");
			System.out.print("Option: ");
			option = stdIn.nextInt();
			
			if(option == 1) {
				System.out.println("\nCar Info ...");
				System.out.println("\t" + "Make:\t" +userCar.getCompanyMake() + "\tYear:  " + userCar.getYmodel() + 
						"\tSpeed: " + userCar.getSpeed() + " mph.");
			}
			if(option == 2) {
				System.out.println("\nAccelerating Car ...");
				System.out.println("\t" + "Make:\t" + userCar.getCompanyMake() + "\tYear:  " + userCar.getYmodel() +
						"\tSpeed: " + userCar.accelerate() + " mph.");
			}
			if(option == 3) {
				System.out.println("\nDecelerating Car ...");
				System.out.println("\t" + "Make:\t" + userCar.getCompanyMake() + "\tYear:  " + userCar.getYmodel() + 
						"\tSpeed: " + userCar.decelerate() + " mph.");
			}
		}while(option != 4);
			if(option == 4) {
				System.out.println("\nGood bye ...");
			}
	}
}
		
