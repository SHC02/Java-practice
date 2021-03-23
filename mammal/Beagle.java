/**
 * @author Sehyun Cho
 * File name: Beagle.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Beagle concrete class extended from Dog abstract class.
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

public class Beagle extends Dog 
{
	// Constructor
	public Beagle()
	{
		super();
	}
	
	// create dog with species, weight, and age
	public void createDog(String s, double w, int a)
	{
		setDogSpecies(s);
		setDogWeight(w);
		setDogAge(a);
	}
	
	// Getters
	// Override the weight component for Beagle
	public void getFood()
	{
		setDogWeight(getDogWeight() + 3);
	}
	
	// Override the sound component for Beagle
	public String getSound()
	{
		return "Hooooooowl";
	}
	
	// Override the name component for Beagle
	public String getName()
	{
		return "Beegly";
	}
}