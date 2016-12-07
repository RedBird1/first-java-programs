/* 
 *File name: ChangeMaker.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 8, 2014
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
 *This class is for a vending machine that only accepts a single dollar bill. 
 *The price of the item must be 25-100 cents in increments of five. 
 *It will be validated that the user input a proper price. 
 *Then the change will be computed as number of quarters dimes and nickels. 
 * @author Zachary Schleder
 *
 */
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Keyboard object
		Scanner keyboard = new Scanner(System.in);

		// Constant for accepting a single dollar bill
		final int DOLLAR = 100;
		// var for cost, and number coins
		int cost = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int originalCost;
		boolean valid = true;

		System.out.println("Item price must be 25 cents to a dollar, in 5-cent increments.");
		System.out.print("Enter item price: ");

		cost = keyboard.nextInt();
		
		//Validate user input is between the 25-100 range
		if (cost < 25)
		{

			valid = false;
			System.out.println("Cost is invalid - must "
					+ "be at least 25 cents");

		}

		else if (cost > 100)
		{
			valid = false;
			System.out.println("Cost is invalid - must "
					+ "be less than 100 cents");

		}
		//validate if divisible by 5
		if (cost % 5 != 0)
		{
			valid = false;
			System.out.println("Cost is invalid - must "
					+ "be evenly divisible by 5");
		}

		//Algorithm to compute the change
		if (valid)
		{

			originalCost = cost;

			cost = DOLLAR - cost;

			quarter = cost / 25;
			cost = cost % 25;
			dime = cost / 10;
			cost = cost % 10;
			nickel = cost / 5;
			
			System.out.println("\nYou baught an item for "+originalCost+" cents"+" and gave me a dollar");
			System.out.println("Your change is:");
			
			//determines to return the output as plural or not, depending on the number of coins
			if (quarter != 0)
			{

				if (quarter == 1)
				{
					System.out.println(quarter + " quarter");

				}

				else
				{
					System.out.println(quarter + " quarters");
				}

			}
			
			if (dime !=0)
			{
				if (dime== 1)
				{
					System.out.println(dime+" dime");
				}
				
				else
				{
					System.out.println(dime+" dimes");
				}
			}
			
			if (nickel !=0)
			{
				if (nickel ==1)
				{
					System.out.println(nickel+" nickel");
				}
				
				else 
				{
					System.out.println(nickel+" nickels");
				}
			}

		}
	}

}
