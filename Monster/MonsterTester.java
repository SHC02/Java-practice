/**
 * @author Sehyun Cho
 * Filename: MonsterTester.java
 * Eclipse IDE version (4.16.0)
 * Java 11.0.8
 * 
 * This program called Monster Encyclopedia.
 * The Monster Tester class contains all of the instance variables and methods for a monster.
 * 
 * 		Input: User's name
 * 		Processing:	1. Write option menu
 *					2. Prompt user for option (main menu)
 *						1) See The Name List of The Monsters 
 *						2) Choose One of The Monster To See The Detail
 *						3) Update Monster's Attribute
 *						4) Apply Beast Mode to the monster
 *						5) Give MoonStone to the Monster
 *						6) Quit Program 
 *					3. if option 1
 *						3-1. Showing the list of the name of every monsters in the array list.
 *					4. if option 2
 *						4-1. User can choose one of the monsters from the list to see the details of the monster.
 *						4-2. The detail showing name, species, gender, body color, eye color, age, and strength point.
 *						4-3. The strength point will show with two decimal places.
 *					5. if option 3
 *						5.1. User can choose one of the monster from the list to update a attribute of the monster.
 *						5-2. User can update name, species, gender, body color, eye color, age, and strength point.
 *						5-3. After update, user can check updated attribute through the choosing option 2.
 *					6. if option 4	
 *						6-1. User can choose one of the monster from the list to apply beast mode.
 *						6-2. Beast mode gives strength depends on their age multiply by their strength that they have currently.
 *						6-3. The strength point will show with two decimal places.
 *					7. if option 5
 *						7-1. User can choose one of the monster from the list to give the moon stone.
 *						7-2. When monster obtains moon stone, the strength will be multiply by 3.5 on their current strength.
 *						7-3. The strength point will show with two decimal places.
 *					8. if option 6
 *						8-1. When user choose option 6, the program will end.
 *						8-2. Close the scanner object
 * 		Output: All the attribute that user updated, or remained
 */
package monster;
// Import classes
import java.util.ArrayList;
import java.util.Scanner;

public class MonsterTester {

	public static void main(String[] args)
	{
		// Variable Declarations
		String userName;				// User's name that stores in the program
		int option;						// Option for main menu
		int monsterOption;				// Option for monster's detail
		int attributeOption;			// Option for select monster to update attribute
		int attributeUpdate;			// Option for update attribute of a monster
		String newMonsterName;			// New monster's name attribute to update
		String newMonsterSpecies;		// New monster's species attribute to update
		String newMonsterGender;		// New monster's gender attribute to update
		String newMonsterBodyColor;		// New monster's body color attribute to update
		String newMonsterEyeColor;		// New monster's eye color attribute to update
		int newMonsterAge;				// New monster's age attribute to update
		double newMonsterStrength;		// New monster's strength attribute to update
		int beastModeOption;			// Option for select monster to apply beast mode
		int moonStoneOption;			// Option for select monster to give moon stone
		double moonStone = 3.5;			// Value of the moon stone

		// Make Array list of the monsters
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		monsters.add(new Monster("Dracula", "Vampire", "Male" , "Pale" , "Red" , 17 , 800.25));
		monsters.add(new Monster("Karl", "Dragon", "Female", "Red", "Black", 14, 2000.91));
		monsters.add(new Monster("Slimy", "Slime", "Unknown", "Green", "Orange", 30, 200.55));
		monsters.add(new Monster("Hawk", "Zombie", "Male", "Brown", "Black", 22, 750.12));
		monsters.add(new Monster("Forrest", "Giant", "Female", "Green", "Blue", 15, 1050.73));

		// Scanner object for standard output
		Scanner stdIn = new Scanner(System.in);

		// User can put user name before the program starts
		System.out.print("User Name: ");
		userName = stdIn.nextLine();
		System.out.println("\nWelcome " + userName + "!\n");

		do {
			// Menu selection Interface (Looping menu selection after each options except option 4)
			System.out.println("--------------------------------------------------------");
			System.out.println("Currently " + userName + " is using the Monster Encyclopedia !");
			System.out.println("--------------------------------------------------------\n");
			System.out.println("Welcome to the Monster Encyclopedia . . . \n");
			System.out.println("\t1. See The Name List of The Monsters ");
			System.out.println("\t2. Choose One of The Monster To See The Detail");
			System.out.println("\t3. Update Monster's Attribute");
			System.out.println("\t4. Apply Beast Mode to the monster");
			System.out.println("\t5. Give MoonStone to the Monster");
			System.out.println("\t6. Quit Program ");
			System.out.print("\nSelect One of the Following Options: ");
			option = stdIn.nextInt();

			// When user choose to see the list of monsters
			if(option == 1)
			{
				System.out.println("");
				System.out.println("-----------------Monster List---------------------------");
				// Update the output code
				for(Monster monster:monsters)
				{
					System.out.println("\tThe Monster Named: " + monster.getMonsterName());
				}
				System.out.println("--------------------------------------------------------");
			}
			// When user choose to view monster's detail
			if (option == 2)
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("\t1. " + monsters.get(0).getMonsterName());
				System.out.println("\t2. " + monsters.get(1).getMonsterName());
				System.out.println("\t3. " + monsters.get(2).getMonsterName());
				System.out.println("\t4. " + monsters.get(3).getMonsterName());
				System.out.println("\t5. " + monsters.get(4).getMonsterName());
				System.out.println("--------------------------------------------------------");
				System.out.print("Choose one of the monster to see the detail: ");
				// User can choose the monster to see the detail
				monsterOption = stdIn.nextInt();
				
				// When user choose the first monster from the array list
				if(monsterOption == 1) 
				{
					System.out.println("\n" + "\tName: \t\t" + monsters.get(0).getMonsterName() + "\n" + "\tSpecies: \t" 
							+ monsters.get(0).getMonsterSpecies() + "\n" + "\tGender: \t" + monsters.get(0).getMonsterGender() 
							+ "\n" + "\tBody Color: \t" + monsters.get(0).getMonsterBodyColor() + "\n" + "\tEye Color: \t"  + 
							monsters.get(0).getMonsterEyeColor() + "\n" + "\tAge: \t\t" + monsters.get(0).getMonsterAge() + 
							"\n" +  "\tStrength Point: " + String.format("%.2f", monsters.get(0).getMonsterStrength()) + "\n");	

				}
				// When user choose the second monster from the array list
				if(monsterOption == 2) 
				{
					System.out.println("\n" + "\tName: \t\t" + monsters.get(1).getMonsterName() + "\n" + "\tSpecies: \t" 
							+ monsters.get(1).getMonsterSpecies() + "\n" + "\tGender: \t" + monsters.get(1).getMonsterGender() 
							+ "\n" + "\tBody Color: \t" + monsters.get(1).getMonsterBodyColor() + "\n" + "\tEye Color: \t"  + 
							monsters.get(1).getMonsterEyeColor() + "\n" + "\tAge: \t\t" + monsters.get(1).getMonsterAge() + 
							"\n" +  "\tStrength Point: " + String.format("%.2f", monsters.get(1).getMonsterStrength()) + "\n");		

				}
				// When user choose the third monster from the array list
				if(monsterOption == 3) 
				{
					System.out.println("\n" + "\tName: \t\t" + monsters.get(2).getMonsterName() + "\n" + "\tSpecies: \t" 
							+ monsters.get(2).getMonsterSpecies() + "\n" + "\tGender: \t" + monsters.get(2).getMonsterGender() 
							+ "\n" + "\tBody Color: \t" + monsters.get(2).getMonsterBodyColor() + "\n" + "\tEye Color: \t"  + 
							monsters.get(2).getMonsterEyeColor() + "\n" + "\tAge: \t\t" + monsters.get(2).getMonsterAge() + 
							"\n" +  "\tStrength Point: " + String.format("%.2f", monsters.get(2).getMonsterStrength()) + "\n");		

				}
				// When user choose the fourth monster from the array list
				if(monsterOption == 4) 
				{
					System.out.println("\n" + "\tName: \t\t" + monsters.get(3).getMonsterName() + "\n" + "\tSpecies: \t" 
							+ monsters.get(3).getMonsterSpecies() + "\n" + "\tGender: \t" + monsters.get(3).getMonsterGender() 
							+ "\n" + "\tBody Color: \t" + monsters.get(3).getMonsterBodyColor() + "\n" + "\tEye Color: \t"  + 
							monsters.get(3).getMonsterEyeColor() + "\n" + "\tAge: \t\t" + monsters.get(3).getMonsterAge() + 
							"\n" +  "\tStrength Point: " + String.format("%.2f", monsters.get(3).getMonsterStrength()) + "\n");	
				}
				// When user choose the fifth monster from the array list
				if(monsterOption == 5) 
				{
					System.out.println("\n" + "\tName: \t\t" + monsters.get(4).getMonsterName() + "\n" + "\tSpecies: \t" 
							+ monsters.get(4).getMonsterSpecies() + "\n" + "\tGender: \t" + monsters.get(4).getMonsterGender() 
							+ "\n" + "\tBody Color: \t" + monsters.get(4).getMonsterBodyColor() + "\n" + "\tEye Color: \t"  + 
							monsters.get(4).getMonsterEyeColor() + "\n" + "\tAge: \t\t" + monsters.get(4).getMonsterAge() + 
							"\n" +  "\tStrength Point: " + String.format("%.2f", monsters.get(4).getMonsterStrength()) + "\n");	
				}
				// When user choose invalid option
				if(monsterOption <1 || monsterOption >5)
				{
					System.out.println("\nInvalid Option . . . Try again.\n");
				}
			}
			
			// When user choose to change attributes of the monster
			if(option == 3)
			{
				// Showing the monsters name
				System.out.println("\t1. " + monsters.get(0).getMonsterName());
				System.out.println("\t2. " + monsters.get(1).getMonsterName());
				System.out.println("\t3. " + monsters.get(2).getMonsterName());
				System.out.println("\t4. " + monsters.get(3).getMonsterName());
				System.out.println("\t5. " + monsters.get(4).getMonsterName());
				System.out.print("Choose one of the Monster : ");
				attributeOption = stdIn.nextInt();
				
				// Choosing one of the attribute to update
				System.out.println("Which attribute you want to update?");
				System.out.println("\t1.Name");
				System.out.println("\t2.Species");
				System.out.println("\t3.Gender");
				System.out.println("\t4.Body Color");
				System.out.println("\t5.Eye Color");
				System.out.println("\t6.Age");
				System.out.println("\t7.Strength Point");
				System.out.print("Choose Option: ");
				
				// If user choose to update attribute of first monster
				if(attributeOption == 1)
				{
					attributeUpdate = stdIn.nextInt();
					// Updating name attribute of the monster
					if(attributeUpdate == 1)
					{
						for(Monster monster:monsters)
						{	
							if(monster.getMonsterName() == (monsters.get(0).getMonsterName()))
							{
								System.out.print("Enter the New Name: ");
								newMonsterName = stdIn.next();
								monster.setMonsterName(newMonsterName);
							}
						}
					}
					// Updating species attribute of the monster
					if(attributeUpdate == 2)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterSpecies() == monsters.get(0).getMonsterSpecies())
							{
								System.out.print("Enter the New Species: ");
								newMonsterSpecies = stdIn.next();
								monster.setMonsterSpecies(newMonsterSpecies);
							}
						}
					}
					// Update gender attribute of the monster
					if(attributeUpdate == 3)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterGender() == monsters.get(0).getMonsterGender())
							{
								System.out.print("Enter the New Gender: ");
								newMonsterGender = stdIn.next();
								monster.setMonsterGender(newMonsterGender);
							}
						}
					}
					// Update body color attribute of the monster
					if(attributeUpdate == 4)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterBodyColor() == monsters.get(0).getMonsterBodyColor())
							{
								System.out.print("Enter the New Body Color: ");
								newMonsterBodyColor = stdIn.next();
								monster.setMonsterBodyColor(newMonsterBodyColor);
							}
						}
					}
					// Update eye color attribute of the monster
					if(attributeUpdate == 5)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterEyeColor() == monsters.get(0).getMonsterEyeColor())
							{
								System.out.print("Enter the New Eye Color: ");
								newMonsterEyeColor = stdIn.next();
								monster.setMonsterEyeColor(newMonsterEyeColor);
							}
						}
					}
					// Update age attribute of the monster
					if(attributeUpdate == 6)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterAge() == monsters.get(0).getMonsterAge())
							{
								System.out.print("Enter the New Age of the Monster: ");
								newMonsterAge = stdIn.nextInt();
								monster.setMonsterAge(newMonsterAge);
							}
						}
					}
					// Update strength point attribute of the monster
					if(attributeUpdate == 7)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterStrength() == monsters.get(0).getMonsterStrength())
							{
								System.out.print("Enter the New Strength of the Monster: ");
								newMonsterStrength = stdIn.nextDouble();
								monster.setMonsterStrength(newMonsterStrength);
							}
						}
					}
				}
				
				// If user choose to update attribute of second monster
				if(attributeOption == 2)
				{
					attributeUpdate = stdIn.nextInt();
					// Updating name attribute of the monster
					if(attributeUpdate == 1)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterName() == (monsters.get(1).getMonsterName()))
							{
								System.out.print("Enter the New Name: ");
								newMonsterName = stdIn.next();
								monster.setMonsterName(newMonsterName);
							}
						}
					}
					// Updating species attribute of the monster
					if(attributeUpdate == 2)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterSpecies() == monsters.get(1).getMonsterSpecies())
							{
								System.out.print("Enter the New Species: ");
								newMonsterSpecies = stdIn.next();
								monster.setMonsterSpecies(newMonsterSpecies);
							}
						}
					}
					// Updating gender attribute of the monster
					if(attributeUpdate == 3)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterGender() == monsters.get(1).getMonsterGender())
							{
								System.out.print("Enter the New Gender: ");
								newMonsterGender = stdIn.next();
								monster.setMonsterGender(newMonsterGender);
							}
						}
					}
					// Updating body color attribute of the monster
					if(attributeUpdate == 4)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterBodyColor() == monsters.get(1).getMonsterBodyColor())
							{
								System.out.print("Enter the New Body Color: ");
								newMonsterBodyColor = stdIn.next();
								monster.setMonsterBodyColor(newMonsterBodyColor);
							}
						}
					}
					// Updating eye color attribute of the monster
					if(attributeUpdate == 5)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterEyeColor() == monsters.get(1).getMonsterEyeColor())
							{
								System.out.print("Enter the New Eye Color: ");
								newMonsterEyeColor = stdIn.next();
								monster.setMonsterEyeColor(newMonsterEyeColor);
							}
						}
					}
					// Updating age attribute of the monster
					if(attributeUpdate == 6)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterAge() == monsters.get(1).getMonsterAge())
							{
								System.out.print("Enter the New Age of the Monster: ");
								newMonsterAge = stdIn.nextInt();
								monster.setMonsterAge(newMonsterAge);
							}
						}
					}
					// Updating strength attribute of the monster
					if(attributeUpdate == 7)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterStrength() == monsters.get(1).getMonsterStrength())
							{
								System.out.print("Enter the New Strength of the Monster: ");
								newMonsterStrength = stdIn.nextDouble();
								monster.setMonsterStrength(newMonsterStrength);
							}
						}
					}
				}
				
				// If user choose to update attribute of third monster
				if(attributeOption == 3)
				{
					attributeUpdate = stdIn.nextInt();
					// Updating name attribute of the monster
					if(attributeUpdate == 1)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterName() == (monsters.get(2).getMonsterName()))
							{
								System.out.print("Enter the New Name: ");
								newMonsterName = stdIn.next();
								monster.setMonsterName(newMonsterName);
							}
						}
					}
					// Updating species attribute of the monster
					if(attributeUpdate == 2)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterSpecies() == monsters.get(2).getMonsterSpecies())
							{
								System.out.print("Enter the New Species: ");
								newMonsterSpecies = stdIn.next();
								monster.setMonsterSpecies(newMonsterSpecies);
							}
						}
					}
					// Updating gender attribute of the monster
					if(attributeUpdate == 3)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterGender() == monsters.get(2).getMonsterGender())
							{
								System.out.print("Enter the New Gender: ");
								newMonsterGender = stdIn.next();
								monster.setMonsterGender(newMonsterGender);
							}
						}
					}
					// Updating body color attribute of the monster
					if(attributeUpdate == 4)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterBodyColor() == monsters.get(2).getMonsterBodyColor())
							{
								System.out.print("Enter the New Body Color: ");
								newMonsterBodyColor = stdIn.next();
								monster.setMonsterBodyColor(newMonsterBodyColor);
							}
						}
					}
					// Updating eye color attribute of the monster
					if(attributeUpdate == 5)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterEyeColor() == monsters.get(2).getMonsterEyeColor())
							{
								System.out.print("Enter the New Eye Color: ");
								newMonsterEyeColor = stdIn.next();
								monster.setMonsterEyeColor(newMonsterEyeColor);
							}
						}
					}
					// Updating monster age attribute of the monster
					if(attributeUpdate == 6)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterAge() == monsters.get(2).getMonsterAge())
							{
								System.out.print("Enter the New Age of the Monster: ");
								newMonsterAge = stdIn.nextInt();
								monster.setMonsterAge(newMonsterAge);
							}
						}
					}
					// Updating monster strength attribute of the monster
					if(attributeUpdate == 7)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterStrength() == monsters.get(2).getMonsterStrength())
							{
								System.out.print("Enter the New Strength of the Monster: ");
								newMonsterStrength = stdIn.nextDouble();
								monster.setMonsterStrength(newMonsterStrength);
							}
						}
					}
				}
				
				// If user choose to update attribute of fourth monster
				if(attributeOption == 4)
				{
					attributeUpdate = stdIn.nextInt();
					// Updating name attribute of the monster
					if(attributeUpdate == 1)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterName() == (monsters.get(3).getMonsterName()))
							{
								System.out.print("Enter the New Name: ");
								newMonsterName = stdIn.next();
								monster.setMonsterName(newMonsterName);
							}
						}
					}
					// Updating species attribute of the monster
					if(attributeUpdate == 2)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterSpecies() == monsters.get(3).getMonsterSpecies())
							{
								System.out.print("Enter the New Species: ");
								newMonsterSpecies = stdIn.next();
								monster.setMonsterSpecies(newMonsterSpecies);
							}
						}
					}
					// Updating gender attribute of the monster
					if(attributeUpdate == 3)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterGender() == monsters.get(3).getMonsterGender())
							{	
								System.out.print("Enter the New Gender: ");
								newMonsterGender = stdIn.next();
								monster.setMonsterGender(newMonsterGender);
							}
						}
					}
					// Updating body color attribute of the monster
					if(attributeUpdate == 4)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterBodyColor() == monsters.get(3).getMonsterBodyColor())
							{
								System.out.print("Enter the New Body Color: ");
								newMonsterBodyColor = stdIn.next();
								monster.setMonsterBodyColor(newMonsterBodyColor);
							}
						}
					}
					// Updating eye color attribute of the monster
					if(attributeUpdate == 5)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterEyeColor() == monsters.get(3).getMonsterEyeColor())
							{
								System.out.print("Enter the New Eye Color: ");
								newMonsterEyeColor = stdIn.next();
								monster.setMonsterEyeColor(newMonsterEyeColor);
							}
						}
					}
					// Updating age attribute of the monster
					if(attributeUpdate == 6)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterAge() == monsters.get(3).getMonsterAge())
							{
								System.out.print("Enter the New Age of the Monster: ");
								newMonsterAge = stdIn.nextInt();
								monster.setMonsterAge(newMonsterAge);
							}
						}
					}
					// Updating strength attribute of the monster
					if(attributeUpdate == 7)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterStrength() == monsters.get(3).getMonsterStrength())
							{
								System.out.print("Enter the New Strength of the Monster: ");
								newMonsterStrength = stdIn.nextDouble();
								monster.setMonsterStrength(newMonsterStrength);
							}
						}
					}
				}
				
				// If user choose to update attribute of fifth monster
				if(attributeOption == 5)
				{
					attributeUpdate = stdIn.nextInt();
					// Updating name attribute of the monster
					if(attributeUpdate == 1)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterName() == (monsters.get(4).getMonsterName()))
							{
								System.out.print("Enter the New Name: ");
								newMonsterName = stdIn.next();
								monster.setMonsterName(newMonsterName);
							}
						}
					}
					// Updating species attribute of the monster
					if(attributeUpdate == 2)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterSpecies() == monsters.get(4).getMonsterSpecies())
							{
								System.out.print("Enter the New Species: ");
								newMonsterSpecies = stdIn.next();
								monster.setMonsterSpecies(newMonsterSpecies);
							}
						}
					}
					// Updating gender attribute of the monster
					if(attributeUpdate == 3)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterGender() == monsters.get(4).getMonsterGender())
							{
								System.out.print("Enter the New Gender: ");
								newMonsterGender = stdIn.next();
								monster.setMonsterGender(newMonsterGender);
							}
						}
					}
					// Updating body color attribute of the monster
					if(attributeUpdate == 4)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterBodyColor() == monsters.get(4).getMonsterBodyColor())
							{
								System.out.print("Enter the New Body Color: ");
								newMonsterBodyColor = stdIn.next();
								monster.setMonsterBodyColor(newMonsterBodyColor);
							}
						}
					}
					// Updating eye color attribute of the monster
					if(attributeUpdate == 5)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterEyeColor() == monsters.get(4).getMonsterEyeColor())
							{
								System.out.print("Enter the New Eye Color: ");
								newMonsterEyeColor = stdIn.next();
								monster.setMonsterEyeColor(newMonsterEyeColor);
							}
						}
					}
					// Updating age attribute of the monster
					if(attributeUpdate == 6)
					{
						for(Monster monster:monsters)
						{
							if (monster.getMonsterAge() == monsters.get(4).getMonsterAge())
							{
								System.out.print("Enter the New Age of the Monster: ");
								newMonsterAge = stdIn.nextInt();
								monster.setMonsterAge(newMonsterAge);
							}
						}
					}
					// Updating strength attribute of the monster
					if(attributeUpdate == 7)
					{
						for(Monster monster:monsters)
						{
							if(monster.getMonsterStrength() == monsters.get(4).getMonsterStrength())
							{
								System.out.print("Enter the New Strength of the Monster: ");
								newMonsterStrength = stdIn.nextDouble();
								monster.setMonsterStrength(newMonsterStrength);
							}
						}
					}
				}
			}
			
			// When user choose to apply beast mode to the monster
			if(option == 4)
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("\t1. " + monsters.get(0).getMonsterName());
				System.out.println("\t2. " + monsters.get(1).getMonsterName());
				System.out.println("\t3. " + monsters.get(2).getMonsterName());
				System.out.println("\t4. " + monsters.get(3).getMonsterName());
				System.out.println("\t5. " + monsters.get(4).getMonsterName());
				System.out.println("--------------------------------------------------------");
				System.out.print("Choose one of the monster to make Beast Mode: ");
				// User can choose the monster to make beast mode
				beastModeOption = stdIn.nextInt();
				
				// Apply beast mode on first monster from the array list
				if(beastModeOption == 1)
				{
					monsters.get(0).beastMode();
					System.out.println("\nBeast Mode!!! Now " + monsters.get(0).getMonsterName() + " has " + String.format("%.2f", monsters.get(0).getMonsterStrength())
					+ " of Strength point!\n");
				}
				// Apply beast mode on second monster from the array list
				if(beastModeOption == 2)
				{
					monsters.get(1).beastMode();
					System.out.println("\nBeast Mode!!! Now " + monsters.get(1).getMonsterName() + " has " + String.format("%.2f", monsters.get(1).getMonsterStrength())
					+ " of Strength point!\n");
				}
				// Apply beast mode on third monster from the array list
				if(beastModeOption == 3)
				{
					monsters.get(2).beastMode();
					System.out.println("\nBeast Mode!!! Now " + monsters.get(2).getMonsterName() + " has " + String.format("%.2f", monsters.get(2).getMonsterStrength())
					+ " of Strength point!\n");
				}
				// Apply beast mode on fourth monster from the array list
				if(beastModeOption == 4)
				{
					monsters.get(3).beastMode();
					System.out.println("\nBeast Mode!!! Now " + monsters.get(3).getMonsterName() + " has " + String.format("%.2f", monsters.get(3).getMonsterStrength())
					+ " of Strength point!\n");
				}
				// Apply beast mode on fifth monster from the array list
				if(beastModeOption == 5)
				{
					monsters.get(4).beastMode();
					System.out.println("\nBeast Mode!!! Now " + monsters.get(4).getMonsterName() + " has " + String.format("%.2f", monsters.get(4).getMonsterStrength())
					+ " of Strength point!\n");
				}
			}
			
			// When user choose to give moon stone to the monster
			if(option == 5)
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("\t1. " + monsters.get(0).getMonsterName());
				System.out.println("\t2. " + monsters.get(1).getMonsterName());
				System.out.println("\t3. " + monsters.get(2).getMonsterName());
				System.out.println("\t4. " + monsters.get(3).getMonsterName());
				System.out.println("\t5. " + monsters.get(4).getMonsterName());
				System.out.println("--------------------------------------------------------");
				System.out.print("Choose one of the monster to give the MoonStone: ");
				// User can choose a monster to give the moon stone
				moonStoneOption = stdIn.nextInt();
				
				// Give moon stone to the first monster from the array list
				if(moonStoneOption == 1)
				{
					monsters.get(0).potentialStrength(moonStone);
					System.out.println("\n" + monsters.get(0).getMonsterName() + " obtained MoonStone! Now " 
							+ monsters.get(0).getMonsterName() + " has " + String.format("%.2f", monsters.get(0).getMonsterStrength())
							+ " of Strength point!\n");
				}
				// Give moon stone to the second monster from the array list
				if(moonStoneOption == 2)
				{
					monsters.get(1).potentialStrength(moonStone);
					System.out.println("\n" + monsters.get(1).getMonsterName() + " obtained MoonStone! Now " 
							+ monsters.get(1).getMonsterName() + " has " + String.format("%.2f", monsters.get(1).getMonsterStrength())
							+ " of Strength point!\n");
				}
				// Give moon stone to the third monster from the array list
				if(moonStoneOption == 3)
				{
					monsters.get(2).potentialStrength(moonStone);
					System.out.println("\n" + monsters.get(2).getMonsterName() + " obtained MoonStone! Now " 
							+ monsters.get(2).getMonsterName() + " has " + String.format("%.2f", monsters.get(2).getMonsterStrength())
							+ " of Strength point!\n");
				}
				// Give moon stone to the fourth monster from the array list
				if(moonStoneOption == 4)
				{
					monsters.get(3).potentialStrength(moonStone);
					System.out.println("\n" + monsters.get(3).getMonsterName() + " obtained MoonStone! Now " 
							+ monsters.get(3).getMonsterName() + " has " + String.format("%.2f", monsters.get(3).getMonsterStrength())
							+ " of Strength point!\n");
				}
				// Give moon stone to the fifth monster from the array list
				if(moonStoneOption == 5)
				{
					monsters.get(4).potentialStrength(moonStone);
					System.out.println("\n" + monsters.get(4).getMonsterName() + " obtained MoonStone! Now " 
							+ monsters.get(4).getMonsterName() + " has " + String.format("%.2f", monsters.get(4).getMonsterStrength())
							+ " of Strength point!\n");
				}
			}
			
			// When user choose to quit the program
			if(option == 6)
			{
				System.out.println("\nThank you for using this program! Good bye . . . ");
			}
			
			// When user typed invalid option
			if(option < 1 || option >6)
			{
				System.out.println("\nInvalid Option . . . Try again.\n");
			}
			
		// Looping until option 6 is selected (do - while)	
		}while(option !=6);

		// Close the Scanner object
		stdIn.close();
	}
}

