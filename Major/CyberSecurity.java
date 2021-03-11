/**
 * @author Sehyun Cho
 * File name: CyberSecurity.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Subclass 'CyberSecurity' from 'Major' class.
 * For overriding, CyberSecurity class has output of how many awards they received in 2020.
 */
package major;

public class CyberSecurity extends Major
{
	// Declare variable
	private int awards;

	// Constructor
	public CyberSecurity(String majorName, double studentGPA, double acceptanceRate, int award)
	{
		// Access attributes of 'Major' class
		super(majorName, studentGPA, acceptanceRate);
		// Initialize the instance variable
		awards = award;
	}

	// Getter
	public int getAwards()
	{
		return awards;
	}

	// Overriding
	public String toString()
	{
		return "The " + getMajorName() + " major received " + awards + " awards in 2020.";
	}

	// Message for major
	public String message1()
	{
		return "The " + getMajorName() + " major needs minimum GPA of " + getStudentGPA() + " and have " + (getAcceptanceRate() * 100) + "% of acceptance rate in 2020.";
	}
}
