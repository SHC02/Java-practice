/**
 * @author Sehyun Cho
 * File name: ComputerScience.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Subclass 'ComputerScience' from 'Major' class.
 * For overriding, ComputerScience class has output of how many honor society members have in their major in 2020.
 */
package major;

public class ComputerScience extends Major
{
	// Declare variable
	private int honorMembers;

	// Constructor
	public ComputerScience(String majorName, double studentGPA, double acceptanceRate, int h)
	{	
		// Access attributes of 'Major' class
		super(majorName, studentGPA, acceptanceRate);
		// Initialize the instance variable
		honorMembers = h;
	}

	// Getter
	public int getHonorMembers()
	{
		return honorMembers;
	}

	// Overriding
	public String toString()
	{
		return "The " + getMajorName() + " has " + honorMembers + " of Honor Society members.";
	}

	// Message for major
	public String message1()
	{
		return "The " + getMajorName() + " major needs minimum GPA of " + getStudentGPA() + " and have " + (getAcceptanceRate() * 100) + "% of acceptance rate in 2020.";
	}
}
