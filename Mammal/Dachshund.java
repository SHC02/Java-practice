/**
 * @author Sehyun Cho
 * File name: Dachshund.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Dachshund concrete class extended from Dog abstract class.
 * 
 * This class will have:
 * Constructor
 * createDog (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 * 
 */
package mammal;

public class Dachshund extends Dog
{
	// Constructor
	public Dachshund()
	{
		super();
	}
	
	// Create dog with species, weight, and age
	public void createDog(String s, double w, int a)
	{
		setDogSpecies(s);
		setDogWeight(w);
		setDogAge(a);
	}
	
	// Getters
	// Override the weight component for Dachshund
	public void getFood()
	{
		setDogWeight(getDogWeight() + 2);
	}

	// Override the sound component for Dachshund
	public String getSound()
	{
		return "Woof woof";
	}
	
	// Override the name component for Dachshund
	public String getName()
	{
		return "Hunto";
	}

}