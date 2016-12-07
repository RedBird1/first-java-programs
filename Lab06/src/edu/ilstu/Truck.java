/* 
 *File name: Truck.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 30, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *
 *
 * @author Zachary Schleder
 * Truck class. Contains special constructors for each of the four traits of the truck
 * These traits are cylinders, manufacturer, load, and tow. 
 * There is a special constructor for each of the arguments for the user input.
 * Print Statement to return the traits. 
 * Getters/Setters for each variable.
 * 
 *
 */
public class Truck
{

	private int cylinders;
	private String manufacturer= "None";
	private double load;
	private double tow;
	
	
	/**
	 * 1st special constructor
	 * brings in the value for the cylinders
	 */
	public Truck(int cylinders)
	{
		this.cylinders=cylinders; 
	}
	/**
	 * 2nd special constructor
	 * brings in value for (cylinders and manufacturer)
	 */
	public Truck(int cylinders, String manufacturer)
	{
		this.cylinders=cylinders; 
		this.manufacturer=manufacturer;
	}
	/**
	 * 3rdspecial constructor
	 * brings in the value for (cylinders, manufacturer, and load)
	 */
	public Truck(int cylinders, String manufacturer, double load)
	{
		this.cylinders=cylinders; 
		this.manufacturer=manufacturer;
		this.load=load;
	}
	/**
	 * 4th special constructor
	 * brings in the value for (cylinders, manufacturer, load, tow)
	 */
	public Truck(int cylinders, String manufacturer, double load, double tow)
	{
		this.cylinders=cylinders; 
		this.manufacturer=manufacturer;
		this.load=load;
		this.tow=tow;
	}
	
	/**
	 * Default constructor for the truck class
	 */
	public Truck()
	{
		
	}
	
	/**
	 * Print statement, returns the values for each trucks trait
	 * Theses traits are assigned to variables by the special constructors. 
	 */
	public void printTruckInfo()
	{
		System.out.println("cylinders = "+cylinders);
		System.out.println("manufacturer = "+manufacturer);
		System.out.println("load = "+load);
		System.out.println("tow = "+tow);
		System.out.println("");
		

	}
	/**
	 * Return cylinder variable
	 * @return cylinders
	 */
	public int getCylinders()
	{
		return cylinders;
	}
	/**
	 * Set cylinder integer
	 */
	public void setCylinders(int cylinders)
	{
		this.cylinders=cylinders;
	}
	/**
	 * Return the manufacturer String
	 * @return manufacturer
	 */
	public String getManufacturer()
	{
		return manufacturer;
	}
	/**
	 * Set the manufacturer String
	 */
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer=manufacturer;
	}
	/**
	 * Returns Load double variable
	 * @return load
	 */
	public double getLoad()
	{
		return load;
	}
	/**
	 * Set Load double variable
	 */
	public void setLoad(double load)
	{
		this.load=load;
	}
	/**
	 * Returns load double variable
	 * @return tow
	 */
	public double getTow()
	{
		return tow;
	}
	/**
	 * Set the Tow double variable
	 */
	public void setTow(double tow)
	{
		this.tow=tow;
	}
}
