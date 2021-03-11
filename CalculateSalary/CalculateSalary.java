/**
 * @author Sehyun Cho
 */
package calculateSalary;
//Import class
import java.util.Scanner;

public class CalculateSalary {
	//Scanner object for standard input
	static Scanner stdIn = new Scanner(System.in);
		public static void main(String[] args)
		{
		char tryAgain;
				
		do {
		// Create payroll object
		Payroll userPayRoll = new Payroll();

		System.out.print("Enter the employee's ID: ");
		
		//Clearing buffer
		stdIn.next();
		
		userPayRoll.setId(stdIn.nextLine());
		
		System.out.print("Enter the employee's Name: ");
		userPayRoll.setName(stdIn.nextLine());
	
		System.out.print("Enter Hourly Pay Rate: ");
		userPayRoll.setHourly(stdIn.nextDouble());
		
		System.out.print("Enter Number of hours worked: ");
		userPayRoll.setNumberOfHour(stdIn.nextDouble());
		
		// Calculate section
		System.out.println("------------------------------------------------");
		System.out.println("The Hourly Pay Rate is : $" + userPayRoll.getHourly());
		System.out.println("The Number of hours worked: " + userPayRoll.getNumberOfHour());
		System.out.println("The Salary is: $" + String.format("%.2f",userPayRoll.calcGrossPay()));
		System.out.println("");
		// Ask try again
		System.out.print("Would you like to try again? (y/n) : ");
		tryAgain = Character.toLowerCase(stdIn.next().charAt(0));
		}while (tryAgain == 'y');
		//Close the scanner object
		stdIn.close();
				System.out.println("Good bye . . .");
		}
	}
