/**
 * @author Sehyun Cho
 * File name: RussianBlueCat.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * RussianBlueCat concrete class extended from Cat abstract class.
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

public class RussianBlueCat extends Cat
{
	// Constructor
	public RussianBlueCat()
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

	// Override the weight component for Russian Blue
	public void getFood()
	{
		setCatWeight(getCatWeight() + 2);
	}

	// Override the sound component for Russian Blue
	public String getSound()
	{
		return "Meeeeow";
	}

	// Override the name component for Russian Blue
	public String getName()
	{
		return "Blue";
	}
}