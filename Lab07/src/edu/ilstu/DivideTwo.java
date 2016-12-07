/*
 * Filename:
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;
import java.util.Scanner;

/**
 * This Program divides two numbers for user input, and if the denominator is 0,
 * It will say that the division by zero is not allowed. 
 * When denominator is a whole number it will calculate the division.
 *
 * @author Zach Schleder
 *
 */
public class DivideTwo
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numerator = 0;
		int denominator = 0;
		double quotient = 0;
		
		//Display prompt message to the user, receive the numerator 
		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator:  ");
		numerator = keyboard.nextInt();
		
		//prompt for then receive denominator
		System.out.print("Enter the denominator:  ");
		denominator = keyboard.nextInt();
		
		//Determines if denominator is zero, if so calculation cannot be done.
		//if valid will divid the numbers. 
		if (denominator == 0){

			System.out.print("division by Zero is not allowed!");
		}
		
		else{
			
			quotient = (double) numerator / denominator;
			System.out.println(numerator + "/" + denominator + " = " + quotient);
		}
			
		
		keyboard.close();
	}

}
