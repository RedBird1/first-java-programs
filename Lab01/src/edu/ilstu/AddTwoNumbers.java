/* 
 *File name: HelloWorld.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Aug 20, 2014
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
 * Adds two numbers read from the keyboard.
 *
 * @author Zachary Schleder
 *
 */
public class AddTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Hello");
        System.out.println("I will add two numbers for you.");
        System.out.print("Enter two whole numbers on the same line with a space in between: ");
        
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        
        System.out.print("The sum of those two numbers is ");
        System.out.println(num1 + num2);
        
    }
}
