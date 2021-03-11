/**
 * @author Sehyun Cho
 * 
 * LoShuSquare.java
 * 
 * 	This LoShu Square has grid with 3 rows and 3 columns.
 * 	The grid always contains number 1 to 9, 
 * 		otherwise, the error message will print.
 * 	The sum of each row, each column and each diagonal all add up to the 15,
 * 		otherwise, the error message will print.
 * 	Program will end after showing output.
 *  
 * 	Input: Number 1 to 9
 * 
 * 	Processing: 1. displaySquare method (void)
 * 					1.1 - Display as square form by the user's number input.
 * 				2. VaildSize method	(boolean)
 * 					2.1 - Judging user's input size is valid or not.
 * 						- If input is out of range(1 to 9) = false
 * 					    - If input is repeated number(1 to 9) = false
 * 						- Otherwise, returns to true.	
 * 				3. ValidSum method (boolean)
 * 					3.1 - Judging user's input sum is valid or not.
 * 						- If sum of row is not equal to 15 = false
 * 						- If sum of column is not equal to 15 = false
 * 						- If sum of diagonal condition is not equal to 15 = false
 * 						- Otherwise, returns to true.
 * 				4. main method (void)
 * 					4.1 - Declare variable of the grid
 * 					4.2 - Enter the numbers(input)
 * 					4.3 - After accept user's input, display the square( using displaySquare() )
 * 					4.4 - Judging both boolean methods is valid(ValidSize & ValidSum)
 * 					4.5 - Print message that meet conditions from 4.4(true or false) 
 * 						 
 * 
 * 	Output: According to user's number input, 
 * 			output will show that sequence is either LoShuSuqare or not. 
 * 			If user did not put out of range(1 to 9) or repeated number from 1 to 9,
 * 			The error message will print.
 * 			
 * 
 */
package loShuSquare;

// Import Classes
import java.util.Scanner;

public class LoShuSquare {
	// Scanner object for standard output
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] arg) {
		// Intro
		System.out.println("Welcome to the LoShuSquare !\n");
		
		// Declare variable of the grid
		int[][] grid = new int [3][3];

		// Enter the numbers
		System.out.println("Enter a list of number : ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				grid[i][j] = stdIn.nextInt();
		}
		System.out.println("");
		
		// Display square from the user's input
		displaySquare(grid);

		// Judging both boolean methods is valid(ValidSize & ValidSum)
		if(ValidSize(grid) && ValidSum(grid)) 
			System.out.println("Congratulaton! This is LoShuSquare.");
		else
			System.out.println("This is not LoShuSquare.");
		
		// Close the Scanner object
		stdIn.close();
	}

	/**
	 * Display numbers from the user's input; as a square form.
	 * 
	 * @param grid - array of values
	 * 
	 * 
	 */
	static void displaySquare(int[][] grid)
	{
		System.out.println("Square by User's input: \n");
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(grid[i][j] + "   ");
				System.out.println("\n");
		}
	}
	/**
	 * From the grid, ValidSize method decide two false condition based on user's input.
	 * 				  1. When user put out of range(1 to 9)
	 * 				  2. When user repeat number of range(1 to 9) 
	 * 	Otherwise, it returns to true.
	 * 
	 * @param grid - array of values
	 * @return 
	 */
	static boolean ValidSize(int[][] grid) {
		int[] number = new int[10];
		for (int i=1; i<10; i++)
			number[i] = 0;

		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{	
				// Reject when user's input is out of range
				if (grid[i][j] < 1 || grid[i][j] > 9 ) {
					System.out.println("You need to put range of number 1 to 9.");
					return false;
				}
				// From the range of number , grid i and j accumulate.
				number[grid[i][j]]++;
			}
		}
		for (int i=1; i<10; i++)
			
			// Reject when user's input is repeat range of numbers(1 to 9) 
			if(number[i] >= 2) {
				System.out.println("Can't repeat same number from range 1 to 9.");
				return false;
			}
		return true;
	}
	/**	   
	 *  From the grid, ValidSum method calculates the user's input;
	 *  Row to Column:
	 *  	if sum of row and sum of column are not equal to 15, it will return false.
	 *  Two diagonal condition:
	 * 		if sum of diagonal conditions are not equal to 15, it will return false.
	 *  Otherwise, it returns to true.
	 *  
	 * @param grid - array of values
	 * @return
	 */
	static boolean ValidSum(int[][] grid) {
		
		// Filling number left to the right, calculate row first.
		for(int i=0; i<3; i++)
		{	
			int rowSum = 0;
			for(int j=0; j<3; j++)
				rowSum += grid[i][j];
			if(rowSum != 15) {
				return false;
			}
		}

		// After calculated row, calculate columns top to low. 
		for(int j=0; j<3; j++)
		{
			int colSum = 0;
			for(int i=0; i<3; i++)
				colSum += grid[i][j];
			if (colSum != 15) {
				return false;
			}
		}
		// Diagonal condition where the point:  1 0 0
		//									    0 1 0
		//									    0 0 1

		if (grid[0][0] + grid[1][1] + grid[2][2] != 15)
			return false;

		// Diagonal condition where the point:  0 0 1
		//									    0 1 0
		//								        1 0 0
		if (grid[0][2] + grid[1][1] + grid[2][0] != 15)
			return false;

		return true;
	}


}