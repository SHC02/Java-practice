/**
 * @author Sehyun Cho
 * File name: Puggle.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Puggle sub class extended from Beagle concrete class.
 * 
 * This class will have:
 * Constructor
 * createDog (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 *  -Overriding toString()
 * 
 */
package mammal;

public class Puggle extends Beagle
{
	// Constructor
	public Puggle()
	{
		super();
	}
	
	// Getters
	// Override the weight component for Puggle
	public void getFood()
	{
		setDogWeight(getDogWeight() + 2);
	}
	
	// Override the sound component for Puggle
	public String getSound()
	{
		return "Hoof hoof";
	}
	
	// Override the name component for Puggle
	public String getName()
	{
		return "Puggly";
	}
	
	// Overriding for printing which breeds are mixed, age and weight as well.
	public String toString()
	{
		return "The " + getDogSpecies() + " is mixed with Beagle and Pug. " + getDogAge() + " years old and " + getDogWeight() + " pounds.";
	}

}