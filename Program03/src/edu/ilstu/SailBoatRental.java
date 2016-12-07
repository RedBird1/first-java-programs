/* 
 *File name: SailBoatRental.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 6, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *SailBoatRental class. Determines the price dependent on the date. 
 *method to take the determined price times the number of boats to calculate the rental total.
 *decides if discount should be applied if the rental period is longer than 7 days. 
 *Then calculates the rental total minus the discount and then adds the deposit. 
 *returns the recipt to the customer. 
 *
 * @author Zachary Schleder
 *
 */
public class SailBoatRental
{

	/**
	 * Variables for the SailBoat Class
	 */
	
	private final double DISCOUNT = .15;
	private final double DEPOSIT = 75.00;
	private final double SPRING = 150.00;
	private final double SUMMER = 250.00;
	private final double FALL = 170.00;
	private final double WINTER = 125.00;
	
	private int rentalDays = 0;
	private int numBoats = 0;
	private String rentalDate = "09";
	
	/**
	 * Special Constructor for the SailBoatRental Class
	 * 
	 * @param RentalDays
	 * @param NumBoats
	 * @param RentalDate
	 */
	public SailBoatRental(int rentalDays, int numBoats, String rentalDate)
	{
		this.rentalDays=rentalDays;
		this.numBoats=numBoats;
		this.rentalDate=rentalDate;
		
	}
	
	/**
	 * set RentalDays variable
	 */
	public void setrentalDays(int rentalDays)
	{
		this.rentalDays=rentalDays;
	}
	
	/**
	 * get RentalDays
	 * @return Rental Days
	 */
	public int getrentalDays()
	{
		return rentalDays;
	}
	
	/**
	 * set NumBoats variable
	 */
	public void setnumBoats(int numBoats)
	{
		this.numBoats=numBoats;
	}
	
	/**
	 * get NumBoats
	 * @return NumBoats
	 */
	public int getnumBoats()
	{
		return numBoats;
	}
	
	/**
	 * set RentalDate variable
	 */
	public void setrentalDate(String rentalDate)
	{
		this.rentalDate=rentalDate;
	}
	
	/**
	 * get RentalDate
	 * @return RentalDate
	 */
	public String getrentalDate()
	{
		return rentalDate;
	}
	
	/**
	 * Get DISCOUNT constant
	 * @return DISCOUNT
	 */
	
	public double getDISCOUNT()
	{
		return DISCOUNT;
	}
	
	/**
	 * Get SPRING constant
	 * @return SPRING
	 */
	public double getSPRING()
	{
		return SPRING;
	}
	
	/**
	 * Get SUMMER constant
	 * @return SUMMER
	 */
	public double getSUMMER()
	{
		return SUMMER;
	}
	
	/**
	 * Get FALL constant
	 * @return FALL
	 */
	public double getFALL()
	{
		return FALL;
	}
	
	/**
	 * Get WINTER constant
	 * @return WINTER
	 */
	public double getWINTER()
	{
		return WINTER;
	}
	
	/**
	 * compares the substring of the month entered by the user. then compare to the corosponfing month
	 * then determines the price pertaining to the season.
	 * @return price
	 */
	public double determinePrice()
	{
		String month=rentalDate.substring(0,2);
		double price=0;
		
		switch(month)
		{
		case "12":
			price=WINTER;
		case "01":
			price=WINTER;
		case "02":
			price=WINTER;
		case "03":
			price=SPRING;
		case "04":
			price=SPRING;
		case "05":
			price=SPRING;
		case "06":
			price=SUMMER;
		case "07":
			price=SUMMER;
		case "08":
			price=SUMMER;
		case"09":
			price=FALL;
		case"10":
			price=FALL;
		case"11":
			price=FALL;
			
		}
		
		return price; 

			
	
	}
	
	/**
	 * determines if there us a discount to apply. if the number of days is great 
	 * then seven return the discount
	 * @return
	 */
	
	public double determineDiscount()
	{
		if (rentalDays>7)
		{
			return DISCOUNT;
		}
		
		return 0;
		
	}
	
	/**
	 * calculates the deposit according to the number of boats. 
	 * @return
	 */
	
	public double calculateDeposit()
	{
		return DEPOSIT*numBoats;
	}
	
	
	/**
	 * takes the determined price times the number of boats
	 * @return
	 */
	public double calculateSailboatCost()
	{
		return determinePrice()*numBoats;
	}
	/**
	 * finds the discount of the rental price
	 * @return
	 */
	public double calculateDiscount()
	{
		return determineDiscount()*determinePrice();
	}
	/**
	 * subtracts discount from the cost of the sail boat to determine the total cost. 
	 * @return
	 */
	public double calculateTotal()
	{
		return ((calculateSailboatCost())-(determineDiscount()*calculateSailboatCost()))+calculateDeposit();
	}
	/**
	 * display the receipt and calculations with two decimal points to the user
	 */
	public void displayRecepit()
	{
		System.out.printf("\nRental Cost:\t$%.2f",+calculateSailboatCost());
		System.out.printf("\nDiscount: \t$%.2f",+calculateDiscount());
		System.out.printf("\nDeposit: \t$%.2f",+calculateDeposit());
		System.out.printf("\nTotal: \t\t$%.2f",+calculateTotal());

	}
	/**
	 * goodbye message sent to the user. 
	 */
	public void displayGoodbye()
	{
		System.out.println("\n\nThank you for renting from us!");
	}
	
}
