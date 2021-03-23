/**
 * @author Sehyun Cho
 * File name: Rabbit.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * The abstract class Rabbit, implements Mammal interface, and Comparable<T>
 * 
 * Private instance variables
 * Constructor
 * createRabbit (with species, weight, and age)
 * Setters
 * Getters
 * toString(overriding)
 * compareTo
 */
package mammal;

// Abstract rabbit class that implements Mammal interface, and having Comparable<T> for compareTo
public abstract class Rabbit implements Mammal, Comparable<Rabbit>
{
	// Private instance variables declaration
	private double rabbitWeight;
	private int rabbitAge;
	private String rabbitSpecies;

	// Constuctor
	Rabbit()
	{
		super();
	}

	// Abstract for creating rabbit
	public abstract void createRabbit(String s, double w, int a);

	// Setters
	public void setRabbitSpecies(String s)
	{
		rabbitSpecies = s;
	}

	public void setRabbitWeight(double w)
	{
		rabbitWeight = w;
	}

	public void setRabbitAge(int a)
	{
		rabbitAge = a;
	}

	// Getters
	public String getRabbitSpecies()
	{
		return rabbitSpecies;
	}

	public double getRabbitWeight()
	{
		return rabbitWeight;
	}

	public int getRabbitAge()
	{
		return rabbitAge;
	}

	// Overriding
	public String toString()
	{
		return "This Rabbit breed is " + getRabbitSpecies() + ", " + getRabbitAge() + " years old and " + getRabbitWeight() + " pounds.";
	}

	// compareTo to comparing rabbits' age
	public int compareTo(Rabbit obj)
	{
		if (rabbitAge < obj.rabbitAge)
			return -1;
		else if (rabbitAge == obj.rabbitAge)
			return 0;
		else 
			return 1;
	}
}