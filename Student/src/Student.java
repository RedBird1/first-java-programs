/* 
 *File name: Student.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 25, 2014
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
public class Student
{

	String firstName;
	String lastName;
	String  uId;
	String major;
	
	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.uId=null;
		this.major=null;
	}
	
	public Student(String firstName, String lastName, String uId)
	{
		this.(firstName,lastName);
		this.uId = uId;
	
	}
	
	public Student( String firstName, String lastName, String uId)
	{
		this.(firstName,lastName,uId);
		this.major=major;
		
	}
	
	
	
	
	
}
