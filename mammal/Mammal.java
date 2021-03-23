/**
 * @author Sehyun Cho
 * File name: Mammal.java
 * Java version: 11.0.8
 * IDE version: Eclipse (4.16.0)
 * 
 * This Mammal interface has three abstract methods:
 * void getFood() - feeding mammal
 * String getSound() - sound of mammal
 * String getName() -  name of mammal
 * 
 * It will have 3 abstract classes: Dog, Cat, and Rabbit
 * 
 * It will have 9 concrete classes: 
 * Dog - Dachshund, Beagle, Husky
 * Cat - Persian, Munchkin, Russian Blue
 * Rabbit - French Angora, Polish, Flemish Giant
 * 
 * It will have 3 concrete subclasses extending from a subclass
 * Dog - Puggle - extended from Beagle class
 * Cat - Bambino - extended from MunchkinCat class
 * Rabbit - Jersey Wooly - extended from FrenchAngoraRabbit class
 * 
 */
package mammal;

// Mammal interface
public interface Mammal
{
	void getFood();
	String getSound();
	String getName();
}