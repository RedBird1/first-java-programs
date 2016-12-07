/* 
 *File name: OddIntegers.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 20, 2014
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
 *This class asks the user for the number of the first n positive odd integers. 
 *Then adds these first n positive odd integers. 
 *
 * @author Zachary Schleder
 *
 */
public class OddIntegers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int numnumbers=0;
		int oddnumber=1;
		int total=0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of integers to add");
		numnumbers=keyboard.nextInt();
		
		//initiates i as 1. Runs the loop adding the odd number to the running total
		//then increases the odd number by 2 to get the next odd number.
		//Then the counter is incremented unit it is equal to the number of desired numbers. 
				for (int i=1; i<= numnumbers; i++)
				{
				
					total+=oddnumber;
					oddnumber+=2;
					
					
				}
		
		System.out.println(total);
		
	}

}
