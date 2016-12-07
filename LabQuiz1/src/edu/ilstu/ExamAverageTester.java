/* 
 *File name: ExamAverageTester.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 24, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *<insert clas description here>
 *
 * @author Zachary Schleder
 *
 */
public class ExamAverageTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int examone=80;
		int examtwo=90;
		int examthree=100;
		double avg=0;
		
		ExamAverageCalculator midTerm = new ExamAverageCalculator();
		
		avg=midTerm.calculateExamAverage(examone,examtwo,examthree);
		System.out.printf("the avg is %.2f", avg);
		
		
		
	}

}
