/* 
 *File name: PersonDriver.java
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
 *creates person objects
 *then checks if names are the same.
 *checks if age  is same.
 *
 * @author Zachary Schleder
 *
 */
public class PersonDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Person person1= new Person("Sue","Smith",32);
		Person person2= new Person("George","Smith",44);

		//if statement for checking if name is the same.
		if(person1.equals(person2)){
		
			System.out.print(person1.toString()+"and");
			System.out.println(person2.toString());
			System.out.print("\thave the same name\n");
		}
		else
		{
			System.out.print(person1.toString()+"and");
			System.out.println(person2.toString());
			System.out.println("\thave different names");
		}
		//if statement camparing age
		if (person1.getAge()==person2.getAge())
		{
			System.out.print(person1.toString());
			System.out.println(person2.toString());
			System.out.println("\tare the same age");
		}
		else if(person1.getAge()>person2.getAge())
		{
			System.out.print(person1.toString());
			System.out.println(person2.toString());
			
		}
		
		else  
		{
			System.out.print(person1.toString());
			System.out.println(person2.toString()+"\n\tis younger");
			
		}

	}

}
