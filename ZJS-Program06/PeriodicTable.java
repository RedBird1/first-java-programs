import java.io.File;
import java.util.Scanner;

/* 
 *File name: PeriodicTable.java
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
 * This class will initialize an array of element objects.
 * Contain methods to manipulate the element array.
 * The constructor creates the elementArray.
 * the methods within this class can..
 * Read the input file line by line and use each line to create an element object,
 * Then load the created element object into the elementArray.
 * There is a private method used within the class to search the element Array by the elemental symbol
 * this private method then returns the index of the found element.
 * There are methods to search the element array for the element with the highest boiling and lowest
 * melting points.
 * There is a method to return the element information (toString). This utilizes the findIndex method that
 * find the element that user desires.
 * There is a method that will return the particle information using the same private method to find the index
 * of the element that the user wants. 
 * 
 * Method that calculates the molecular mass of compound
 * substances.
 *
 * @author Zachary Schleder
 *
 */
public class PeriodicTable
{

	private final int ARRAYSIZE = 120;
	private Element[] elementArray = new Element[ARRAYSIZE];
	private int elementCount = 0;

	/**
	 * Constructor for the periodic table that will boild the array with the max array size.
	 */
	public PeriodicTable()
	{
		// Builds Array to hold an array of element objects
		Element[] elementArray = new Element[ARRAYSIZE];// 120, 0-119
	}

	/**
	 * Opens and reads csv database line by line. Creates one element object per
	 * line (Each line in the csv contains all of the traits for single element), Passing the Element object the elementTrait array. The passed
	 * elementTrait array will be used to build the element. Then element
	 * Element object is loaded into the array with i being index.
	 * Then input file is closed.
	 * 
	 * @param fileName
	 */
	public void readFile(String fileName)
	{

		File inFile = new File(fileName);// Opens the input file.
		Scanner input = null;// Declare scanner to read file.

		// Checks to see if file can be opened & scanned.
		try
		{
			input = new Scanner(inFile);// Initialize Scanner.

		}
		catch (Exception e)
		{
			System.out.println("Error" + e.getMessage());
		}
		input.nextLine();// Skips header row.

		int i = 0;// index of ElementArray
		// Loop reads csv line by line while there is a line to read.
		while (input.hasNextLine())
		{
			String elementLine = input.nextLine();// Reads line & store in
													// String elementLine
			String delimiter = ",";// variable for delimiter.
			// split method applied to the elementLine, separated data stored in
			// the elementTrait Array.
			String[] elementTrait = elementLine.split(delimiter);
			// Create Element object and pass the elementTrait Array used to
			// construct object.
			Element element = new Element(elementTrait);
			// Load the new element object into the elementArray.
			elementArray[i] = element;
			// elementCount equals the number of element lines that were read
			// into element objects.
			elementCount = i;
			i++;
		}

		input.close();// Close Scanner

	}

	/**
	 * compares the first element in the ElementArray[] boiling point to the
	 * rest of the element's boiling points of the in the array. if the element
	 * being compared is higher it will be returned. if there is not one higher
	 * the first element will be returned. Uses element count to only search through filled part
	 * of the partially filled array.
	 * 
	 * @return element
	 */
	public Element findHighestBoilingPoint()
	{
		int index = 0;// global method index for the return statement.
		double highestBoilingPoint = elementArray[0].getBoilingPoint();
		for (int i = 1; i < elementCount; i++)
		{
			if (elementArray[i].getBoilingPoint() > highestBoilingPoint)
			{
				highestBoilingPoint = elementArray[i].getBoilingPoint();
				index = i;
			}
		}

		return elementArray[index];

	}

	/**
	 * compares the first element melting point to the rest of the melting
	 * points of elements in the array. if the element being compared is lower
	 * and is not equal to 0 (0 is equal to blanks in the file)
	 * it will be returned. if there is not one lower the first element will be
	 * returned. Uses elementcount to only compare the filled values in the array.
	 * 
	 * @return element
	 */
	public Element findLowestMeltingPoint()
	{
		int index = 0;
		double lowestMeltingPoint = elementArray[0].getMeltingPoint();
		for (int i = 1; i < elementCount; i++)
		{
			if (elementArray[i].getMeltingPoint() < lowestMeltingPoint && elementArray[i].getMeltingPoint()>0)
			{
				lowestMeltingPoint=elementArray[i].getMeltingPoint();
				index=i;
				
			}
			
		}
		return elementArray[index];
	}

	/**
	 * Uses the private method find element index utilizing the symbol passed
	 * in. sets the variable index equal to the index returned by the private
	 * method. Prints info regarding the element with the returned index.
	 * 
	 * @param symbol
	 */
	public void findElement(String symbol)
	{
		// private method that searches by symbol and returns index.
		int Index = findElementIndex(symbol);
		//prints toSting for the element of the index that is found with private method.
		System.out.println(elementArray[Index].toString());

	}

	/**
	 * Uses the private method that searches the element array by symbol. then
	 * returns the particle information for the element in that index.
	 * 
	 * @param symbol
	 */
	public void displayParticleInformation(String symbol)
	{
		// private method that searches by symbol and returns index.
		int index = findElementIndex(symbol);

		// calculation for the number of neutrons.
		//displays the element cin the array that has the index returned by the private method.
		//Math round method to round result.
		double neutrons = Math.round((double)(elementArray[index].getAtomicWeight() - elementArray[index]
				.getAtomicNumber()));
		
		System.out.println("\nParticle information for "+elementArray[index].getChemicalName()
				+"\nNumber of protons: "
				+ elementArray[index].getAtomicNumber()
				+ "\nNumber of electrons: "
				+ elementArray[index].getAtomicNumber()
				+ "\nNumber of neutrons: " + neutrons + "\n");

	}

	/**
	 * this method accepts a string variable that is the symbol entered by the
	 * user the method then uses the symbol to search the array of elements
	 * comparing to the getSymbol method to return the corresponding elements
	 * index.
	 * 
	 * @param symbol
	 * @return 
	 */
	private int findElementIndex(String symbol)
	{
		//index used in return.
		int index = 0;
		for (int i = 0; i <= elementCount - 1; i++)
		{
			//equals method to search array for the element that has the same symbol.
			if (symbol.equalsIgnoreCase(elementArray[i].getSymbol()))
			{
				index=i;
			}

		}
		//return the elements index in the elementArray.
		return index;
	}
	/**
	 * Accepts an array that is read from file and delimited in the driver.
	 * 
	 * 
	 * @param compoundSubstance
	 * @return molarMass
	 */
	public double calculateMolarMassOfCompoundSubstance(String[] compoundSubstance)
	{
		//Molar mass variable. 
		double molarMass = 0;
		//Increments i by 2 to get the symbols and skips over the number of each element.
		//in the compound substance.
		for (int i =0; i < compoundSubstance.length;i=i+2)
		{
			
			//passes the symbol in compound substance i. to find index. 
			//That index is then used to get the atomic number of that element object.
			//Multiplies that atomic number by the how many of that element are in the compound substance.
			double numberElements=Double.parseDouble(compoundSubstance[i+1]);
			int index = findElementIndex(compoundSubstance[i]);
			//running total for the molar mass.
			molarMass = molarMass+elementArray[index].getAtomicWeight()*numberElements;
			
			
		}
		
		
		return molarMass;
	}

}
