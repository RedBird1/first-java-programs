/* 
 *File name: RoomDimension.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 27, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *Two fields Length & Width 
 *-Constructor to receive length and width from main
 *-Method to return Area (Length X Width)
 *-toString
 *
 * @author Zachary Schleder
 *
 */
public class RoomDimension
{

	private double length=0;
	private double width=0;
	
	/**
	 * receives thelength and width variables from the driver. 
	 * 
	 * @param length
	 * @param width
	 */
	public RoomDimension(double length, double width)
	{

		this.length=length;
		this.width=width;
	}
	/**
	 * Calculates the area of room
	 * @return(length*width)
	 */
	public double calculateArea()
	{
		return length*width;
	}
	/**
	 * toString that returns the dimensions entered &
	 * return the calculated area to the user. 
	 */
	public String toString()
	{
		return "The Room's dimensions are "+length+" x "+
				width+" and the area is "+calculateArea()+"ft.";
	}
	
}
