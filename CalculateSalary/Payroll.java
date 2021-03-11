/**
 * @author Sehyun Cho
 * 
 */
package calculateSalary;
// Fields
public class Payroll {
	private String id;
	private String name;
	private double hourly;
	private double numberOfHour;
	/**
	 * Constructor
	 * 
	 */
	public Payroll()
	{
		id = "";
		name = "";
		hourly = numberOfHour = 0;
	}
	
	public Payroll(String empId, String empName)
	{
		id = empId;
		name = empName;
		hourly = numberOfHour = 0;
	}
	
	/**
	 * Accessors
	 * 
	 * 
	 * @return
	 */
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getHourly()
	{
		return hourly;
	}
	public double getNumberOfHour()
	{
		return numberOfHour;
	}
	
	/**
	 *  Mutators
	 *  
	 *  
	 */
	public void setId(String empId)
	{
		id = empId;
	}
	public void setName(String empName)
	{
		name = empName;
	}
	public void setHourly(double payHour)
	{
		hourly = payHour;
	}
	public void setNumberOfHour(double numHour)
	{
		numberOfHour = numHour;
	}
	/**
	 * Calculate salary according to employee's hour and hour rate, over 40 hours of working could be
	 * multiply 1.5 of the standard salary calculation.
	 * 
	 * @return - salary
	 */
	public double calcGrossPay()
	{
		double salary;
		salary = hourly * numberOfHour;
		if(numberOfHour > 40)
		{
			salary = numberOfHour * (hourly * 1.5);
		}
		if (salary < 0 ) {
			System.out.println("Salary can't be the negative number.");
		}
		return salary;
	}
}