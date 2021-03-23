/**
 * @author Sehyun Cho
 * File name: BambinoCat.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * BambinoCat sub class extended from MunchkinCat concrete class.
 * 
 * This class will have:
 * Constructor
 * createCat (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 *  -Overriding toString()
 *  
 */
package mammal;

public class BambinoCat extends MunchkinCat
{
	// Constructor
	public BambinoCat()
	{
		super();
	}

	// Getters
	// Override the weight component for Bambino
	public void getFood()
	{
		setCatWeight(getCatWeight() + 1);
	}

	// Override the sound component for Bambino
	public String getSound()
	{
		return "Meow";
	}

	// Override the name component for Bambino
	public String getName()
	{
		return "Bino";
	}

	// Overriding for printing which breeds are mixed, age and weight as well.
	public String toString()
	{
		return "The " + getCatSpecies() + " is mixed with Munchkin and Sphynx. " + getCatAge() + " years old and " + getCatWeight() + " pounds.";
	}

}