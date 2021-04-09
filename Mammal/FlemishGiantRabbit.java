/**
 * @author Sehyun Cho
 * File name: FlemishGiantRabbit.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * FlemishGiantRabbit concrete class extended from Rabbit abstract class.
 * 
 * This class will have:
 * Constructor
 * createRabbit (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 * 
 */
package mammal;

public class FlemishGiantRabbit extends Rabbit
{
	// Constructor
	public FlemishGiantRabbit()
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
	// Override the weight component for Flemish Giant
	public void getFood()
	{
		setRabbitWeight(getRabbitWeight() + 2);
	}

	// Override the sound component for Flemish Giant
	public String getSound()
	{
		return "Squeak Squeak Squeak";
	}

	// Override the name component for Flemish Giant
	public String getName()
	{
		return "Biggie";
	}

}