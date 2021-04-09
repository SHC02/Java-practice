/**
 * @author Sehyun Cho
 * File name: Husky.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Husky concrete class extended from Dog abstract class.
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

public class Husky extends Dog
{
	// Constructor
	public Husky()
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
	
	// Getter
	// Override the weight component for Husky
	public void getFood()
	{
		setDogWeight(getDogWeight() + 4);
	}
	
	// Override the sound component for Husky
	public String getSound()
	{
		return "WOOF";
	}
	
	// Override the name component for Husky
	public String getName()
	{
		return "Hussi";
	}
}