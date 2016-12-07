/*
 * Filename:
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

/**
 * Tests the Truck class
 *
 * @author cjholbr
 *
 */
public class TruckTester
{
	public static void main(String[] args)
	{
		//Call the default constructor
		Truck truck1 = new Truck();
		truck1.printTruckInfo();
		
		//Call constructor with 1 argument
		Truck truck2 = new Truck(6);
		truck2.printTruckInfo();
		
		//Call constructor with 2 arguments
		Truck truck3 = new Truck(6, "Ford");
		truck3.printTruckInfo();
		
		//Call constructor with 3 arguments
		Truck truck4 = new Truck(6, "Ford", 1000);
		truck4.printTruckInfo();
		
		//Call constructor with 4 arguments
		Truck truck5 = new Truck(6, "Ford", 1000, 13000);
		truck5.printTruckInfo();
	}

}
