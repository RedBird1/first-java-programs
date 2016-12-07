/* 
 *File name: RoomCarpet.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 27, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *1 field - RoomDimension Object
 *1 field - Cost
 *-Method to return total cost - (Sq. foot X cost)
 *
 *
 * @author Zachary Schleder
 *
 */
public class RoomCarpet
{
		RoomDimension dimensions;
		private double carpetPricePerSqFoot=0;
		
	/**
	 * Brings the dimensions object into class for use of methods.
	 * Also receives carpet price data 	
	 * @param dimensions
	 * @param carpetPricePerSqFoot
	 */
	public RoomCarpet(RoomDimension dimensions, double carpetPricePerSqFoot)
	{
			this.dimensions=dimensions;
			this.carpetPricePerSqFoot=carpetPricePerSqFoot;
			
	}
	/**
	 * Calculates the total cost of the carpet
	 * Uses the dimensions object to bring in the calculate area method.
	 * Multiplies the Area by the price input. 	
	 * 
	 * @return (Area*Price)
	 */
	public double calculateTotalCost()
	{
		return dimensions.calculateArea()*carpetPricePerSqFoot;
	}

	/**
	 * 
	 * toString method to return the price of the the carpet per square foot.
	 * return the total cost of the carpet
	 * 
	 * @return String
	 */
	public String toString()
	{
		return String.format("At a price of $%.2f",+carpetPricePerSqFoot+
				" the total cost will be $%.2f ",calculateTotalCost()) ;
	}
	
	
}
