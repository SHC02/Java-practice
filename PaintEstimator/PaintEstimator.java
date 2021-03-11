/*
 * @author : Sehyun Cho
 * 
 * PaintEstimator.java
 * 
 * Create several methods and reading it on the main method. Prompt user for number of rooms,
 * Room square feet each number of rooms, and price per gallon of paint.
 * For every 115 feet, one gallon of paint and 8 hours of labor required,
 * and $18 dollars for one hour labor.
 * The output will show gallons of paint, cost of paint, hours of labor,
 * cost of labor, and total cost.
 * 
 * Input: 	1. Number of rooms 
 * 		  	2. Room square feet each number of rooms
 *        	3. Price per gallon of paint
 * 
 * Processing: 1. Put all methods inside the class
 * 				   	1-1 Method for number of rooms
 * 						1-1.1 Reject and loop when user put number of room less than 1
 * 				   	1-2 Method for total space
 * 						1-2.1 Reject and loop when user put square feet less than 25
 * 				  	 1-3 Method for Paint price per gallon
 * 						1-3.1 Reject and loop when user put price less than 0
 * 				  	1-4 Method for calculating amount of paint
 * 				 	1-5 Method for calculating hours of labor
 * 				  	1-6 Method for calculating cost for labor 
 * 					1-7 Method for calculating cost of paint
 * 				    1-8 Method for calculating total charges
 * 				  	1-9 Method for displaying data (output)
 * 						1-9.1 For amountOfPaint and hoursOfLaborRQ 
 * 								= set as 1 decimal place
 * 							  For costOfPaint, laborCharges, and totalCost 
 * 								= set as 2 decimal places 
 * 
 * 			   2. Using main method to call all the methods
 * 			 		    2-1. From main methods 
 * 
 * Output: Gallons of Paint, Cost of Paint, Hours of Labor, Cost of Labor , Total Cost
 * 
 */
package paintEstimator;
//Import scanner for standard output
import java.util.Scanner;
public class PaintEstimator {
	// Call scanner for all under classes
	static Scanner stdIn = new Scanner(System.in);
	
	// Main method
	public static void main(String[] args) {
		// Declare variables and put together methods
		double perHourPrice = 18.00;
		int inputNumberOfRooms = numberOfRooms();
		double totalwallSpace = totalSpace(inputNumberOfRooms); 
		double perGallon = pricePerGallon();
		double amountOfPaint = calculateAmountOfPaint(totalwallSpace);
		double hoursOflaborRQ = calcualteLabor(totalwallSpace);
		double costOfPaint = calculatePaint(perGallon, amountOfPaint);
		double laborCharges = calculateLaborCharges(hoursOflaborRQ, perHourPrice);
		double totalCost = calculateTotal(laborCharges, costOfPaint);
		
		// Data will display with elements below
		dataDisplay ( perGallon, amountOfPaint, hoursOflaborRQ, costOfPaint,
				   laborCharges, totalCost); 
	}
	
	// Method for number of rooms
	public static int numberOfRooms() {
		int inputNumberOfRooms;
		System.out.println("Paint Job Estimator ...\n");	
		// do-while 
		do {
			System.out.printf("Number of rooms to be painted (>=1): ");
			inputNumberOfRooms = stdIn.nextInt();
		// Reject and loop when user put number of room less than 1
		if (inputNumberOfRooms < 1 ) {
			System.out.println("Error. . . Please put invalid number of rooms.");
		}
		} while (inputNumberOfRooms < 1);
		return inputNumberOfRooms;
	}
	
	// Method for total space
	public static double totalSpace(int numberOfRooms) {
		int squareFeet;
		double totalSquareFeet = 0;
		for (int currentRoom = 1; currentRoom <= numberOfRooms; currentRoom++) {
		// do-while 
		do { 
			 System.out.printf("Room " + currentRoom + " square feet (>=25): ");
			 squareFeet = stdIn.nextInt();
			 totalSquareFeet += squareFeet;
		// Reject and loop when user put square feet less than 25
			 if(squareFeet < 25) {
				 System.out.println("Error . . . Please put invalid square feet. (>=25)");
			 }
		}while(squareFeet < 25);
		}
		return totalSquareFeet;
	}
	
	// Method for Paint price per gallon
	public static double pricePerGallon() {
		double inputPricePerGallon;
		do {
		System.out.printf("\nPrice per gallon of paint (>=0): ");
		inputPricePerGallon = stdIn.nextDouble();
		// Reject and loop when user put price less than 0
		if (inputPricePerGallon < 0) {
			System.out.println("Error . . . Please enter price of paint more than 0.");
		}
		}while(inputPricePerGallon < 0);
		return inputPricePerGallon;
	}
	
	// Method for calculating amount of paint
	public static double calculateAmountOfPaint(double totalSquareFeet) {
		double paintRequired;
		paintRequired = (totalSquareFeet / 115);
		return paintRequired;
	}
	
	// Method for calculating hours of labor
	public static double calcualteLabor(double totalSquareFeet) {
		double hoursRequired;
		hoursRequired = (totalSquareFeet / 115) * 8.0;
		return hoursRequired;
	}
	
	// Method for calculating cost for labor 
	public static double calculateLaborCharges(double hoursRequired, double chargePerHour) {
		double laborCharges;
		laborCharges = hoursRequired * chargePerHour;
		return laborCharges;
	}
	
	// Method for calculating cost of paint
	public static double calculatePaint(double priceOfPaint, double paintRequired) {
		double costOfPaint; 
		costOfPaint = paintRequired * priceOfPaint;
		return costOfPaint;
	}
	
	// Method for calculating total charges
	public static double calculateTotal (double laborCharges, double costOfPaint) {
		double total;
		total = laborCharges + costOfPaint;
		return total;
	}
	
	// Method for displaying data (No return since using void on the method)
	public static void dataDisplay(double perGallon, double amountOfPaint, double hoursOflaborRQ, 
			                       double costOfPaint, double laborCharges, double totalCost) {
		System.out.println("\n\tPaint Job Estimate\n");
		System.out.println("Paint ...");
		System.out.println("Gallons of Paint:\t" + String.format("%.1f", amountOfPaint));
		System.out.println("Cost of Paint:\t\t$" + String.format("%.2f",costOfPaint));
		System.out.println("");
		System.out.println("Cost ...");
		System.out.println("Hours of Labor:\t\t" + String.format("%.1f", hoursOflaborRQ));
		System.out.println("Cost of Labor:\t\t$" + String.format("%.2f", laborCharges));
		System.out.println("\t\t\t---------");
		System.out.println("Total Cost:\t\t$" + String.format("%.2f", totalCost));
	}
	
	}
