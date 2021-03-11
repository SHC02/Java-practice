/*
 * Sehyun Cho
 * COP1250C
 * Lab 2 
 *  In this program, import the scanner to input the characters and numbers.
 *  Calculating cost of meal depends what user's input on the scanner.
 *  Also, calculating the 7% of tax to get result of total cost. 
 * 
 * 
 * 
 */

package JamaicanJoy;

//Import class
import java.util.Scanner;

public class JamaicanJoy {
	public static void main(String[] args) {
		// Variable declaration
		double costOfMeal, tax, totalCost, costOfSoup, costOfPatty, costOfDrink;
		String type;
	
		// Scanner object for standard input
		Scanner keyboard = new Scanner(System.in);
		
		// Intro 
		System.out.println("Jamaican Joy Lunch App ...\n");
		System.out.println("Please enter the following data");
		
		// Display the input
		System.out.print("\tType of soup:\t");
		type = keyboard.nextLine();
		
		System.out.print("\tCost of soup:\t");
		costOfSoup = keyboard.nextDouble();
		
		System.out.print("\tType of patty:\t");
		type = keyboard.nextLine();
		// Buffer Clearing (one more nextLine)
		type = keyboard.nextLine();
		
		System.out.print("\tCost of patty:\t");
		costOfPatty = keyboard.nextDouble();
		
		System.out.print("\tCost of drink:\t");
		costOfDrink = keyboard.nextDouble();
		
		// Display the result
		System.out.println("\n--------------------------------------------------------------");
		
		// Update components for the result
		costOfMeal = (costOfSoup + costOfPatty + costOfDrink);
		tax = (costOfSoup + costOfPatty + costOfDrink) * 0.07;
		totalCost = (costOfSoup + costOfPatty + costOfDrink + tax);
		
		System.out.println("\nCost of Meal:\t" + "$" + costOfMeal);
		System.out.println("Tax:\t\t" + "$" + String.format("%.2f", tax));
		System.out.println("Total Cost:\t" + "$" + String.format("%.2f", totalCost));
		System.out.println("\n--------------------------------------------------------------");
		
		// Close the scanner object
		keyboard.close();
	
	}
}
