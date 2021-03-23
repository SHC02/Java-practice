/**
 * @author Sehyun Cho
 * File name: PersianCat.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * PersianCat concrete class extended from Cat abstract class.
 * 
 * This class will have:
 * Constructor
 * createCat (with species, weight, and age)
 * Getters
 * 	-Overriding getFood()
 * 	-Overriding getSound()
 * 	-Overriding getName()
 * 
 */
package mammal;

public class PersianCat extends Cat
{
	// Constructor
	public PersianCat()
	{
		super();
	}

	// Create cat with species, weight, and age
	public void createCat(String s, double w, int a)
	{
		setCatSpecies(s);
		setCatWeight(w);
		setCatAge(a);
	}

	// Override the weight component for Persian
	public void getFood()
	{
		setCatWeight(getCatWeight() + 1);
	}

	// Override the sound component for Persian
	public String getSound()
	{
		return "Meow meow";
	}

	// Override the name component for Persian
	public String getName()
	{
		return "Persy";
	}
}