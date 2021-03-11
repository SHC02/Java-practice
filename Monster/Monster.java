/**
 * @author Sehyun Cho
 * Filename: Monster.java
 * Eclipse IDE version (4.16.0)
 * Java 11.0.8
 * 
 * The Monster class contains all of the instance variables and methods for a monster.
 * It contains: 1.Instant Variables
 * 				2.Constructor
 * 				3.Getter Methods
 * 				4.Setter Methods
 */

package monster;

public class Monster 
{
	// Private instant variables storing all attributes about a monster
	private String monsterName;
	private String monsterSpecies;
	private String monsterGender;
	private String monsterBodyColor;
	private String monsterEyeColor;
	private int monsterAge;
	private double monsterStrength;

	// Constructor for the Monster object
	public Monster(String name, String species, String gender, String bodyColor,
			String eyeColor, int age, double strength)
	{
		monsterName = name;
		monsterSpecies = species;
		monsterGender = gender;
		monsterBodyColor = bodyColor;
		monsterEyeColor = eyeColor;
		monsterAge = age;
		monsterStrength = strength;
	}

	// Getter methods for Monster object
	public String getMonsterName()
	{
		return monsterName;
	}
	public String getMonsterSpecies()
	{
		return monsterSpecies;
	}
	public String getMonsterGender()
	{
		return monsterGender;
	}
	public String getMonsterBodyColor()
	{
		return monsterBodyColor;
	}
	public String getMonsterEyeColor()
	{
		return monsterEyeColor;
	}
	public int getMonsterAge()
	{
		return monsterAge;
	}
	public double getMonsterStrength()
	{
		return monsterStrength;
	}

	// Setter methods for Monster object
	public void setMonsterName(String newMonsterName)
	{
		monsterName = newMonsterName;
	}
	public void setMonsterSpecies(String newMonsterSpecies)
	{
		monsterSpecies = newMonsterSpecies;
	}
	public void setMonsterGender(String newMonsterGender)
	{
		monsterGender = newMonsterGender;
	}
	public void setMonsterBodyColor(String newMonsterBodyColor)
	{
		monsterBodyColor = newMonsterBodyColor;
	}
	public void setMonsterEyeColor(String newMonsterEyeColor)
	{
		monsterEyeColor = newMonsterEyeColor;
	}
	public void setMonsterAge(int newMonsterAge)
	{
		monsterAge = newMonsterAge;
	}
	public void setMonsterStrength(double newMonsterStrength)
	{
		monsterStrength = newMonsterStrength;
	}

	//Setter methods to update attributes
	public void beastMode()
	{
		monsterStrength = (monsterAge * monsterStrength); 
	}
	public void potentialStrength(double moonStone)
	{
		monsterStrength = (monsterStrength * moonStone);
	}
}