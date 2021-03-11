/*
 * @author: Sehyun Cho
 * 
 * HotelOccupancy.java
 * 
 *  Read text file, prompt user for number of hotel rooms each floor, and calculate
 *  Total number of rooms, rooms occupied, rooms vacant, and occupancy rate.
 *  The text file has information of hotel's address and maximum number of rooms each floor.  
 *  
 *  Input: option, file name, rooms each floor 1 to 8. (can't exceed maximum of room each floor) 
 * 
 *  Processing: 1. Select option.
 *  
 * 			    2. If user select option 1, User can enter the name of hotel's file.
 * 					2-1. User will enter hotel's file name.
 * 					2-2. After reading file, user will enter numbers of room from floor 1 to 8.
 * 						 The number of room can't exceed maximum numbers of room each floor
 * 						 and numbers of room can't be less than 0.
 * 					2-3. After user input from floor 1 to 8, program will show
 * 						 The address of hotel and calculate total number of room, 
 *                       rooms occupied, rooms vacant, and occupancy rate(with one decimal place).
 * 					2-4. User can choose either calculate different file, or quit the program.
 * 
 * 			    3. If user select option 2, The program will end with message.
 * 
 * 			    4. If user select neither 1 nor 2, the program loop until user select option 1 or 2.  
 * 
 *  Output: Total number of Rooms, Rooms Occupied, Rooms Vacant, and Occupancy Rate.
 * 
 */

package hotelOccupancy;

// Import class
import java.io.*;
import java.util.Scanner;

public class HotelOccupancy {
	public static void main(String[] args) throws IOException
	{
		//Scanner object for standard output
		Scanner stdIn = new Scanner(System.in);
		
		//Declare variables
		//Variable for option
		int option;
		//Variable for maximum number of room each floor
		int floor1Max,floor2Max,floor3Max,floor4Max,floor5Max,floor6Max,floor7Max,floor8Max;
		//Variable for calculate 
		int total, occupied, vacant;
		//Variable for Occupancy rate
		double occupancyRate;
		//Variable for store occupancy
		int floor1Occupied, floor2Occupied, floor3Occupied, floor4Occupied, floor5Occupied,
		floor6Occupied, floor7Occupied, floor8Occupied;
		//String for filename
		String fileName;
		//String for hotel name and address line  
		String hotelName, hotelAddress1, hotelAddress2;
		
		// Intro
		System.out.println("Hotel Occupancy Rate App ...");
		
		// Option selection for user
		do {
			System.out.println("\nChoose one of the following options");
			System.out.println("\t1. Calculate hotel's occupancy rate.");
			System.out.println("\t2. Quit");
			System.out.print("Option: ");
			option = stdIn.nextInt();
    		if (option != 1 && option != 2)
    		{
    			System.out.println("\nInvalid option. Try again.");
    		}
		while(option == 1)
		{
			
			System.out.print("Enter name of hotel's file: ");
			fileName = stdIn.next();
			
			// Scanner for file
			Scanner textFile = new Scanner(new File(fileName));
			
			// Reading line option and setting up total
			hotelName = textFile.nextLine();
			hotelAddress1 = textFile.nextLine();
			hotelAddress2 = textFile.nextLine();
			floor1Max = Integer.parseInt(textFile.nextLine());
			floor2Max = Integer.parseInt(textFile.nextLine());
			floor3Max = Integer.parseInt(textFile.nextLine());
			floor4Max = Integer.parseInt(textFile.nextLine());
			floor5Max = Integer.parseInt(textFile.nextLine());
			floor6Max = Integer.parseInt(textFile.nextLine());
			floor7Max = Integer.parseInt(textFile.nextLine());
			floor8Max = Integer.parseInt(textFile.nextLine());
			total = (floor1Max + floor2Max + floor3Max + floor4Max + floor5Max + floor6Max + floor7Max
					+ floor8Max);
			
			// Intro for rooms per floor
			System.out.println("\nNumber of Rooms Occupied on");
			System.out.println("----------------------------");
			
			// Ask number of room for Floor 1
			do {
				System.out.print("\tFloor  1 (" + floor1Max + " rooms): ");
				floor1Occupied = stdIn.nextInt();
				if (floor1Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor1Occupied > floor1Max) {
					System.out.println("Can't be " + floor1Occupied + " rooms. Put invalid number.");
				}
			} while(floor1Occupied <0 || floor1Occupied > floor1Max);
			
			// Ask number of room  for Floor 2
			do {
				System.out.print("\tFloor  2 (" + floor2Max + " rooms): ");
				floor2Occupied = stdIn.nextInt();
				if (floor2Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor2Occupied > floor2Max) {
					System.out.println("Can't be " + floor2Occupied + " rooms. Put invalid number.");
				}
			} while(floor2Occupied <0 || floor2Occupied > floor1Max);
			
			// Ask number of room for Floor 3
			do {
				System.out.print("\tFloor  3 (" + floor3Max + " rooms): ");
				floor3Occupied = stdIn.nextInt();
				if (floor3Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor3Occupied > floor3Max) {
					System.out.println("Can't be " + floor3Occupied + " rooms. Put invalid number.");
				}
			} while(floor3Occupied <0 || floor3Occupied > floor3Max);
			
			//Ask number of room for Floor 4
			do {
				System.out.print("\tFloor  4 (" + floor4Max + " rooms): ");
				floor4Occupied = stdIn.nextInt();
				if (floor4Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor4Occupied > floor4Max) {
					System.out.println("Can't be " + floor4Occupied + " rooms. Put invalid number.");
				}
			} while(floor4Occupied <0 || floor4Occupied > floor1Max);
			
			//Ask number of room for Floor 5
			do {
				System.out.print("\tFloor  5 (" + floor5Max + " rooms): ");
				floor5Occupied = stdIn.nextInt();
				if (floor5Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor5Occupied > floor5Max) {
					System.out.println("Can't be " + floor5Occupied + " rooms. Put invalid number.");
				}
			} while(floor5Occupied <0 || floor5Occupied > floor1Max);
			
			
			//Ask number of room for Floor 6
			do {
				System.out.print("\tFloor  6 (" + floor6Max + " rooms): ");
				floor6Occupied = stdIn.nextInt();
				if (floor6Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor6Occupied > floor6Max) {
					System.out.println("Can't be " + floor6Occupied + " rooms. Put invalid number.");
				}
			} while(floor6Occupied <0 || floor6Occupied > floor6Max);
			
			//Ask number of room for Floor 7
			do {
				System.out.print("\tFloor  7 ( " + floor7Max + " rooms): ");
				floor7Occupied = stdIn.nextInt();
				if (floor7Occupied < 0) {
					System.out.println(" Can't be negative value. Try again.");
				} else if (floor7Occupied > floor7Max) {
					System.out.println("Can't be " + floor7Occupied + " rooms. Put invalid number.");
				}
			} while(floor7Occupied <0 || floor7Occupied > floor7Max);
			
			//Ask number of room for Floor 8
			do {
				System.out.print("\tFloor  8 ( " + floor8Max + " rooms): ");
				floor8Occupied = stdIn.nextInt();
				if (floor8Occupied < 0) {
					System.out.println("Can't be negative value. Try again.");
				} else if (floor8Occupied > floor8Max) {
					System.out.println("Can't be " + floor8Occupied + " rooms. Put invalid number.");
				}
			} while(floor8Occupied <0 || floor8Occupied > floor8Max);
			
			// To finish number of rooms section
			System.out.println("----------------------------");
			
			// Calculation 
			occupied = (floor1Occupied + floor2Occupied + floor3Occupied + floor4Occupied
					+ floor5Occupied + floor6Occupied + floor7Occupied + floor8Occupied);
			vacant = (total - occupied);
			occupancyRate = ((occupied * 1.0) / total);
			
			// Reading hotel address
			System.out.println(hotelName);
			System.out.println(hotelAddress1);
			System.out.println(hotelAddress2+"\n");	

			// Reading calculated results
			System.out.println("Total Number of Rooms:\t"+ total);
            System.out.println("Rooms Occupied:\t\t"+occupied);
            System.out.println("Rooms Vacant:\t\t" + vacant);
            System.out.printf("Occupancy Rate:\t       " + String.format("%.1f", occupancyRate)+ "\n");
            System.out.println("----------------------------");
            
            // To looping again after reading file
    		System.out.println("\nChoose one of the following options");
    		System.out.println("\t1. Calculate hotel's occupancy rate.");
    		System.out.println("\t2. Quit");
    		System.out.print("Option: ");
    		option = stdIn.nextInt();
    		
    		// If user select number neither 1 nor 2
    		if (option != 1 && option != 2)
    		{
    			System.out.println("\nInvalid option. Try again.");
    		}
            
		}
		
		// Looping if option 2 is not selected 
		}while(option != 2);
		
		// When user select option 2 ( close program )
		if (option == 2) {
			System.out.println("\nGood bye ...");
		}
		
		// Close scanner
		stdIn.close();


}
}
