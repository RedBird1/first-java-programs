import java.io.File;
import java.util.Scanner;

/* 
 *File name: PeriodicTableApp.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 27, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 * This application class will display a looped menu utilizing different cases
 * for options The options are. 1- Display Element Information 2- Display
 * Particle Information 3-Get element with the highest boiling point. 4- Get the
 * element with the lowest melting point. 5- Molecular mass Calculations. 6-
 * Quit. Will quit the looped menu.
 * 
 * 
 * @author Zachary Schleder
 *
 */
public class PeriodicTableApp {

	public static void main(String[] args) {

		// Runs at start of program to create the array of element objects.
		PeriodicTable periodicTable = new PeriodicTable();
		// Reads the file to get the database information into the array of
		// element objects
		periodicTable.readFile("PeriodicTableData.csv");

		// prompt user with the initial option menu.
		System.out.println("Periodic Table Menu\n");
		System.out.println("1 - Display Element information");
		System.out.println("2 - Display particle information (# of protons, electrons, neutrons)");
		System.out.println("3 - Get element with the highest boiling point");
		System.out.println("4 - Get element with the lowest melting points");
		System.out.println("5 - Molecular mass calculations");
		System.out.println("6 - Quit");
		System.out.print("\nPlease enter your choice: ");

		int userChoice = 0; // variable for menu choice.

		// keyboard scanner.
		Scanner keyboard = new Scanner(System.in);
		// Receive menu choice.
		userChoice = keyboard.nextInt();

		// Menu loop.
		while (userChoice != 6) {
			switch (userChoice) {
			case 1:// Display the element information
				System.out.print("Enter symbol for element: ");
				String symbol = keyboard.next();
				periodicTable.findElement(symbol);

				break;

			case 2:// Display the partical information
				System.out.print("Enter symbol for element: ");
				String symbol1 = keyboard.next();
				periodicTable.displayParticleInformation(symbol1);
				break;

			case 3:// get the element with the highest boiling point.
				System.out.println("\nElement with highest boiling point\n"
						+ periodicTable.findHighestBoilingPoint().toString());
				break;

			case 4:// get the element with the lowest melting point.
				System.out.println("\nElement with the lowest melting points\n"
						+ periodicTable.findLowestMeltingPoint().toString()
						+ "\n");
				break;

			case 5:// Display the molecular mass calculations.

				File inFile = new File("MolecularWeightInput.txt");// Open File
				Scanner input = null;// Declare Scanner.
				// Check to open file.
				try {
					input = new Scanner(inFile);// Scan File.
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
					System.exit(1);
				} 

				int i = 0;
				// Loop to read file.
				while (input.hasNextLine()) {
					// scans line by line.
					String compoundSubstanceLine = input.nextLine();

					// delimiter that separates input data
					String delimiter = " ";
					// Load delimited line into Array.
					String[] compoundSubstanceArray = compoundSubstanceLine
							.split(delimiter);
					// replaces all 1s in the compound substance with
					// " "(Space).
					compoundSubstanceLine = compoundSubstanceLine.replaceAll(
							"1", " ");

					compoundSubstanceLine = compoundSubstanceLine.replaceAll(
							"\\s", "");
					System.out.print(compoundSubstanceLine + "=");
					// pass the read array into calculation
					// Print calculated molar mass.
					System.out
							.println(periodicTable
									.calculateMolarMassOfCompoundSubstance(compoundSubstanceArray));

				}
				System.out.println();
				break;

			default:// Displays if the user choice in not valid.
				System.out.print("Invalid menu choice. Try again.\n");

			}
			// Looped menu.
			System.out.println("Periodic Table Menu\n");

			System.out.println("1 - Display Element information");
			System.out
					.println("2 - Display particle information (# of protons, electrons, neutrons)");
			System.out
					.println("3 - Get element with the highest boiling point");
			System.out
					.println("4 - Get element with the lowest melting points");
			System.out.println("5 - Molecular mass calculations");
			System.out.println("6 - Quit");
			System.out.print("\nPlease enter your choice: ");

			// menu choice.
			userChoice = keyboard.nextInt();
		}

	}

}
