/* 
 *File name: Die.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 29, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

package edu.ilstu;
import java.util.Random;
/**
 *This class represents the die.
 *hold instance variable that is set by the calling of the roll method. 
 *That creates the rolled die. There is also an equals method to determine 
 *if the spots variable of this Die object == another Die.getSpots() object.
 *
 * @author Zachary Schleder
 *
 */
public class Die
{
	private int spots=0;
	private Random generator;
	
	/**
	 * Creates the Random() object called generator. 
	 */
	public Die()
	{
		generator = new Random();
	}
	/**
	 * Void method that sets the number of spots to the random number created
	 * by the generator Random() object. This represents a Die roll.
	 */
	public void roll()
	{
		spots=generator.nextInt(6)+1;;
	}
	/**
	 * getSpots on die. 
	 * @return spots
	 */
	public int getSpots()
	{
		return spots;
	}
	
	/**
	 * Equals method to compare one dies spots to another.
	 * if equals return true.
	 * if not equals return false.
	 * @param other Die object
	 * @return boolean
	 */
	public boolean equals(Die other)
	{
		if(spots==other.getSpots())
		{
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
}
