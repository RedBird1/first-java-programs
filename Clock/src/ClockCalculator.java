/* 
 *File name: ClockCalculator.java
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

/**
 *<insert clas description here>
 *
 * @author Zachary Schleder
 *
 */

import java.util.Scanner;

public class ClockCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Prompt user
		System.out.println("Enter number of seconds");
		
		//Receive input
		Scanner keyboard = new Scanner(System.in);
		int secondsInput= keyboard.nextInt();
		
		//Formula Variables
		
		int hourTotal = secondsInput/3600;
		int minuteTotal = (secondsInput%3600)/60;
		int secondTotal = secondsInput%60;
		
		
		System.out.println(hourTotal);
		System.out.println(minuteTotal);
		System.out.println(secondTotal);
		
		
		
		
	

	}

}
