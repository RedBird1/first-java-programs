/* 
 *File name: SailBoatDriver.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 6, 2014
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
 * This is the driver for the SailBoatRental and AddressBook classes
 * contains 2 objects for the address book one for the customer and one for the shop.
 * 1 object for the rental. Receives customer input for the addressbook class and the sailboatrental. 
 * 
 *
 * @author Zachary Schleder
 *
 */
public class SailBoatDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
		//Variables to store the customer input
		String firstname=null;
		String lastname=null;
		String middlename=null;
		String streetaddress=null;
		int numsailboats=0;
		int numdays=0;
		String startdate=null;
		
		
		
		//Scanner object used to store customer input 
		Scanner keyboard = new Scanner (System.in);
		
		//sets the custsomer name from the input 
		System.out.println("Please enter customer information");
		System.out.print("Enter firstname: ");
		firstname=keyboard.nextLine();
		System.out.print("Enter lastname: ");
		lastname=keyboard.nextLine();
		
		//objects of the address book class and sail boat rental
		AddressBook contactNum1 = new AddressBook();
		AddressBook sailboatStore = new AddressBook();
		SailBoatRental rentalNum1 = new SailBoatRental(numdays, numsailboats, startdate);
		
		//receives and sets the customer information
		contactNum1.setfirstName(firstname);
		contactNum1.setlastName(lastname);
		contactNum1.readCustomerInfo(keyboard);
		
		
		//Data that will determine the price of their rental
		System.out.print("Enter start date in the form mm/dd/ccyy: ");
		rentalNum1.setrentalDate(keyboard.nextLine());
		System.out.print("Enter number of sailboats: ");
		rentalNum1.setnumBoats(keyboard.nextInt());
		System.out.print("Enternumber of days: ");
		rentalNum1.setrentalDays(keyboard.nextInt());
		
		
		//display contact info for the customer
		contactNum1.displayContactInfo();
		//display receipt with calculations of amounts
		rentalNum1.displayRecepit();
		//say good bye statement
		rentalNum1.displayGoodbye();
		//display the contact info for the store.
		sailboatStore.displayContactInfo();
		

	}
}
