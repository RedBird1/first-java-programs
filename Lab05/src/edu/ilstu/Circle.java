/* 
 *File name: Cirlce.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 17, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *This is a Class that will be used with the CircleDriver.java class. 
 *This class will contain a method that sets up construct the circle object.
 *Also contained are methods that perform calculations for the Circle. Diameter, Circumference, Area.
 *Finally there is a methed to return these calculations to the user. 
 *
 * @author Zachary Schleder
 *
 */
public class Circle
{
	//Constant for PI
	private final double PI = 3.14159;
	double radius;
	
	/**
	 * this is the circle object default constructor
	 */
	public Circle()
	{
	
		radius = 0;	
	}
	
	/**
	 * Method that sets the radius from the users input
	 */
	public void setRadius(double rad)
	{
		
		radius = rad;
	}
	
	/**
	 * Method that calculates the the diameter of the circle
	 */
	public double getDiameter()
	{
		return (radius*2);
	}
	
	/**
	 * Method that calculates the circumference of the circle 
	 */
	public double getCircumference()
	{
		return (PI*radius)*2;
	}
	
	/**
	 * Method that calculates the Area of the circle
	 */
	public double getArea()
	{
		return (radius*radius)*PI;
	}
	
	/**
	 * Method that prints the calculation methods for the dimensions of the circle: Radius, Diameter, Circumference, Area
	 */
	public void print()
	{
		System.out.println("Diameter: "+getDiameter());
		System.out.println("Circumference: "+getCircumference());
		System.out.println("Area: "+getArea());
	}
	
}
