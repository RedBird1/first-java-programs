/* 
 *File name: RestaurantBillCalculator.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 3, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 * This is a formula to calculate the price of a restaurant bill.
 *
 * @author Zachary Schleder
 *
 */
public class RestaurantBillCalculator{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Constant declaration
		
		final double TIPPERCENTAGE = .15;
		final double TAXRATE = .075;
		
		// Variable declarations and initializations
		
		double mealcost = 45.75;
		
		double tax;
		double tip;
		double totalamount;
		
		//Arithmetic formulas
		
		tax = mealcost*TAXRATE;
		tip = mealcost*TIPPERCENTAGE;
		totalamount = mealcost+tax+tip;
		
		//Print Data
		
		System.out.println("Mealcost:\t"+mealcost);
		System.out.println("Tax:\t"+tax);
		System.out.println("Tip:\t"+tip);
		System.out.println("Total Amount:\t"+totalamount);
	}

}
