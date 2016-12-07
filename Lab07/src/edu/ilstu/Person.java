/* 
 *File name: Person.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 1, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *This class contains variables for a persons (title, name,gender,marital status)
 *It uses control methods to determine the proper title according to gender.
 *and a switch to validate marital Status
 * @author Zachary Schleder
 *
 */
public class Person
{

	/**
	 * 
	 * variables to hold the user information
	 * 
	 */
	
	private String title=null;
	private String name=null;
	private String gender=null;
	private String maritalStatus;
	
	/**
	 * Constructor for the Person class
	 * @param title
	 * @param name
	 * @param gender
	 * @param maritalStatus
	 */
	
	public void Person(String title, String name, String gender, String maritalStatus)
	{
		this.title=title;
		this.setName(name);
		this.setGender(gender);
		this.maritalStatus=maritalStatus;
	}
	/**
	 * assigns title based on if male or female. then if female use switch
	 * to differentiate between mrs and miss according to martial status
	 */
	public void determineTitle()
	{
		if (gender == "M")
		{
			title="Mr.";
		}
		
		else
			if (gender == "F" && maritalStatus.equals("S"))
			{
				title="Mrs.";
			}
			else
			{
				title="Miss";
			}
		
	}
	/**
	 * This is logic to see if the user input was valid data
	 */
	public boolean isValidGender()
	{
		if (gender.equals("M") || gender.equals("F"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * This is logic to see if the user unput was valid data
	 */
	public boolean isValidMaritalStatus()
	{
		if (maritalStatus.equals("S") || maritalStatus.equals("M"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	
	/**
	 * setter for the title
	 */
	public void setTitle(String title)
	{
		this.title=title;
	}
	/**
	 * @return title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * setter gender
	 */	
	public void setGender(String gender)
	{
		this.gender=gender.toUpperCase();
	}
	/**
	 * @return gender
	 */
	public String getGender()
	{
		return gender;
	}
	/**
	 * set martial status
	 */
	public void setMaritalStatus(String maritalStatus)
	{
		this.maritalStatus=maritalStatus.toUpperCase();
	}
	/**
	 * @return	marital status
	 */
	public String getMaritalStatus()
	{
		return maritalStatus;
	}
	/**
	 * set name
	 */
	public void setName(String name )
	{
		this.name=name;
	}
	/**
	 * @return name
	 */
	public String getName()
	{
		return name;
	}

}
