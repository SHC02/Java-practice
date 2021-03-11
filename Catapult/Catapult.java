/**
 * @author Sehyun Cho
 * 
 * Filename: Catapult.java
 * Starting Date: 2/11/2021
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * This class has two methods : calculationAndDisplay and displaySetting.
 * Both methods are mainly used for display the projectile table and support tester class.
 * --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Pseudocode: 
 * 
 * calculationAndDisplay:
 * 
 * Declare 2D array that stores trajectories 	              
 *  - double[][] trajectories = new double
 *  
 * Declare Gravity constant				  	               
 * - double gConstant = 9.80
 * 
 * Looping length of the speed array         	               
 * - for(int s = 0; s < speedArray.length; s++)
 * 
 * Looping length of the angle array     				   
 * - for(int a = 0; a < angleArray.length; a++)
 * 
 * Set up the trajectories calculation 			   
 * - trajectories[s][a] = (Math.pow(speedArray[s] , 2) * Math.sin(Math.toRadians(2 * angleArray[a])) / gConstant)
 * 
 * Call displaySetting method to display the projectile table 
 * - displaySetting(trajectories, angleArray, speedArray, stdIn)
 * 			
 * displaySetting:
 *
 * Read minimum value from the text 						   						
 * - stdIn.nextInt()

 *  Read maximum value from the text 	   											
 *  - stdIn.nextInt()

 *  Looping length of angle array							 						
 *  - for(int s = 0; s < angleArray.length; s++)

 *  Print angle array elements in horizontal direction     						
 *  - angleArray[s] 

 *  Looping length of speed array  							   						
 *  - for(int s = 0; s < speedArray.length; s++)

 *  Print speed array elements in vertical direction      						
 *  - speedArray[s]

 *  Looping length of trajectories array								
 *  - for(int a = 0; a < trajectories[s].length; a++)

 *  Print trajectories from the 2d array with three decimal places  
 *  - String.format("%.3f",trajectories[s][a])

 *  Display the best trajectory value												
 *  Looping length of speed array								
 *  - for(int s = 0; s < speedArray.length; s++)

 *  Looping length of angle array						
 *  - for(int s = 0; s < angleArray.length; s++)

 *  Finding best trajectory values from 2d array in between minimum value and maximum value 
 *  - if(trajectories[s][a] >= minValue && trajectories[s][a] <= maxValue)

 *  Print out best trajectory values with no decimal places			
 *  - String.format("%.0f",trajectories[s][a])
 *  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
package catapult;

// Import scanner class
import java.util.Scanner;

public class Catapult {

	// Create scanner object for standard output
	static Scanner stdIn = new Scanner(System.in);

	// Constructor
	public Catapult()
	{
	}

	// For calculation and display
	public void calculationAndDisplay(int[] speedArray, int[] angleArray, Scanner stdIn)
	{
		// Variables declaration
		double[][] trajectories = new double[speedArray.length][angleArray.length];	// 2D array for trajectories
		double gConstant = 9.80;													// Gravity constant

		// Looping length of the speed array
		for(int s = 0; s < speedArray.length; s++)
		{
			// Looping length of the angle array
			for(int a = 0; a < angleArray.length; a++)
			{
				// Set up the trajectories calculation 
				// Result = (V_0^2 * sin(2theta))/ g   (the angle must be converted as a radian)
				trajectories[s][a] = (Math.pow(speedArray[s] , 2) * Math.sin(Math.toRadians(2 * angleArray[a])) / gConstant);
			}
		}

		// Call displaySetting method to display the projectile table
		displaySetting(trajectories, angleArray, speedArray, stdIn);

	}

	// Setting up for display the table
	public void displaySetting(double[][] trajectories, int[] angleArray, int[] speedArray, Scanner stdIn)
	{
		{
			System.out.println("\t\t\t\t  Projectile Table");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.print("Speed\t");

			int minValue = stdIn.nextInt();		// Read minimum value from the text
			int maxValue = stdIn.nextInt();		// Read maximum value from the text

			// Looping length of angle array
			for(int s = 0; s < angleArray.length; s++) 
			{
				// Print angle array elements in horizontal direction
				System.out.print("\t"+ angleArray[s] + " deg");
			}

			System.out.println();

			// Looping length of speed array
			for(int s = 0; s < speedArray.length; s++) 
			{
				// Print speed array elements in vertical direction
				System.out.print(speedArray[s] + "\t");

				// Looping length of trajectories array
				for(int a = 0; a < trajectories[s].length; a++)
				{
					// Print trajectories from the 2d array with three decimal places
					System.out.printf("\t"+(String.format("%.3f",trajectories[s][a])));

				}

				System.out.println("");
			}

			// Interface of displaying the best trajectory value
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Best Trajectory values:");

			// Looping length of speed array
			for(int s = 0; s < speedArray.length; s++)
			{
				// Looping length of angle array
				for(int a = 0; a < angleArray.length; a++)
				{
					// Finding best trajectory values from 2d array in between minimum value and maximum value
					if(trajectories[s][a] >= minValue && trajectories[s][a] <= maxValue)
					{		
						// Print out best trajectory values with no decimal places
						System.out.print(String.format("%.0f",trajectories[s][a]) + " ");
					}

				}
			}

			System.out.println("\n-----------------------------------------------------------------------------------------");
		}
	}

}
