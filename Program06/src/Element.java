/* 
 *File name: Element.java
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
 *Class for the element object.
 *The element class holds element data.
 *the fields for the element data are-
 *chemical name.
 *atomic number.
 *symbol.
 *boiling point.
 *density.
 *molecular/atomic weight.
 *toString to return the element information.
 *
 * @author Zachary Schleder
 *
 */
public class Element
{
	private String chemicalName=null;
	private String symbol=null;
	private double atomicNumber;
	private double boilingPoint;
	private double meltingPoint;
	private double density;
	private double atomicWeight;
	
	
	
	/**
	 * Element Constructor. Accepts an array that is a line of data from the 
	 * PeriodicTableData.csv this line is split in the main to the passed array.
	 * The element trait variables are then set to creat the element objec.
	 * @param elementArray
	 */
	public Element(String[] elementArray)
	{
		//loads values from the element array to create the object.
		chemicalName=elementArray[0];
		atomicNumber=Double.parseDouble(elementArray[1]);
		symbol=elementArray[2];
		boilingPoint=Double.parseDouble(elementArray[3]);
		meltingPoint=Double.parseDouble(elementArray[4]);
		density=Double.parseDouble(elementArray[5]);
		atomicWeight=Double.parseDouble(elementArray[6]);
	}




	/**
	 * @return the chemicalName
	 */
	public String getChemicalName()
	{
		return chemicalName;
	}




	/**
	 * @param chemicalName the chemicalName to set
	 */
	public void setChemicalName(String chemicalName)
	{
		this.chemicalName = chemicalName;
	}




	/**
	 * @return the atomicNumber
	 */
	public double getAtomicNumber()
	{
		return atomicNumber;
	}




	/**
	 * @param atomicNumber the atomicNumber to set
	 */
	public void setAtomicNumber(double atomicNumber)
	{
		this.atomicNumber = atomicNumber;
	}




	/**
	 * @return the symbol
	 */
	public String getSymbol()
	{
		return symbol;
	}




	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}




	/**
	 * @return the boilingPoint
	 */
	public double getBoilingPoint()
	{
		return boilingPoint;
	}




	/**
	 * @param boilingPoint the boilingPoint to set
	 */
	public void setBoilingPoint(double boilingPoint)
	{
		this.boilingPoint = boilingPoint;
	}




	/**
	 * @return the meltingPoint
	 */
	public double getMeltingPoint()
	{
		return meltingPoint;
	}




	/**
	 * @param meltingPoint the meltingPoint to set
	 */
	public void setMeltingPoint(double meltingPoint)
	{
		this.meltingPoint = meltingPoint;
	}




	/**
	 * @return the density
	 */
	public double getDensity()
	{
		return density;
	}




	/**
	 * @param density the density to set
	 */
	public void setDensity(double density)
	{
		this.density = density;
	}




	/**
	 * @return the atomicWeight
	 */
	public double getAtomicWeight()
	{
		return atomicWeight;
	}




	/**
	 * @param atomicWeight the atomicWeight to set
	 */
	public void setAtomicWeight(double atomicWeight)
	{
		this.atomicWeight = atomicWeight;
	}


	/**
	 * @return String that displays all of the element information for the element calling this method.
	 */
	public String toString()
	{
		return "\nElement information: \n"+"\nElement name: "+chemicalName
				+"\nSymbol: "+symbol
				+"\nAtomic Number: "+atomicNumber
				+"\nBoiling Point: "+boilingPoint+" Kelvin"
				+"\nMelting Point: "+meltingPoint+" Kelvin"
				+"\nDensity: "+density+" g/L"
				+"\nMolecular Weight: "+atomicWeight+" g/mole\n";
	}
	
	
	
}
