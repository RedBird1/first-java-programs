/* 
 *File name: FileInput.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 9, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.io.FileNotFoundException;

/**
 * This class reads a file. Reads .txt file line by line.
 *
 * Method to set the name of the desired file. method to create another file.
 *
 * prints the txt to another text file.
 *
 * @author Zachary Schleder
 *
 */

public class FileInput
{

	public static void main(String[] args)
	{

		// Scanner for user input
		Scanner keyboard = new Scanner(System.in);
		// Initializes and declares the file names.

		// Receives the file name from the user.
		//System.out.println("Enter the filename");
		String inputFile = "Program5Input.txt";//keyboard.next();

		// variables for desired output files.
		String outputFileCom = "xxx_com_List.csv";
		String outputFileOrg = "xxx_org_List.csv";
		String outputFileEdu = "xxx_edu_List.csv";

		// generates connection to the input source.
		File inputfile = new File(inputFile);
		FileInputStream fis = null;

		// Used to scan the file.
		// Scanner input = new Scanner();

		// BufferedInputStream bis = null;
		// DataInputStream dis = null;
		//FileOutputStream fos = null;
		PrintWriter pw = null;
		/**
		 * File Input Stream.
		 */
		try
		{
			Scanner input1 = new Scanner(inputFile);
			// fis = new FileInputStream(inputFile);

			// Here BufferedInputStream is added for fast reading.
			// bis = new BufferedInputStream(fis);
			// dis = new DataInputStream(bis);

			// loop to get input until the end of the file.
			while (input1.hasNext())
			{
				
				// Loop that reads lines in segments of fours
				// Then creates object.
				int i = 0;
				while (i <= 3)
				{

					// this statement reads the line from the file and print it
					// to
					// the console.

					String organizationName = input1.next();
					String state = input1.next();
					String streetAddress = input1.next();
					String url = input1.next();
					String city = input1.next();
					String stateCode = input1.next();
					String zipCode = input1.next();

					Address address1 = new Address(streetAddress, city, state,
							zipCode);
					Organization organization1 = new Organization(
							organizationName, address1, url);
					System.out.println(organizationName);
					System.out.println(state);
					System.out.println(streetAddress);
					System.out.println(url);
					i++;
					input1.close();
				}
			}
		}
		// fis.close();

		// bis.close();
		// dis.close();}

		// dispose all the resources after using them.

		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		/**
		 * File OutputStream.
		 */
		

	}

}
