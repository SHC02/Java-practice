/**
 * @author Sehyun Cho
 * 
 * Car.java
 * 
 * Class that keep information of the car and calculate acceleration or deceleration.
 * 
 * 
 */
package drivingCars;

public class Car {
	private String make;		//Company that make of the car
	private int yearModel;		//Car's year model
	private int speed;			//Car's current speed;
	/**
	 * Constructor(s)
	 * Creates objects and initialize make, yearModel, and speed.
	 */
	public Car()
	{
		make = "";
		yearModel = speed = 0;
	}
	/**
	 * Constructor(s)
	 * Created make and yearModel to the value
	 * pass through the parameter modelName and yModel.
	 * 
	 * @param modelName
	 * @param yModel
	 */
	public Car(String modelName, int yModel)
	{
		make = modelName;
		yearModel = yModel;
		speed = 0;
	}
	/**
	 * 
	 * Accessors
	 * getter - one per field
	 * 
	 */
	public String getCompanyMake()
	{
		return make;
	}
	public int getYmodel()
	{
		return yearModel;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * 
	 * Mutator(s)
	 * setter - one per field
	 * @param modelName
	 */
	public void setYmake(String modelName)
	{
		make = modelName;
	}
	/**
	 * Mutator(s)
	 * setter - one per field
	 * @param yModel
	 */
	public void setyModel(int yModel)
	{
		yearModel = yModel;
	}
	/**
	 * Mutator(s)
	 * setter - one per field
	 * @param spd
	 */
	public void setSpd(int spd)
	{
		speed = spd;
	}
	/**
	 *  Calculate acceleration +5 for the car
	 *  @return - accelerated speed
	 */
	public int accelerate()
	{
		speed += 5;
		return speed;
	}
	/**
	 * Calculate deceleration -5 for the car
	 * Deceleration can't be less than 0 miles per hour.
	 * 
	 * @return - decelerated speed
	 */
	public int decelerate()
	{	
		if(speed >= 1) 
			speed -= 5;
		else
			speed = 0;
		return speed;
	}
}
