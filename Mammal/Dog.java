/**
 * @author Sehyun Cho
 * File name: Dog.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * The abstract class Dog, implements Mammal interface, and Comparable<T>
 * 
 * Private instance variables
 * Constructor
 * createDog (with species, weight, and age)
 * Setters
 * Getters
 * toString(overriding)
 * compareTo
 */
package mammal;

// Abstract dog class that implements Mammal interface, and having Comparable<T> for compareTo
public abstract class Dog implements Mammal, Comparable<Dog>
{
	// Private instance variables declaration
	private double dogWeight;
	private int dogAge;
	private String dogSpecies;

	// Constructor
	Dog()
	{
		super();
	}

	// Abstract for creating dog
	public abstract void createDog(String s, double w, int a);

	// Setters
	public void setDogSpecies(String s)
	{
		dogSpecies = s;
	}

	public void setDogWeight(double w)
	{
		dogWeight = w;
	}

	public void setDogAge(int a)
	{
		dogAge = a;
	}

	// Getters
	public String getDogSpecies()
	{
		return dogSpecies;
	}

	public double getDogWeight()
	{
		return dogWeight;
	}

	public int getDogAge()
	{
		return dogAge;
	}

	// Overriding
	public String toString()
	{
		return "This dog breed is " + getDogSpecies() + ", " + getDogAge() + " years old and " + getDogWeight() + " pounds.";
	}

	// compareTo to compare dogs' weight
	public int compareTo(Dog obj)
	{
		if (dogWeight < obj.dogWeight)
			return -1;
		else if (dogWeight == obj.dogWeight)
			return 0;
		else 
			return 1;
	}
}