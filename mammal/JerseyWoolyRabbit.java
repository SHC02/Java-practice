/**
 * @author Sehyun Cho
 * File name: JerseyWoolyRabbit.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * JerseyWoolyRabbit sub class extended from FrenchAngoraRabbit concrete class.
 * 
 * This class will have:
 * Constructor
 * createRabbit (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 *  -Overriding toString()
 *  
 */
package mammal;

public class JerseyWoolyRabbit extends FrenchAngoraRabbit
{
	// Constructor
	public JerseyWoolyRabbit()
	{
		super();
	}

	// Getters
	// Override the weight component for Jersey Wooly
	public void getFood()
	{
		setRabbitWeight(getRabbitWeight() + 1);
	}

	// Override the sound component for Jersey Wooly
	public String getSound()
	{
		return "Squeak Squeak";
	}

	// Override the name component for Jersey Wooly
	public String getName()
	{
		return "Wooly";
	}

	// Overriding for printing which breeds are mixed, age and weight as well.
	public String toString()
	{
		return "The " + getRabbitSpecies() + " is mixed with French Angora and Netherland Dwarf. " + getRabbitAge() + " years old and " + getRabbitWeight() + " pounds.";
	}

}