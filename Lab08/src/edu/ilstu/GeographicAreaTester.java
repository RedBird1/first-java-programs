/* 
 *File name: GeographicAreaTester.java
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
 *This is the geographic location tester. The class contains the GeographicArealookup object. 
 *this main prompts the user to input the zip code.
 *then the determine geographic will return the corresponding area regarding the leading digit in the zip. 
 *
 * @author Zachary Schleder
 *
 */
public class GeographicAreaTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		String zipcode=null;
		
		//implement scanner object
		Scanner keyboard = new Scanner(System.in);
		//create a new object for geoarealookup class
		GeographicArealookup Location1 = new GeographicArealookup();
		
		
		System.out.print("Please enter the Zip Code: ");
		zipcode=keyboard.nextLine();
		
		System.out.println("The Geographic location is the "+Location1.determineAreaByZip(zipcode.substring(0,1))); 

	}

	

}
