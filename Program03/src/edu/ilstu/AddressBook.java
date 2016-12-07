/* 
 *File name: AddressBook.java
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
 *receives the customer input from the driver. format the address if there is fist name format for cusomer 
 *otherwise format for sailboat shop also format the phone number in th(999)999-9999 form. 
 *display the contact info to the customer. 
 *
 * @author Zachary Schleder
 *
 */
public class AddressBook
{

	/**
	 *Variables for the AdressBook class
	 */
	//variables to hold the customers name
	private String firstName=null;
	private String middleName=null;
	private String lastName=null;
	
	//Contact information for the customer.
	private String streetAddress=null;
	private String town=null;
	private String stateCode=null;
	private String zipCode=null;
	private String phoneNumber=null;
	
	/**
	 * default constructor
	 */
	public AddressBook()
	{
		
	}
	/**
	 * special constructor for the address book class
	 */
	public AddressBook(String firstname, String middlename, String lastname)
	{
		
	}
	/**
	 * set the first name variable
	 */
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	/**
	 * set the middle name variable
	 */
	public void setmiddleName(String middleName)
	{
		this.middleName=middleName;
	}
	/**
	 * sets the last name variable
	 */
	public void setlastName(String lastName)
	{
		this.lastName=lastName;
	}
	/**
	 * get the first name
	 * @lastName
	 */
	public String getfirstName()
	{
		return firstName;
	}
	/**
	 * get the middle name
	 * @middleName
	 */
	public String getmiddleName()
	{
		return middleName;
	}
	/**
	 * get the last name
	 * @lasName
	 */
	public String getlastName()
	{
		return lastName;
	}
	
	/**
	 * reads the customer info for the contact information
	 */
	public void readCustomerInfo(Scanner keyboard)
	{
		System.out.print("Enter street address: ");
		streetAddress=keyboard.nextLine();
		System.out.print("Enter the city: ");
		town=keyboard.nextLine();
		System.out.print("Enter the state postal code: ");
		stateCode=keyboard.nextLine();
		System.out.print("Enter the zip code: ");
		zipCode=keyboard.nextLine();
		System.out.print("Enter the phone numer as 999999999: ");
		phoneNumber=keyboard.nextLine();
	}
	/**
	 * if the first name variable is null, then print out the mailing label for silver beach rentals
	 * else return the mailing label for the customer.
	 */
	public void formatMailingLable()
	{
		if (firstName==null)
		{
			System.out.println("\nSilver Beach Rentals");
			System.out.println("239 E. Hwy 98");
			System.out.println("Destin, FL 32540");
		}
		else
		{
			System.out.println("\nCustomer: ");
			System.out.println(firstName+""+lastName);
			System.out.println(streetAddress);
			System.out.println(town+" "+stateCode+" "+zipCode);
			formatPhone();
			
		}
	}
	/**
	 * formats the nine digit phone number with parentheses and a dish before the last four numbers
	 */
	public void formatPhone()
	{
		System.out.println("("+phoneNumber.substring(0, 3)+")"+phoneNumber.substring(3, 6)+"-"+phoneNumber.substring(6,10));
	}
	
	/**
	 * Displays the contact info back to the customer as formatted in the 
	 * formatmailinglable method
	 */
	public void displayContactInfo()
	{
		formatMailingLable();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
