/**
 * @author Sehyun Cho
 * 
 * Student.java
 * 
 * Class that keeps information about a student and their grades
 * and calculates the final letter grade.
 * 	
 * 
 * 
 */
package calculateGrades;

public class Student {
	//Fields
	private String stdId; 			//Student ID
	private String stdName; 		//Student Name
	private int    midtermExam; 	//Mid-term Exam grade(0-100)
	private int    project; 			//Project grade(0-100)
	private int	   finalExam;		//Final Exam grade(0-100)
	
	//Constructors
	public Student()
	{
		stdId = "";
		stdName = "";
		midtermExam = project = finalExam = 0;
	}
	
	public Student(String id, String name,
				int mExam, int proj, int fExam)
	{
		stdId = id;
		stdName = name;
		midtermExam = mExam;
		project = proj;
		finalExam = fExam;
	}
	/**
	 *  Accessors
	 * getter - one per field
	 */
	public String getStdId()
	{
		return stdId;
	}
	
	/**
	 * Mutators
	 * setter - one per field
	 */
	public void setStdId(String id)
	{
		stdId = id;
	}
	
	public void setStdName(String name)
	{
		name = stdName;
	}
	
	public void setMidTerm(int mExam)
	{
		midtermExam = mExam;
	}
	
	public void setProject(int proj)
	{
		project = proj;
	}
	
	public void setFinalExam(int fExam)
	{
		finalExam = fExam;
	}
	
	/**
	 * Calculates the student's final grade and returns
	 * the corresponding letter grade
	 * 
	 * @return - Letter Grade(A to F)
	 */
	public char calculateLetterGrade()
	{
		char letterGrade;
		double average;
		//Calculate final grade 
		average = (double)((midtermExam + project + finalExam)/ 3.0);
		
		//Determine corresponding letter grade
		if (average >= 90)
			letterGrade = 'A';
		else if (average >= 80)
			letterGrade = 'B';
		else if (average >= 70)
			letterGrade = 'C';
		else if (average >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		return letterGrade;
	}

	
}
