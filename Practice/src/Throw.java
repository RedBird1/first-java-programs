/* 
 *File name: Throw.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 23, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 *Practice class for exception/error handling
 *Throw an error/exception
 * @author Zachary Schleder
 *
 */
public class Throw
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int num1 = 5; 
		
		try
		{
			if( num1<10)
			
				throw new Exception("number is less than 10");
			System.out.println("No problem here");
			
		
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		System.out.println("Goodbye");
	}

}
