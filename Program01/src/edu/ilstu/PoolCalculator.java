/* 
 *File name: PoolCalculator.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 5, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *This is  a calculator to determine dimensions of a square pool. 
 *Perimeter/Volume/Gallonsofwater
 *
 * @author Zachary Schleder
 *
 */

import java.util.Scanner;

public class PoolCalculator
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{	
		
		//Constant for amount of water in a cubic foot.
		final double CUBICFTWATER  = 7.48;
		
		//Scanner function for variables.
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt and store user input. dimension variables = length, width, avg. depth.
		System.out.print("Enter the length of the pool(in feet):");
		int length = keyboard.nextInt();
		System.out.print("Enter the width of the pool(in feet:");
		int width = keyboard.nextInt();
		System.out.print("Enter the average depth of the pool(in feet):");
		int averageDepth = keyboard.nextInt(); 
		
		//Calculated dimensions to be returned to the user. Holds formulas. 
		int perimeter = 2*(length + width);
		int volume = length * width * averageDepth;
		double gallons = volume * CUBICFTWATER;
		int undergroundSurfaceArea = (2*(length + width))* averageDepth + (length*width);
	
		//Display dimensions to the user. 
		System.out.println("Perimeter="+perimeter);
		System.out.println("Volume="+volume);
		System.out.println("Gallons="+gallons);
		System.out.println("Underground surface area="+undergroundSurfaceArea);
		
		
		keyboard.close();

	}

}
