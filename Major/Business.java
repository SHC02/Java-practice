/**
 * @author Sehyun Cho
 * File name: Business.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Subclass 'Business' from 'Major' class.
 * For overriding, Business class has output of how many students got a job after graduate in 2019.
 */
package major;

public class Business extends Major
{
	// Declare variable
	private int gotHired;

	// Constructor
	public Business(String majorName, double studentGPA, double acceptanceRate, int hired)
	{
		// Access attributes of 'Major' class
		super(majorName, studentGPA, acceptanceRate);
		// Initialize the instance variable
		gotHired = hired;
	}

	// Getter
	public int getHired()
	{
		return gotHired;
	}

	// Overriding
	public String toString()
	{
		return "Among the graduates of 2019, " + gotHired + " students majored in " + getMajorName() + " succeed in getting a job.";
	}

	// Message for major
	public String message1()
	{
		return "The " + getMajorName() + " major needs minimum GPA of " + getStudentGPA() + " and have " + (getAcceptanceRate() * 100) + "% of acceptance rate in 2020.";
	}
}
