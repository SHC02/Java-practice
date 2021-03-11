/**
 * @author Sehyun Cho
 * File name: MajorTester.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * Tester class for Major class. 
 * This class print outputs from the all classes.
 * 
 * Pseudocode: 
 * Create Array list for Majors (ArrayList<Major> major)
 * Create objects (Major major1 = new Major())
 * Overridden toString output for Major class (println(major1))
 * Print information message for every majors (println(class.message1))
 * Overridden toString output for each major sub classes (println(class))
 * Overridden toString output for Math and MathEducation class (println(class))
 * Print rejected rate (rejectedPercentage(major))
 * Create for output of rejected rate as percentage for each array item from the major array list (static void rejectPercentage(ArrayList<Major>major))
 */
package major;

// Import class
import java.util.ArrayList;

public class MajorTester { 

	public static void main(String[] args)
	{	
		// Create Array list for Majors
		ArrayList<Major> major = new ArrayList<Major>();
		major.add(new Major("Computer Science", 3.50, 0.63));
		major.add(new Major("Cyber Security", 3.25, 0.77));
		major.add(new Major("Business", 3.12, 0.75));

		// Create objects
		Major major1 = new Major("Computer Science", 3.50, 0.63);
		ComputerScience computer = new ComputerScience("Computer Science", 3.50 , 0.63, 24);
		CyberSecurity cSecurity = new CyberSecurity("Cyber Security", 3.25, 0.77, 7);
		Business business = new Business("Business", 3.12, 0.75, 32);
		Math math = new Math("Computer Science", 3.50, 0.63, 85.0);
		MathEducation mathCourse = new MathEducation("Computer Science", 3.50, 0.63, 85.0, "MAC2312");

		// Overridden toString output for Major class
		System.out.println(major1);

		System.out.println("");

		// Print information message for every majors 
		System.out.println(computer.message1());
		System.out.println(cSecurity.message1());
		System.out.println(business.message1());

		System.out.println("");

		// Overridden toString output for each major sub classes
		System.out.println(computer);
		System.out.println(cSecurity);
		System.out.println(business);

		System.out.println("");

		// Overridden toString output for Math and MathEducation class
		System.out.println(math);
		System.out.println(mathCourse);
		System.out.println("");

		// Print rejected rate
		rejectPercentage(major);
	}

	// Create for output of rejected rate as percentage for each array item from the major array list
	static void rejectPercentage(ArrayList<Major>major)
	{
		for(Major m : major)
		{
			System.out.println(m.rejected() + "in " + m.getMajorName() + " major.");		
		}
	}
}
