 /*File name: GeographicAreaTester.java
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
 * this class asks the user to enter a number 1-3. the switch determines
 * what color to return for the corresponding number.
 * if an invalid number is input. Then the default will return that the input is invalid. 
 *
 * @author 
 *
 */
public class SwitchErrors
{

	public static void main(String[] args)
	{
		int number;
		
		 Scanner keyboard = new Scanner(System.in);
		 
		 //Display options to user and get input.
		 System.out.println("Key:  1=blue, 2=red, 3=green");
		 System.out.print("Enter a number and I'll return ");
		 System.out.print(" the corresponding color.  ");
		 
		 number = keyboard.nextInt();
		 
		 //determine what color to return for the 1-3 number. 
		 switch(number)
		 {
			 case 1:
				 System.out.println("You chose blue!");
				 break;
			 case 2:
				 System.out.println("You chose red!");
				 break;
			 case 3:
				 System.out.println("You chose green!");
		     default:
		    	 System.out.println("Color not available!");
		    	 break;
		 }
	}

}
