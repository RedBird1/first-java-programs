/* 
 *File name: Person.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 22, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *Person class
 *Can receive the instance variables 
 *-firstName
 *-lastName
 *-age
 *Hold boolean method checks if the names are equal.
 * @author Zachary Schleder
 *
 */
public class Person
{
	private String firstName=null;
	private String lastName=null;
	private int age=0;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Person(String firstName, String lastName, int age)
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person()
	{
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * 
	 */
	public String toString()
	{
		return "\n\t"+firstName+" "+lastName+", "+age+" years old ";
	}
	/**
	 * Determines if the names are equal.
	 * @param other
	 * @return
	 */
	public boolean equals(Person other)
	{
		
		if (this.firstName.equalsIgnoreCase(other.getFirstName())&& this.lastName.equalsIgnoreCase(other.getLastName()))
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
		
	}
	
	
	
}
