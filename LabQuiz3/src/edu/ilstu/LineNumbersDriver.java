/* 
 *File name: LineNumbersDriver.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 12, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This Driver takes data line by line from one file.
 * Then appends this data to a different file. While inserting line numbers.
 *
 * @author Zachary Schleder
 *
 */
public class LineNumbersDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Defines the names of the files.
		String inputFilename = "Movies.txt";
		String outputfilename = "Movies with line Numbers.txt";

		// Creates the File objects.
		File inFile = new File(inputFilename);
		File outFile = new File(outputfilename);

		// input and output objects. 
		// File Output Stream is used to append the file.
		Scanner input = null;
		PrintWriter output = null;
		FileOutputStream outStream = null;

		// Try catch to open the file for input.
		try
		{
			input = new Scanner(inFile);

			// Counter to number each line.
			int i = 1;
			while (input.hasNextLine())
			{
				String lineVariable = input.nextLine();

				// Try Catch to open file for output.
				try
				{
					// Output Stream to append the lineVariable to the other
					// file.
					outStream = new FileOutputStream(outFile, true);
					output = new PrintWriter(outStream);
					// prints to output file data read by the loop.
					output.println(i + " " + lineVariable);

				}
				catch (IOException e)
				{
					System.out.print("Error: " + e.getMessage());
					System.exit(1);
				}
				// Closes the ouput File.
				output.close();
				// i++ to increment the number at the beginning of each line.
				i++;
			}

		}
		catch (FileNotFoundException e)
		{
			System.out.print("Error: " + e.getMessage());
			System.exit(1);
		}
		// Closes the input File.
		input.close();

	}

}
