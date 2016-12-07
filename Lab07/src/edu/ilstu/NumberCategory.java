/* 
 *File name: NumberCategory.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 1, 2014
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
 *This program ask the user to enter an integer
 *uses control logic to determine if an integer is positive, negative, or 0
 *
 * @author Zachary Schleder
 *
 */
public class NumberCategory
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int number=0;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter an interger: ");
		number= keyboard.nextInt();
		
		
		//logic for determining if pos neg or 0
		//checks both sides of number line. if neither apply then number is 0
		if (number > 0)
		{
			System.out.println("The number is positive");
		}
		
			
		else 
			if (number < 0)
		{
			System.out.println("The number is negative");
		}

		else
		{
			System.out.println("the number is 0");
		}

	}

}
