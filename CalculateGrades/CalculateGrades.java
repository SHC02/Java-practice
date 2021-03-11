/**
 * @author Sehyun Cho
 * 
 * CalculateGrades.java
 * 
 * Allows the user to create a student object, fill in their
 * course grades and determine the final letter grade.
 * 
 */
package calculateGrades;

//Import classes
import java.util.Scanner;

public class CalculateGrades {
	//Scanner for standard input
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// Declare variables
		char letterGrade;
		char again;
		
		// Intro
		System.out.println("\nStudent Grades Processing App . . .");
		
		// Create student object
		
		Student myStudent = new Student();
		do
		{
			// Prompt user for student data and update object fields
	
			System.out.print("\tStudent ID: " );
			//Clearing buffer
			stdIn.next();
			myStudent.setStdId(stdIn.nextLine());
			
			System.out.print("\tStudent Name: ");
			myStudent.setStdName(stdIn.nextLine());
			
			System.out.print("\tMidterm Exam: ");
			myStudent.setMidTerm(getGrade("Midterm Exam"));
			myStudent.setMidTerm(stdIn.nextInt());
			
			System.out.print("\tProject: ");
			myStudent.setProject(getGrade("Project"));
			myStudent.setProject(stdIn.nextInt());
			
			System.out.print("\tFinal Exam: ");
			myStudent.setFinalExam(getGrade("Final Exam"));
			myStudent.setFinalExam(stdIn.nextInt());
			
			// Calculate and determine student letter grade
			letterGrade = myStudent.calculateLetterGrade();
			System.out.println("Student's letter grade is: " + "'" + letterGrade + "'");
			
			
			// Prompt user whether to try again
			System.out.print("\nDo you have another student(y/n)? ");
			again = Character.toLowerCase(stdIn.next().charAt(0));
			
			if(again == 'n') {
				System.out.println("Good bye ...");
			}

		}while((again == 'y'));
		// Close the scanner object
		stdIn.close();
	
	}
	
	public static int getGrade(String label)
	{
		int grade = 0;
		return grade;
	}
	
}
