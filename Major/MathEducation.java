/**
 * @author Sehyun Cho
 * File name: MathEducation.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Subclass 'MathEducation' from 'Math' class.
 * For overriding, MathEducation class has output of 
 * what course students need to take and what grades they need, to apply the major.
 */
package major;

public class MathEducation extends Math
{
	// Declare variable
	private String courseID;

	// Constructor
	public MathEducation(String majorName, double studentGPA, double acceptanceRate, double grade, String course)
	{
		// Access attributes of 'Math' class
		super(majorName, studentGPA, acceptanceRate, grade);
		// Initialize the instance variable
		courseID = course;
	}

	// Getter
	public String getCourseID()
	{
		return courseID;
	}

	// Overriding
	public String toString()
	{
		return "To apply " + getMajorName() + " major, student needs to take " + courseID + " course with " + getGradeForAccept()
		+ " or higher grades.";
	}
}
