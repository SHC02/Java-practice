/**
 * @author Sehyun Cho
 * File name: MunchkinCat.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * MunchkinCat concrete class extended from Cat abstract class.
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

public class MunchkinCat extends Cat 
{
	// Constructor
	public MunchkinCat()
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

	// Override the weight component for Munchkin
	public void getFood()
	{
		setCatWeight(getCatWeight() + 2);
	}

	// Override the sound component for Munchkin
	public String getSound()
	{
		return "Meeeeeeeeeeeeow";
	}

	// Override the name component for Munchkin
	public String getName()
	{
		return "Cheeto";
	}
}