/**
 * @author Sehyun Cho
 * File name: PolishRabbit.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * PolishRabbit concrete class extended from Rabbit abstract class.
 * 
 * This class will have:
 * Constructor
 * createRabbit (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 */
package mammal;

public class PolishRabbit extends Rabbit
{
	// Constructor
	public PolishRabbit()
	{
		super();
	}

	// Create rabbit with species, weight, and age
	public void createRabbit(String s, double w, int a)
	{
		setRabbitSpecies(s);
		setRabbitWeight(w);
		setRabbitAge(a);
	}

	// Getters
	// Override the weight component for Polish
	public void getFood()
	{
		setRabbitWeight(getRabbitWeight() + 1);
	}

	// Override the sound component for Polish
	public String getSound()
	{
		return "Squeak";
	}

	// Override the name component for Polish
	public String getName()
	{
		return "Leeno";
	}

}