/* 
 *File name: StringExperiments.java
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

/**
 * This class is used for practice of a variety of string methods. 
 *
 * @author Zachary Schleder
 *
 */
public class StringExperiments
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Name Variables
		String firstName = "Zach";
		String middleName = "James";
		String lastName = "Schleder";
		
		//Print Statements of the string methods 
		System.out.println(firstName+" "+middleName+" "+lastName);
		System.out.println(firstName+" "+middleName.charAt(0)+". "+lastName);
		System.out.println(firstName.toUpperCase()+" "+lastName);
		System.out.println("Length of the last name = "+lastName.length());
		System.out.println(lastName.charAt(lastName.length()/2));
		System.out.println(firstName.charAt(firstName.length()-1));
		System.out.println(lastName.indexOf("c"));
		System.out.println(lastName.charAt(5));
	}

}
