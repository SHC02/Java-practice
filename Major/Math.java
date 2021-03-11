/**
 * @author Sehyun Cho
 * File name: Math.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Subclass 'Math' from 'Major' class.
 * For overriding, Math class has output of what grades students should have to get accepted that major.
 */
package major;

public class Math extends Major
{
	// Declare variable
	private double gradeForAccept;

	// Constructor
	public Math(String majorName, double studentGPA, double acceptanceRate, double grade)
	{
		// Access attributes of 'Major' class
		super(majorName, studentGPA, acceptanceRate);
		// Initialize the instance variable
		gradeForAccept = grade;
	}

	// Getter
	public double getGradeForAccept()
	{
		return gradeForAccept;
	}

	// Overriding
	public String toString()
	{
		return  "To apply " + getMajorName() + " major, The math grade needed at least " + gradeForAccept + " or higher.";
	}
}
