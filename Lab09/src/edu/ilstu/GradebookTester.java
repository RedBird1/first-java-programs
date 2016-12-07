/*
 *  Filename:  GradebookTester.java
 *  
 *  Programmer: Cathy Holbrook
 *  ULID:  cjholbr
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

/**
 * Tester for the methods in the Gradebook class
 *
 * @author Catherine
 *
 */
public class GradebookTester
{
	public static void main(String[] args)
	{
		/*
		 * A's = 3
		 * B's = 8
		 * C's = 12
		 * D's = 3
		 * F's = 1
		 */
		Gradebook gradebook = new Gradebook(3, 8, 12, 3, 1);
		
		int total = gradebook.totalNumberGrades();
		System.out.println("Total number grades = " + total);
		System.out.println();
		System.out.println("Graph showing number of each grade:");
		System.out.println();
		
		gradebook.drawBarGraph();
		
	}

}
