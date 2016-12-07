/* 
 *File name: Triangle.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 21, 2014
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
 *This class draws a triangle with a maximum point of what ever number the user inputs. 
 *it will start with 1 astrik increase by one until the max is met. Then will dec by 1.
 *In turn this will return a triangle. 
 *
 * @author Zachary Schleder
 *
 */
public class Triangle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int trisize=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the size of the tringle");
		trisize=keyboard.nextInt();
		
		
		//creates the number rows for the triangle climbing to the max
		for (int row=1; row<=trisize; row++)
		{
			
			
			//loops to create the columns for the number in each row climbing to max
			for (int col=1; col<=row; col++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();			
			
			
			
		}
		
		//creates the number of rows (after the max point and returning back to 1. 
		for (int row=trisize-1; row>0; row--)
		{
			
			
			//loops to create the number of columns in each row climbing down to the min. 
			for (int col=row; col>0; col--)
			{
				System.out.print("*");
				
			}
			
			System.out.println();			
			
			
			
		}
		
		
		

	}

}
