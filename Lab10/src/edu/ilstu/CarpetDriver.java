/* 
 *File name: CarpetDriver.java
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

import java.util.Scanner;

/**
 *Driver class for the RoomDimension and RoomCarpet Classes. 
 *Prompt user for length, width, price input.
 *Creates the RoomDemesion object to send length and width.
 *Creates the RoomCarpet object to receive the dimensions object.
 *Methods can be used in RoomCarpet class. RoomCarpet also receives price input.
 *Returns the toString methods to display variables and calculation results.
 *
 *
 *
 * @author Zachary Schleder
 *
 */
public class CarpetDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Variables for Length Width, and Price.
		double length=0;
		double width=0;
		double price=0;
		
		
		//Prompt and receive data from the user. 
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("please enter the length of the Room: ");
		length=keyboard.nextDouble();
		System.out.print("Please enter the width of the Room: ");
		width=keyboard.nextDouble();
		System.out.print("please enter the price of the object: ");
		price=keyboard.nextDouble();
		
		//creates the dimensions object from length and width 
		RoomDimension dimensions = new RoomDimension(length,width);
		//creates carpet object from dimensions and price
		RoomCarpet carpet = new RoomCarpet(dimensions, price);
		
		
		//return data and calculation results to the user. 
		System.out.println(dimensions.toString());
		System.out.println(carpet.toString());
		
		
		
	}

}
