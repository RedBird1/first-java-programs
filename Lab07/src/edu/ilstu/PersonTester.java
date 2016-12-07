/*
 * Filename:  PersonTester.java
 *
 * Programmer: Cathy Holbrook
 * ULID: cjholbr
 *
 * Date:  
 *
 * Class:  IT 168
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

/**
 * Tests methods in the Person class
 *
 * @author cjholbr
 *
 */
public class PersonTester
{
	public static void main(String[] args) 
	{
		Person malePerson = new Person();
		Person femalePerson = new Person();
		
		/*
		 * Test Case 1:  Single Male, valid data
		 */
		System.out.println("Test case 1 - single male, valid data");
		malePerson.setName("John Doe");
		malePerson.setGender("M");
		malePerson.setMaritalStatus("S");
		if (malePerson.isValidMaritalStatus())
		{
			malePerson.determineTitle();
			System.out.println(malePerson.getTitle() + " " + malePerson.getName());
			System.out.println("Marital statis is valid:  " + malePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital statis is invalid:  " + malePerson.getMaritalStatus());
		}
		if (malePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + malePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + malePerson.getGender());
		}

		
		/*
		 * Test Case 2:  Married Male, valid data
		 */
		System.out.println("\nTest case 2 - married male, valid data");
		malePerson.setMaritalStatus("M");
		if (malePerson.isValidMaritalStatus())
		{
			malePerson.determineTitle();
			System.out.println(malePerson.getTitle() + " " + malePerson.getName());
			System.out.println("Marital statis is valid:  " + malePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital statis is invalid:  " + malePerson.getMaritalStatus());
		}
		if (malePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + malePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + malePerson.getGender());
		}

		
		/*
		 * Test Case 3:  Male, invalid gender
		 */
		System.out.println("\nTest case 3 - male, invalid gender");
		malePerson.setGender("Y");
		if (malePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + malePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + malePerson.getGender());
		}
		
		/*
		 * Test Case 4:  Male, invalid marital status
		 */
		System.out.println("\nTest case 4 - male, invalid marital status");
		malePerson.setMaritalStatus("B");
		if (malePerson.isValidMaritalStatus())
		{
			System.out.println("Marital statis is valid:  " + malePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital statis is invalid:  " + malePerson.getMaritalStatus());
		}	
		
		/*
		 * Test Case 5:  Single Female, valid data
		 */
		System.out.println("\nTest Case 5 - single female, valid data");
		femalePerson.setName("Jane Doe");
		femalePerson.setGender("F");
		femalePerson.setMaritalStatus("S");
		
		if (femalePerson.isValidMaritalStatus())
		{
			femalePerson.determineTitle();
			System.out.println(femalePerson.getTitle() + " " + femalePerson.getName());
			System.out.println("Marital statis is valid:  " + femalePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital statis is invalid:  " + femalePerson.getMaritalStatus());
		}
		if (femalePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + femalePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + femalePerson.getGender());
		}

		
		/*
		 * Test Case 6: Married Female, valid data
		 */
		System.out.println("\nTest Case 6 - Married Female, valid data");
		femalePerson.setMaritalStatus("M");

		if (femalePerson.isValidMaritalStatus())
		{
			femalePerson.determineTitle();
			System.out.println(femalePerson.getTitle() + " " + femalePerson.getName());
			System.out.println("Marital statis is valid:  " + femalePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("\nMarital statis is invalid:  " + femalePerson.getMaritalStatus());
		}
		if (femalePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + femalePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + femalePerson.getGender());
		}

		
		/*
		 * Test Case 7:  Married Female, invalid gender
		 */
		System.out.println("\nTest Case 7 - Married Female, invalid gender");
		femalePerson.setGender("X");
		if (femalePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + femalePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + femalePerson.getGender());
		}
		
		/*
		 * Test Case 8:  Female, invalid marital status
		 */
		System.out.println("\nTest Case 8: - Female, invalid marital status");
		femalePerson.setMaritalStatus("D");
		if (femalePerson.isValidMaritalStatus())
		{
			femalePerson.determineTitle();
			System.out.println(femalePerson.getTitle() + " " + femalePerson.getName());
			System.out.println("Marital statis is valid:  " + femalePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital statis is invalid:  " + femalePerson.getMaritalStatus());
		}
		

	}

}
