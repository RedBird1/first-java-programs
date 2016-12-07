/* 
 *File name: TimeCalculator.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 10, 2014
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
 *This is a calculator, 
 *Converts a number of seconds into
 *the maximum number of hours, minutes, and remaining seconds 
 *
 * @author Zachary Schleder
 *
 */
public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Constants
		final int SECONDSINHOUR = 3600;
		final int SECONDSINMINTUE = 60;
		
		//Prompt user
		System.out.print("Enter number of seconds:");
				
		//Receive input
		Scanner keyboard = new Scanner(System.in);
		int secondsInput= keyboard.nextInt();
				
		//Calculation	
		int hourTotal = secondsInput/SECONDSINHOUR;
		int minuteTotal = (secondsInput%SECONDSINHOUR)/SECONDSINMINTUE;
		int secondTotal = secondsInput%SECONDSINMINTUE;
				
		//Return Hours, Minutes, Seconds to user		
		System.out.println("Hours: "+hourTotal);
		System.out.println("Minutes: "+minuteTotal);
		System.out.println("Seconds:"+secondTotal);
		
		keyboard.close();
				
				
	}

}
