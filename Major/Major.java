/**
 * @author Sehyun Cho
 * File name: Major.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Major class is superclass and has three attributes that inherits to the subclasses:
 * Major name, student GPA, and acceptance rate.
 * For overriding, Major class has output of the best major in 2020.
 * 
 */
package major;

public class Major
{
	// Declare variables
	private String majorName;
	private double studentGPA;
	private double acceptanceRate;

	// Constructor
	public Major(String majorName, double studentGPA, double acceptanceRate)
	{
		this.majorName = majorName;
		this.studentGPA = studentGPA;
		this.acceptanceRate = acceptanceRate;
	}

	// Getter 
	public String getMajorName()
	{
		return majorName;
	}
	public double getStudentGPA()
	{
		return studentGPA;
	}
	public double getAcceptanceRate()
	{
		return acceptanceRate;
	}

	// Overriding
	public String toString()
	{
		return "Welcome to the Florida International University! Our Best Major in 2020 was " + getMajorName() + ". Congratulations!";
	}

	// Output for rejected rate as percentage
	public String rejected()
	{
		return "In 2020, the rejected rate was " + ((1-acceptanceRate)*100) + "% ";
	}
}
