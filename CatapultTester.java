/**
 * @author Sehyun Cho
 * 
 * Filename: CatapultTester.java
 * Starting Date: 2/11/2021
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Path of text file was : \Java workspace\Catapult
 * 
 * Read text file that contains integers like this order:
 * 	Number of Sets
 *  Number of Speeds
 *  Speed elements
 *  Number of angles
 *  Angle elements
 *  Min and Max values
 *  
 *  AND,
 *  
 *  Read sets, speeds, and angles in order of numbers written in the text file
 *  Store speed and angle elements into each single array
 *  After reading, calculate trajectories with using catapult object
 *  Result will display: speed, degree, calculated trajectories, and best trajectory.
 *  Best trajectory values will display in between minimum value and maximum value.
 * ----------------------------------------------------------------------------------------------------------------
 * Pseudocode: 
 * 	Read in number of sets nextInt() 								
 * - int numSets = stdIn.nextInt()
 * 		Loop for the number of sets 								
 * - for(int i = 0; i < numSets; i++)
 *  	Read in number of speeds nextInt()							
 *  - numSpeed = stdIn.nextInt()
 *  	Size speeds array 											
 *  - int[] speedArray = new int[numSpeed]
 * 		Loop number of speeds 										
 * - for(int s = 0; s < numSpeed; s++)
 * 			Read in 1 speed at a time nextInt() 					
 * - speedArray[s] = stdIn.nextInt()
 * 
 * 	Read in number of angles 										
 * - numAngle = stdIn.nextInt()
 * 		Size angles of array 										
 * - int[] angleArray = new int[numAngle]
 * 		Loop number of angles 										
 * - for(int a = 0; a < numAngle; a++)
 * 			Read in my angles 										
 * - angleArray[a] = stdIn.nextInt()
 * 	
 * 	Create Catapult object											
 * - Catapult catapult = new Catapult()
 * 	 
 *  Call the calculation method to calculate the trajectory			
 *  - catapult.calculationAndDisplay(speedArray, angleArray, stdIn)
 *  
 *  Close the scanner object										
 *  - stdIn.close()
 * ----------------------------------------------------------------------------------------------------------------
 */
package catapult;

// Import classes
import java.io.*;
import java.util.Scanner;

public class CatapultTester 
{
	// Create scanner object for standard output
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{	
		// Variables declaration
		int numAngle = 0;			// Number of angle element
		int numSpeed = 0;			// Number of speed element

		// Reading Text file 
		File file = new File("catapult - test data.txt");
		Scanner stdIn = new Scanner(file);

		// Read number of sets from the text file
		int numSets = stdIn.nextInt();

		// Looping number of sets
		for(int i = 0; i < numSets; i++)
		{	
			// Read the number of speed from the text file
			numSpeed = stdIn.nextInt();

			// Storing number of speed into speed array
			int[] speedArray = new int[numSpeed];

			// Looping number of speed
			for(int s = 0; s < numSpeed; s++)
			{
				// Reading speed array 
				speedArray[s] = stdIn.nextInt();
			}

			// Read number of angle from the text file
			numAngle = stdIn.nextInt();

			// Storing the number of angle into angle array
			int[] angleArray = new int[numAngle];

			// Looping number of angle
			for(int a = 0; a < numAngle; a++)
			{
				// Reading angle array
				angleArray[a] = stdIn.nextInt();
			}

			// Create catapult object
			Catapult catapult = new Catapult();

			// Calculate trajectories and print out
			catapult.calculationAndDisplay(speedArray, angleArray, stdIn);
		}

		// Close the scanner object
		stdIn.close();
	}


}
