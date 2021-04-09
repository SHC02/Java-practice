/**
 * @author Sehyun Cho
 * File name: MammalTester.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 		Input: Every selected options
 * 		Processing:	1. Write option menu
 * 
 *					2. Prompt user for option (main menu)
 *						1) Dog 
 *						2) Cat
 *						3) Rabbit
 *						4) Quit Program
 *
 *					3. if option 1
 *						3.1 - View the information of Dachshund
 *							3.1.1 - Getting information of breed, age, weight, and name.
 *						3.2 - View the information of Beagle
 *							3.2.1 - Getting information of breed, age, weight, and name.
 *						3.3 - View the information of Husky
 *							3.3.1 - Getting information of breed, age, weight, and name.
 *						3.4 - View the information of Puggle
 *							3.4.1 - Getting information of which dogs are mixed, age, weight, and name.
 *						3.5 - Feeding food to the dog
 *							3.5.1 - Dachshund - gain weight +2
 *							3.5.2 - Beagle    - gain weight +3
 *							3.5.3 - Husky     - gain weight +4
 *							3.5.4 - Puggle    - gain weight +2
 *						3.6 - Make them sound
 *							3.6.1 - Dachshund
 *							3.6.2 - Beagle
 *							3.6.3 - Husky
 *							3.6.4 - Puggle
 *						3.7	- Comparing Weight
 *							3.7.1 - if value of compareTo is 0  = both have same weight 
 *							3.7.2 - if value of compareTo is -1 = dachshund is lighter than the other dog
 *							3.7.3 - if value of compareTo is 1  = dachshund is heavier than the other dog
 *
 *					4. if option 2
 *						4.1 - View the information of Persian
 *							4.1.1 - Getting information of breed, age, weight, and name.
 *						4.2 - View the information of Munchkin
 *							4.2.1 - Getting information of breed, age, weight, and name.
 *						4.3 - View the information of Russian Blue
 *							4.3.1 - Getting information of breed, age, weight, and name.
 *						4.4 - View the information of Bambino
 *							4.4.1 - Getting information of which cats are mixed, age, weight, and name.
 *						4.5 - Feeding food to the cat
 *							4.5.1 - Persian 	 - gain weight +1
 *							4.5.2 - Munchkin     - gain weight +2
 *							4.5.3 - Russian Blue - gain weight +2
 *							4.5.4 - Bambino      - gain weight +1
 *						4.6 - Make them sound
 *							4.6.1 - Persian
 *							4.6.2 - Munchkin
 *							4.6.3 - Russian Blue
 *							4.6.4 - Bambino
 *						4.7	- Comparing Weight
 *							4.7.1 - if value of compareTo is 0  = both have same weight 
 *							4.7.2 - if value of compareTo is -1 = Persian is lighter than the other cat
 *							4.7.3 - if value of compareTo is 1  = Persian is heavier than the other cat
 *
 *					5. if option 3
 * 						5.1 - View the information of French Angora
 *							5.1.1 - Getting information of breed, age, weight, and name.
 *						5.2 - View the information of Polish
 *							5.2.1 - Getting information of breed, age, weight, and name.
 *						5.3 - View the information of Flemish Giant
 *							5.3.1 - Getting information of breed, age, weight, and name.
 *						5.4 - View the information of Jersey Wooly
 *							5.4.1 - Getting information of which rabbits are mixed, age, weight, and name.
 *						5.5 - Feeding food to the rabbit
 *							5.5.1 - French Angora   - gain weight +1
 *							5.5.2 - Polish     	      - gain weight +1
 *							5.5.3 - Flemish Giant    - gain weight +2
 *							5.5.4 - Jersey Wooly     - gain weight +1
 *						5.6 - Make them sound
 *							5.6.1 - French Angora
 *							5.6.2 - Polish
 *							5.6.3 - Flemish Giant
 *							5.6.4 - Jersey Wooly
 *						5.7	- Comparing Weight
 *							5.7.1 - if value of compareTo is 0  = both have same age 
 *							5.7.2 - if value of compareTo is -1 = French Angora is younger than the other rabbit
 *							5.7.3 - if value of compareTo is 1  = French Angora is older than the other rabbit
 *
 *					6. if option 4
 *							6.1 - The program will end.
 *				
 * 		Output: All the information printed that user choose to look up.
 * 
 */
package mammal;

// Import classes
import java.util.ArrayList;
import java.util.Scanner;

public class MammalTester 
{
	public static void main(String[] args)
	{
		// Import Scanner for Standard Output
		Scanner stdIn = new Scanner(System.in);

		// Declare Variables
		int option;			// Option for main menu
		int dogOption;			// Option for the dogs
		int dogFeedOption;		// Option for feeding the dog
		int dogSoundOption;		// Option for sound of the dog
		int catOption;			// Option for the cats
		int catFeedOption;			// Option for feeding the cat
		int catSoundOption;		// Option for sound of the cat
		int rabbitOption;			// Option for the Rabbits
		int rabbitFeedOption;		// Option for feeding the rabbit
		int rabbitSoundOption;		// Option for sound of the rabbit

		// Create ArrayLists for Storing Mammals' information
		ArrayList<Dog> dog = new ArrayList<Dog>();
		ArrayList<Cat> cat = new ArrayList<Cat>();
		ArrayList<Rabbit> rabbit = new ArrayList<Rabbit>();

		// Store dog breeds into the Dog ArrayList
		// Dog stored place 0 in ArrayList - Dachshund contains information of species, age, and weight
		dog.add(new Dachshund());
		dog.get(0).setDogSpecies("Dachshund");
		dog.get(0).setDogAge(12);
		dog.get(0).setDogWeight(16);

		// Dog stored place 1 in ArrayList - Beagle contains information of species, age, and weight
		dog.add(new Beagle());
		dog.get(1).setDogSpecies("Beagle");
		dog.get(1).setDogAge(7);
		dog.get(1).setDogWeight(22);

		// Dog stored place 2 in ArrayList - Husky contains information of species, age, and weight
		dog.add(new Husky());
		dog.get(2).setDogSpecies("Husky");
		dog.get(2).setDogAge(5);
		dog.get(2).setDogWeight(35);

		// Dog stored place 3 in ArrayList - Puggle contains information of species, age, and weight
		dog.add(new Puggle());
		dog.get(3).setDogSpecies("Puggle");
		dog.get(3).setDogAge(3);
		dog.get(3).setDogWeight(15);

		// Store Cat breeds into the Cat ArrayList
		// Cat stored place 0 in ArrayList - Persian contains information of species, age, and weight
		cat.add(new PersianCat());
		cat.get(0).setCatSpecies("Persian");
		cat.get(0).setCatAge(4);
		cat.get(0).setCatWeight(7);

		// Cat stored place 1 in ArrayList - Munchkin contains information of species, age, and weight
		cat.add(new MunchkinCat());
		cat.get(1).setCatSpecies("Munchkin");
		cat.get(1).setCatAge(6);
		cat.get(1).setCatWeight(6);

		// Cat stored place 2 in ArrayList - Russian Blue contains information of species, age, and weight
		cat.add(new RussianBlueCat());
		cat.get(2).setCatSpecies("Russian Blue");
		cat.get(2).setCatAge(2);
		cat.get(2).setCatWeight(9);

		// Cat stored place 3 in ArrayList - Bambino contains information of species, age, and weight
		cat.add(new BambinoCat());
		cat.get(3).setCatSpecies("Bambino");
		cat.get(3).setCatAge(9);
		cat.get(3).setCatWeight(7);

		// Store Rabbit breeds into the Rabbit ArrayList
		// Rabbit stored place 0 in ArrayList - French Angora contains information of species, age, and weight
		rabbit.add(new FrenchAngoraRabbit());
		rabbit.get(0).setRabbitSpecies("French Angora");
		rabbit.get(0).setRabbitAge(3);
		rabbit.get(0).setRabbitWeight(7.50);

		// Rabbit stored place 1 in ArrayList - Polish contains information of species, age, and weight
		rabbit.add(new PolishRabbit());
		rabbit.get(1).setRabbitSpecies("Polish");
		rabbit.get(1).setRabbitAge(2);
		rabbit.get(1).setRabbitWeight(2.50);

		// Rabbit stored place 2 in ArrayList - Flemish Giant contains information of species, age, and weight
		rabbit.add(new FlemishGiantRabbit());
		rabbit.get(2).setRabbitSpecies("Flemish Giant");
		rabbit.get(2).setRabbitAge(3);
		rabbit.get(2).setRabbitWeight(15);

		// Rabbit stored place 3 in ArrayList - Jersey Wooly contains information of species, age, and weight
		rabbit.add(new JerseyWoolyRabbit());
		rabbit.get(3).setRabbitSpecies("Jersey Wooly");
		rabbit.get(3).setRabbitAge(5);
		rabbit.get(3).setRabbitWeight(3.50);

		do 
		{	
			// Menu selection Interface (Looping menu selection after each options except option 4)
			System.out.println("Welcome to the Pet shop !");
			System.out.println("-------------------------------------------------------");
			System.out.println("Please select the option.");
			System.out.println("\t1. Dog");
			System.out.println("\t2. Cat"); 
			System.out.println("\t3. Rabbit");
			System.out.println("\t4. Quit Program");
			System.out.println("-------------------------------------------------------");
			System.out.print("Option: ");
			option = stdIn.nextInt();

			// When user chooses the dog option
			if(option == 1)
			{
				System.out.println("-------------------------------------------------------");
				System.out.println("\t1.Dachshund");
				System.out.println("\t2.Beagle");
				System.out.println("\t3.Husky");
				System.out.println("\t4.Puggle");
				System.out.println("\t5.Feeding food to the dog");
				System.out.println("\t6.Make them sound!");
				System.out.println("\t7.Comparing Weight");
				System.out.println("-------------------------------------------------------");
				System.out.print("Please select the option: ");
				dogOption = stdIn.nextInt();

				// Get first dog information from the array list
				if(dogOption == 1)
				{
					System.out.println("\n" + dog.get(0) + " The dog name is " + dog.get(0).getName() + ".\n");
				}

				// Get second dog information from the array list
				if(dogOption == 2)
				{
					System.out.println("\n" + dog.get(1) + " The dog name is " + dog.get(1).getName() + ".\n");
				}

				// Get third dog information from the array list
				if(dogOption == 3)
				{
					System.out.println("\n" + dog.get(2) + " The dog name is " + dog.get(2).getName() + ".\n");
				}

				// Get fourth dog information from the array list
				if(dogOption == 4)
				{
					System.out.println("\n" + dog.get(3) + " The dog name is " + dog.get(3).getName() + ".\n");
				}

				// When user chooses to feed the Dog
				if(dogOption == 5)
				{
					System.out.println("-------------------------------------------------------");
					System.out.println("Who would you give it to?");
					System.out.println("\t1.Dachshund");
					System.out.println("\t2.Beagle");
					System.out.println("\t3.Husky");
					System.out.println("\t4.Puggle");
					System.out.println("-------------------------------------------------------");
					System.out.print("Please select the option: ");
					dogFeedOption = stdIn.nextInt();

					// Feed first dog from the array list, and user available to check dog gain weight after eat.
					if(dogFeedOption == 1)
					{
						dog.get(0).getFood();
						System.out.println("\n" + dog.get(0).getDogSpecies() + " ate it all up! now " + 
								dog.get(0).getName() + " is " + dog.get(0).getDogWeight() + " pounds." + "\n"); 
					}

					// Feed second dog from the array list, and user available to check dog gain weight after eat.
					if(dogFeedOption == 2)
					{
						dog.get(1).getFood();
						System.out.println("\n" + dog.get(1).getDogSpecies() + " ate it all up! now " + 
								dog.get(1).getName() + " is " + dog.get(1).getDogWeight() + " pounds." + "\n"); 
					}

					// Feed third dog from the array list, and user available to check dog gain weight after eat.
					if(dogFeedOption == 3)
					{
						dog.get(2).getFood();
						System.out.println("\n" + dog.get(2).getDogSpecies() + " ate it all up! now " + 
								dog.get(2).getName() + " is " + dog.get(2).getDogWeight() + " pounds." + "\n"); 
					}

					// Feed fourth dog from the array list, and user available to check dog gain weight after eat.
					if(dogFeedOption == 4)
					{
						dog.get(3).getFood();
						System.out.println("\n" + dog.get(3).getDogSpecies() + " ate it all up! now " +
								dog.get(3).getName() + " is " + dog.get(3).getDogWeight() + " pounds." + "\n");  
					}
				}

				// When user chooses to make sound of the dog
				if(dogOption == 6)
				{
					System.out.println("-------------------------------------------------------");
					System.out.println("Which dog sound you want to hear?");
					System.out.println("\t1.Dachshund");
					System.out.println("\t2.Beagle");
					System.out.println("\t3.Husky");
					System.out.println("\t4.Puggle");
					System.out.println("-------------------------------------------------------");
					System.out.print("Please select the option: ");
					dogSoundOption = stdIn.nextInt();

					// Sound of the first dog from the array list
					if(dogSoundOption == 1)
					{
						System.out.println("\n" + dog.get(0).getName() + " makes sound like " + dog.get(0).getSound() + " ! " + "\n");
					}

					// Sound of the second dog from the array list
					if(dogSoundOption == 2)
					{
						System.out.println("\n" + dog.get(1).getName() + " makes sound like " + dog.get(1).getSound() + " ! " + "\n");
					}

					// Sound of the third dog from the array list
					if(dogSoundOption == 3)
					{
						System.out.println("\n" + dog.get(2).getName() + " makes sound like " + dog.get(2).getSound() + " ! " + "\n");
					}

					// Sound of the fourth dog from the array list
					if(dogSoundOption == 4)
					{
						System.out.println("\n" + dog.get(3).getName() + " makes sound like " + dog.get(3).getSound() + " ! " + "\n");
					}
				}

				// When user chooses to compare dogs' weight
				if(dogOption == 7)
				{	
					System.out.println("");

					// Check all the dogs from the array list
					for(int i = 1; i<dog.size(); i++)
					{
						// When dachshund has the same weight with other dog
						if(dog.get(0).compareTo(dog.get(i)) == 0)
							System.out.println("The Dachshund is " + dog.get(0).getDogWeight() + 
									" pound, and " + dog.get(i).getDogSpecies() + ", they have the same weight.");

						// When dachshund is lighter than other dog
						if(dog.get(0).compareTo(dog.get(i)) == -1)
							System.out.println("The Dachshund is " + dog.get(0).getDogWeight() + 
									" pound, and dachshund is lighter than " + dog.get(i).getDogSpecies() + ".");

						// When dachshund is heavier than other dog
						if(dog.get(0).compareTo(dog.get(i)) == 1)
							System.out.println("The Dachshund is " + dog.get(0).getDogWeight() + 
									" pound, and dachshund is heavier than "  + dog.get(i).getDogSpecies() + ".");
					}

					System.out.println("");
				}
			}

			// When user chooses the cat option
			if(option == 2)
			{
				System.out.println("-------------------------------------------------------");
				System.out.println("\t1.Persian");
				System.out.println("\t2.Munchkin");
				System.out.println("\t3.Russian Blue");
				System.out.println("\t4.Bambino");
				System.out.println("\t5.Feeding food to the Cat");
				System.out.println("\t6.Make them sound!");
				System.out.println("\t7.Comparing Weight");
				System.out.println("-------------------------------------------------------");
				System.out.print("Please select the option: ");
				catOption = stdIn.nextInt();

				// Get first cat information from the array list
				if(catOption == 1)
				{
					System.out.println("\n" + cat.get(0) + " The dog name is " + cat.get(0).getName() + ".\n");
				}

				// Get second cat information from the array list
				if(catOption == 2)
				{
					System.out.println("\n" + cat.get(1) + " The dog name is " + cat.get(1).getName() + ".\n");
				}

				// Get third cat information from the array list
				if(catOption == 3)
				{
					System.out.println("\n" + cat.get(2) + " The dog name is " + cat.get(2).getName() + ".\n");
				}

				// Get fourth cat information from the array list
				if(catOption == 4)
				{
					System.out.println("\n" + cat.get(3) + " The dog name is " + cat.get(3).getName() + ".\n");
				}

				// When user chooses to feed the Cat
				if(catOption == 5)
				{
					System.out.println("-------------------------------------------------------");
					System.out.println("Who would you give it to?");
					System.out.println("\t1.Persian");
					System.out.println("\t2.Munchkin");
					System.out.println("\t3.Russian Blue");
					System.out.println("\t4.Bambino");
					System.out.println("-------------------------------------------------------");
					System.out.print("Please select the option: ");
					catFeedOption = stdIn.nextInt();

					// Feed first cat from the array list, and user available to check cat gains weight after eat.
					if(catFeedOption == 1)
					{
						cat.get(0).getFood();
						System.out.println("\n" + cat.get(0).getCatSpecies() + " ate it all up! now " + 
								cat.get(0).getName() + " is " + cat.get(0).getCatWeight() + " pounds." + "\n"); 
					}

					// Feed second cat from the array list, and user available to check cat gains weight after eat.
					if(catFeedOption == 2)
					{
						cat.get(1).getFood();
						System.out.println("\n" + cat.get(1).getCatSpecies() + " ate it all up! now " + 
								cat.get(1).getName() + " is " + cat.get(1).getCatWeight() + " pounds." + "\n"); 
					}

					// Feed third cat from the array list, and user available to check cat gains weight after eat.
					if(catFeedOption == 3)
					{
						cat.get(2).getFood();
						System.out.println("\n" + cat.get(2).getCatSpecies() + " ate it all up! now " + 
								cat.get(2).getName() + " is " + cat.get(2).getCatWeight() + " pounds." + "\n"); 
					}

					// Feed fourth cat from the array list, and user available to check cat gains weight after eat.
					if(catFeedOption == 4)
					{
						cat.get(3).getFood();
						System.out.println("\n" + cat.get(3).getCatSpecies() + " ate it all up! now " + 
								cat.get(3).getName() + " is " + cat.get(3).getCatWeight() + " pounds." + "\n");  
					}
				}

				// When user chooses to make sound of the cat
				if(catOption == 6)
				{
					System.out.println("-------------------------------------------------------");
					System.out.println("Which cat sound you want to hear?");
					System.out.println("\t1.Persian");
					System.out.println("\t2.Munchkin");
					System.out.println("\t3.Russian Blue");
					System.out.println("\t4.Bambino");
					System.out.println("-------------------------------------------------------");
					System.out.print("Please select the option: ");
					catSoundOption = stdIn.nextInt();

					// Sound of the first cat from the array list
					if(catSoundOption == 1)
					{
						System.out.println("\n" + cat.get(0).getName() + " makes sound like " + cat.get(0).getSound() + " ! " + "\n");
					}

					// Sound of the second cat from the array list
					if(catSoundOption == 2)
					{
						System.out.println("\n" + cat.get(1).getName() + " makes sound like " + cat.get(1).getSound() + " ! " + "\n");
					}

					// Sound of the third cat from the array list
					if(catSoundOption == 3)
					{
						System.out.println("\n" + cat.get(2).getName() + " makes sound like " + cat.get(2).getSound() + " ! " + "\n");
					}

					// Sound of the fourth cat from the array list
					if(catSoundOption == 4)
					{
						System.out.println("\n" + cat.get(3).getName() + " makes sound like " + cat.get(3).getSound() + " ! " + "\n");
					}
				}

				// When user chooses to compare cats' weight
				if(catOption == 7)
				{
					System.out.println("");

					// Check all the cats from the array list
					for(int i = 1; i<cat.size(); i++)
					{
						// When persian cat has the same weight with other cat
						if(cat.get(0).compareTo(cat.get(i)) == 0)
							System.out.println("The Persian is " + cat.get(0).getCatWeight() + 
									" pound, and " + cat.get(i).getCatSpecies() + ", they have the same weight.");

						// When persian cat is lighter than other cat
						if(cat.get(0).compareTo(cat.get(i)) == -1)
							System.out.println("The Persian is " + cat.get(0).getCatWeight() + 
									" pound, and Persian is lighter than " + cat.get(i).getCatSpecies() + ".");

						// When persian cat is heavier than other cat
						if(cat.get(0).compareTo(cat.get(i)) == 1)
							System.out.println("The Persian is " + cat.get(0).getCatWeight() + 
									" pound, and Persian is heavier than "  + cat.get(i).getCatSpecies() + ".");
					}

					System.out.println("");
				}
			}

			// When user chooses the rabbit option
			if(option == 3)
			{
				System.out.println("-------------------------------------------------------");
				System.out.println("\t1.French Angora");
				System.out.println("\t2.Polish");
				System.out.println("\t3.Flemish Giant");
				System.out.println("\t4.Jersey Wooly");
				System.out.println("\t5.Feeding food to the Rabbit");
				System.out.println("\t6.Make them sound!");
				System.out.println("\t7.Comparing Age");
				System.out.println("-------------------------------------------------------");
				System.out.print("Please select the option: ");
				rabbitOption = stdIn.nextInt();

				// Get first rabbit information from the array list
				if(rabbitOption == 1)
				{
					System.out.println("\n" + rabbit.get(0) + " The rabbit name is " + rabbit.get(0).getName() + ".\n");
				}

				// Get second rabbit information from the array list
				if(rabbitOption == 2)
				{
					System.out.println("\n" + rabbit.get(1) + " The rabbit name is " + rabbit.get(1).getName() + ".\n");
				}

				// Get third rabbit information from the array list
				if(rabbitOption == 3)
				{
					System.out.println("\n" + rabbit.get(2) + " The rabbit name is " + rabbit.get(2).getName() + ".\n");
				}

				// Get fourth rabbit information from the array list
				if(rabbitOption == 4)
				{
					System.out.println("\n" + rabbit.get(3) + " The rabbit name is " + rabbit.get(3).getName() + ".\n");
				}

				// When user chooses to feed the Rabbit
				if(rabbitOption == 5)
				{
					System.out.println("-------------------------------------------------------");
					System.out.println("Who would you give it to?");
					System.out.println("\t1.French Angora");
					System.out.println("\t2.Polish");
					System.out.println("\t3.Flemish Giant");
					System.out.println("\t4.Jersey Wooly");
					System.out.println("-------------------------------------------------------");
					System.out.print("Please select the option: ");
					rabbitFeedOption = stdIn.nextInt();

					// Feed first rabbit from the array list, and user available to check rabbit gains weight after eat.
					if(rabbitFeedOption == 1)
					{
						rabbit.get(0).getFood();
						System.out.println("\n" + rabbit.get(0).getRabbitSpecies() + " ate it all up! now " + 
								rabbit.get(0).getName() + " is " + rabbit.get(0).getRabbitWeight() + " pounds." + "\n"); 
					}

					// Feed second rabbit from the array list, and user available to check rabbit gains weight after eat.
					if(rabbitFeedOption == 2)
					{
						rabbit.get(1).getFood();
						System.out.println("\n" + rabbit.get(1).getRabbitSpecies() + " ate it all up! now " + 
								rabbit.get(1).getName() + " is " + rabbit.get(1).getRabbitWeight() + " pounds." + "\n"); 
					}

					// Feed third rabbit from the array list, and user available to check rabbit gains weight after eat.
					if(rabbitFeedOption == 3)
					{
						rabbit.get(2).getFood();
						System.out.println("\n" + rabbit.get(2).getRabbitSpecies() + " ate it all up! now " + 
								rabbit.get(2).getName() + " is " + rabbit.get(2).getRabbitWeight() + " pounds." + "\n"); 
					}

					// Feed fourth rabbit from the array list, and user available to check rabbit gains weight after eat.
					if(rabbitFeedOption == 4)
					{
						rabbit.get(3).getFood();
						System.out.println("\n" + rabbit.get(3).getRabbitSpecies() + " ate it all up! now " + 
								rabbit.get(3).getName() + " is " + rabbit.get(3).getRabbitWeight() + " pounds." + "\n");  
					}
				}

				// When user chooses to make sound of the rabbit
				if(rabbitOption == 6)
				{
					System.out.println("-------------------------------------------------------");
					System.out.println("Which rabbit sound you want to hear?");
					System.out.println("\t1.French Angora");
					System.out.println("\t2.Polish");
					System.out.println("\t3.Flemish Giant");
					System.out.println("\t4.Jersey Wooly");
					System.out.println("-------------------------------------------------------");
					System.out.print("Please select the option: ");
					rabbitSoundOption = stdIn.nextInt();

					// Sound of the first rabbit from the array list
					if(rabbitSoundOption == 1)
					{
						System.out.println("\n" + rabbit.get(0).getName() + " makes sound like " + rabbit.get(0).getSound() + " ! " + "\n");
					}

					// Sound of the second rabbit from the array list
					if(rabbitSoundOption == 2)
					{
						System.out.println("\n" + rabbit.get(1).getName() + " makes sound like " + rabbit.get(1).getSound() + " ! " + "\n");
					}

					// Sound of the third rabbit from the array list
					if(rabbitSoundOption == 3)
					{
						System.out.println("\n" + rabbit.get(2).getName() + " makes sound like " + rabbit.get(2).getSound() + " ! " + "\n");
					}

					// Sound of the fourth rabbit from the array list
					if(rabbitSoundOption == 4)
					{
						System.out.println("\n" + rabbit.get(3).getName() + " makes sound like " + rabbit.get(3).getSound() + " ! " + "\n");
					}
				}

				// When user chooses to compare rabbits' age
				if(rabbitOption == 7)
				{
					System.out.println("");

					// Check all the rabbits from the array list
					for(int i = 1; i<rabbit.size(); i++)
					{
						// When French angora has the same age with other rabbit
						if(rabbit.get(0).compareTo(rabbit.get(i)) == 0)
							System.out.println("The French Angora is " + rabbit.get(0).getRabbitAge() + 
									" years old, and " + rabbit.get(i).getRabbitSpecies() + " has the same age.");

						// When French angora is younger than the other rabbit
						if(rabbit.get(0).compareTo(rabbit.get(i)) == -1)
							System.out.println("The French Angora is " + rabbit.get(0).getRabbitAge() + 
									" years old, and French Angora is younger than " + rabbit.get(i).getRabbitSpecies() + ".");

						// When French angora is older than the other rabbit
						if(rabbit.get(0).compareTo(rabbit.get(i)) == 1)
							System.out.println("The French Angora is " + rabbit.get(0).getRabbitAge() +
									" years old, and French Angora is older than "  + rabbit.get(i).getRabbitSpecies() + ".");
					}

					System.out.println("");
				}
			}

			// When user chooses to finish the program
			if(option == 4)
			{
				System.out.println("Thank you for using this program! Good bye . . . ");
			}

			// When user chooses invalid option
			if(option < 1 || option > 4)
			{
				System.out.println("Invalid Option . . . Please try again . ");
			}

		// Looping until option 4 is selected (do-while)
		}while(option != 4);

		// Close the scanner object
		stdIn.close();
	}

}