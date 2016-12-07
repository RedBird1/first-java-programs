/*
 * File name: CDDriver.java
 * 
 * Programmer: Zach Schleder
 * ULID:zschled@ilstu.edu
 *
 * Date:  11/20/14
 *
 * Class: it 168
 * Lecture Section:
 * Lecture Instructor: Matsuda
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Driver class that generates an array of song objects.
 * Song objects are initialized and fill the entire array size of 50.
 * The Collection.txt file is then used to give song objects
 * values for the title and artist.
 * After the predetermined songs are filled from the file.
 * The user is then prompted with a menu.
 * 
 * Choice 1 allows the user to enter song info with the kb. 
 * This data is then added to the next song in the array.
 * This song is then also added to the collection.txt file.
 *
 * Choice 2 will print the contents of the collection.txt file
 * to the Screen.
 * 
 * Choice 3 will end the loop that contains the choices 1 & 2.
 * 
 *  
 * @author Zach Schleder
 *
 */
public class CDDriver
{

	public static void main(String[] args) throws IOException
	{
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";

		// CDOutput out = new CDOutput();
		// CDInput in = new CDInput();
		Scanner keyboard = new Scanner(System.in);

		int count = 0; // Counter to keep track of number of elements in the
						
		int choice = 0; // Menu choice

		// Create array to hold song collection
		Song[] songArray = new Song[MAX_ARRAY_SIZE];
		// Fill array with empty objects
		for (int i=0;i<songArray.length;i++)
		{
			
			songArray[i]= new Song(null, null);
			
		}
		
		// Read the data from the input file into the array
		// Return the count for the elements currently in the array
		File inputFile = new File(FILENAME);
		Scanner input = null;

		try
		{

			input = new Scanner(inputFile);
			
			

		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			System.exit(1);
		}
		
		while(input.hasNextLine())
		{
			String title=input.nextLine();
			String artist=input.nextLine();
			songArray[count]= new Song(title,artist);
			count++;
		}
		
		
		input.close();
		// Open the file to append (this is the same file used for the input
		
		FileWriter fw = null;
		PrintWriter pw = null;

		try
		{
			fw = new FileWriter(FILENAME, true);
			pw = new PrintWriter(fw);

		}
		catch (Exception e)
		{

			System.out.println("Error " + e.getMessage());
			System.exit(1);

		}
		
		// Print the menu
		System.out.println("CD Menu");
		System.out.println("Enter 1 to add a new CD");
		System.out.println("Enter 2 to display the list");
		System.out.println("Enter 3 to quit");
		System.out.println("Enter choice: ");
		// Read the menu choice
		choice = keyboard.nextInt();
		while (choice != 3)
		{
			switch (choice)
			{
			case 1:
				// Read a new song to add to the collection from the keyboard
				System.out.print("First enter song title: ");
				String title = keyboard.nextLine();
				System.out.print("\nSecond enter the artist name: ");
				String artist = keyboard.nextLine();
				// Add the song to the array
				songArray[count]= new Song(title,artist);
				// Don't forget to increment the count
				count++;
				// Add the song to the file
				pw.println(title);
				pw.println(artist);
				break;
			case 2:
				// Print the list
				for (int i = 0; i < count; i++){
					System.out.println(songArray[i]);
				}
				break;
			default:
				System.out.print("Invalid menu choice.  Please try again.");
			}

			// Print the menu
			System.out.println("CD Menu");
			System.out.println("Enter 1 to add a new CD");
			System.out.println("Enter 2 to display the list");
			System.out.println("Enter 3 to quit");
			System.out.println("Enter choice: ");
			// Read the menu choice
			choice = keyboard.nextInt();
		}

		// Close the output file
		pw.close();
	}


	
}
