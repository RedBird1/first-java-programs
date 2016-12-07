/*
 *  File name:  GasMeterTester.java
 *
 *  Programmer:  Cathy Holbrook
 *  ULID:  cjholbr
 *
 *  Date:  Oct 20, 2014
 *
 *  Class:  IT 168
 *  Lecture Section:  04
 *  Lecture Instructor:  Holbrook
 *  Lab Section:
 *  Lab Instructor:
 */


/**
 * Tester method for the gas meter class
 *
 * @author Holbrook
 *
 */
public class GasMeterTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		GasMeter meter = new GasMeter("12345-12345", "123 Main St", "Normal", 200);
		
		System.out.println("Cost for account: " + meter.getAccountNumber());
		System.out.println("Service at: " + meter.getStreetAddress() + ", " + meter.getCity());
		
		/*
		 * Test for bill paid early 
		 */
		System.out.println("\nCost of gas paid early - 27th to end of month");
		double cost = meter.calculateCost(27);
		System.out.printf("Total if early:  $%.2f", cost);
		
		/*
		 * Test for bill paid on time 
		 */
		System.out.println("\n\nCost of gas paid on time - 9th - 25th");
		cost = meter.calculateCost(10);
		System.out.printf("Total if paid on time:  $%.2f", cost);
		
		/*
		 * Test for bill paid late
		 */
		System.out.println("\n\nCost of gas paid late - 1st - 8th");
		cost = meter.calculateCost(2);
		System.out.printf("Total if paid late:  $%.2f", cost);
		
	}

}
