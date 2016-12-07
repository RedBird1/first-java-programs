/* 
 *File name: BankDriver.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 5, 2014
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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This main method checks to see if the file is availiable. Creates a scanner
 * to receive the input. Uses loop to go through the file. Creates the
 * BankAccount object With the first three lines for the customers information.
 * then it loops through the remaining lines determining if the value is a
 * deposit or withdrawl.
 *
 * @author Zachary Schleder
 *
 */
public class BankDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Write text to file
		// PrintWriter outputFile = new PrintWriter("StudentData.txt");

		// opens the file
		File file_input = new File("Transactions.txt");
		File file_output = new File("output.txt");
		Scanner input = null;
		PrintWriter pw = null;

		BankAccount BankAccount1 = null;
		String accountNumber = null;
		String firstName = null;
		String lastName = null;
		Double balance = null;
		Double deposit = null;
		Double withdraw = null;

		// read the file
		try
		{
			input = new Scanner(file_input);

			
			
			// read the first four lines that will always be.
			// AccountNumber,FirstName, LastName, and Balance
			accountNumber = input.nextLine();
			firstName = input.nextLine();
			lastName = input.nextLine();
			balance = input.nextDouble();

			// Create the BankAccount object from the first four lines.
			BankAccount1 = new BankAccount(accountNumber, firstName,
					lastName, (double)balance);
			
			
			while (input.hasNext())
			{
				int code = input.nextInt();
				if (code == 1)
				{
					withdraw = input.nextDouble();
					BankAccount1.processWithdrawal(withdraw);

				}

				else if (code == 2)
				{
					deposit = input.nextDouble();
					BankAccount1.processDeposit(deposit);
				}

			}
			
		}
		
		
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");

		}
		//close the input file
		input.close();

		

		try
		{
			pw = new PrintWriter("output.txt");
			pw.print(BankAccount1.toString());
		}

		catch (IOException e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	}

}
