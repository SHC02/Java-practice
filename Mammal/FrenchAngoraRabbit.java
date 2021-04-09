/**
 * @author Sehyun Cho
 * File name: FrenchAngoraRabbit.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * FrenchAngoraRabbit concrete class extended from Rabbit abstract class.
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

public class FrenchAngoraRabbit extends Rabbit 
{
	// Constructor
	public FrenchAngoraRabbit()
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
	// Override the weight component for French Angora
	public void getFood()
	{
		setRabbitWeight(getRabbitWeight() + 1);
	}

	// Override the sound component for French Angora
	public String getSound()
	{
		return "Squeeeeak";
	}

	// Override the name component for French Angora
	public String getName()
	{
		return "Angoree";
	}

}