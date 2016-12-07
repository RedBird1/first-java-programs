import java.io.File;
import java.util.Scanner;

/* 
 *File name: ReadFilePractice.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 13, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 * <insert clas description here>
 *
 * @author Zachary Schleder
 *
 */
public class ReadFilePractice
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
		
		
		try{
		input = new Scanner(new File("Numbers.txt"));
	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}
