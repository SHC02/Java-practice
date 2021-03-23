/**
 * @author Sehyun Cho
 * File name: Cat.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * The abstract class Cat, implements Mammal interface, and Comparable<T>
 * 
 * Private instance variables
 * Constructor
 * createCat (with species, weight, and age)
 * Setters
 * Getters
 * toString(overriding)
 * compareTo
 */
package mammal;

// Abstract cat class that implements Mammal interface, and having Comparable<T> for compareTo
public abstract class Cat implements Mammal, Comparable<Cat>
{
	// Private instance variables declaration
	private double catWeight;
	private int catAge;
	private String catSpecies;

	// Constructor
	Cat()
	{
		super();
	}

	// Abstract for creating cat
	public abstract void createCat(String s, double w, int a);

	// Setters
	public void setCatSpecies(String s)
	{
		catSpecies = s;
	}

	public void setCatWeight(double w)
	{
		catWeight = w;
	}

	public void setCatAge(int a)
	{
		catAge = a;
	}

	// Getters
	public String getCatSpecies()
	{
		return catSpecies;
	}

	public double getCatWeight()
	{
		return catWeight;
	}

	public int getCatAge()
	{
		return catAge;
	}

	// Overriding
	public String toString()
	{
		return "This Cat breed is " + getCatSpecies() + ", " + getCatAge() + " years old and " + getCatWeight() + " pounds.";
	}

	// compareTo to comparing cats' weight
	public int compareTo(Cat obj)
	{
		if (catWeight < obj.catWeight)
			return -1;
		else if (catWeight == obj.catWeight)
			return 0;
		else 
			return 1;
	}
}