/* 
 *File name: BookDriver.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 21, 2014
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
 *This is the driver program for the Book class.
 *This driver will store the life of pi and harry potter variables for the # of copies. 
 *It will ask for the user input, an display the calculated methods of the Book class. 
 *
 * @author Zachary Schleder
 *
 *
 */
public class BookDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
		//implements user input via keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//holds the number of copies from the user input/hold the percent that the user would wish to increase the price by.
		double copiesHarryPot;
		double copiesLifePi;
		double percentHarryPot;
		double percentLifePi;
		
		//Sets up the objects that will pass through the book class
		Book harryPotter = new Book("Harry Potter", 22.00);
		Book lifeOfPi = new Book("Life of Pi", 13.50);
		
		//Asks user for input on copies sold, and saves as variables above
		System.out.print("Enter the number of Harry Potter books sold: ");
		copiesHarryPot= keyboard.nextDouble();
		
		System.out.print("Enter the number of Life of Pi books sold: ");
		copiesLifePi= keyboard.nextDouble();
		
		
		//Calculates the total sales of the specific title
		//HarryPotter
		System.out.println("Total HarryPotter sales: $"+harryPotter.calculateSaleCost(copiesHarryPot));
		//Life of Pi
		System.out.println("Total Life of Pi sales: $"+lifeOfPi.calculateSaleCost(copiesLifePi));
		
		
		//Ask user for a % increase of harry potter price, and assigns to the percentHarryPot variable
		System.out.print("Enter the percent increase for Harry potter as a decimal: ");
		percentHarryPot=keyboard.nextDouble();
		//Gets the sales using Variable for the price percentage increase also passes a percentage used in the method in the Book class to calculate.
		System.out.println("The Total Harry Potter sales with the % increase applied is: "+harryPotter.getIncreasePrice(percentHarryPot)*copiesHarryPot);
		
		//Ask user for a % increase of Life of Pie price, and assigns to the variable
		System.out.print("Enter the percent increse for Life of Pi as a decimal: ");
		percentLifePi=keyboard.nextDouble();
		//Gets the sales using Variable for the price percentage increase also passes a percentage used in the method in the Book class to calculate.
		System.out.println("The total Life of Pi sales with the % increase applied is: "+lifeOfPi.getIncreasePrice(percentLifePi)*copiesLifePi);
			
	
		keyboard.close();
	}	
	
}

	

	
