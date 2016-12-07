/*
 * Filename:ArithmeticExpressions.java
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
 * Write and test arithmetic expressions
 *
 * @author Zach Schleder
 * 
 * Declaring constants, variables, and typing arithmetic expressions.
 *
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Constant declaration
		final int FREEZING = 32;
		
		// Variable declarations and initializations
		double height = 9.0;
		double base1 = 5.0;
		double base2 = 10.0; 
		int fahrenheit = 78;
		int expected = 89; 
		int observed = 78;
		
		double area;
		double celsius;
		double percentageofdifference;
		
		// Problem 17
		
		area=(double)height/2*(base1+base2);
		
		System.out.println("The area is:"+area);
		
		// Problem 18
		 
		celsius=(double)5/9*(fahrenheit-FREEZING);
		
		System.out.println("The temp is:"+celsius);
		
		// Problem 19
		
		percentageofdifference=((double)(expected-observed)/expected)*100;
		
		System.out.println("The percentage difference is:"+percentageofdifference);
		
	
		
		
	}

}
