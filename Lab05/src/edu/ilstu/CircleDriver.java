/* 
 *File name: CircleDriver.java
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

import java.util.Scanner;

/**
 *This is the driver class that drives an object through the functions held in the Circle class
 *
 * @author Zachary Schleder
 *
 */
public class CircleDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		//create Circle object using the default constructor
		
		Circle firstCircle = new Circle();
		
		//Enter the radius of the circle
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("please enter the radius of the circle: ");
		
		//Sets the radius of the circle
		firstCircle.setRadius(keyboard.nextDouble());
		
		
		//Prints the Circle Calculations
		firstCircle.print();
		
		
		
		keyboard.close();
		
		
	}

}
