/* 
 *File name: PizzaOrderDriver.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 23, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
import java.util.Scanner;
/**
 *This is the driver program for the PizzaOrder class. 
 *This class will receive user input regarding how many slices that they wish to purchase
 *It will then set and pass the user input through the PizzaOrder class.
 *Return an order summary displaying the calculation that were performed. 
 *Finally a receipt will be displayed to the user 
 *
 * @author Zachary Schleder
 *
 */


public class PizzaOrderDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Sets up the order object
		PizzaOrder order1 = new PizzaOrder();
		
		//Sets up the program to receive user input.
		Scanner keyboard = new Scanner (System.in);
		
		
		//Declaration of the variables that will hold the users input regarding # of slices		
		int numberofcheese;
		int numberofsausage;
		int numberofpepperoni;
		int numberofvegetarian;
		double billtotal;
		
		//Display the menu to the User
		System.out.println("\t  Pizza Shop Menu");
		System.out.println("Cheese...\t\t\t$2.40");
		System.out.println("Sausage...\t\t\t$3.00");
		System.out.println("Pepperoni...\t\t\t$3.00");
		System.out.println("Vegetarian...\t\t\t$3.50");

		
		//Asking the user for the number of slices for each kind of slice. 
		System.out.print("\nPlease enter the number of cheese slices: ");
		numberofcheese=keyboard.nextInt();
		
		System.out.print("Please enter the number of sausage slices: ");
		numberofsausage=keyboard.nextInt();
		
		System.out.print("Please enter the number of pepperoni slices: ");
		numberofpepperoni=keyboard.nextInt();
		
		System.out.print("Please enter the number of vegetarian slices: ");
		numberofvegetarian=keyboard.nextInt();
		
		
		//Methods that set user input in the PizzaOrder class.
		order1.setcheesePizzaCount(numberofcheese);
		order1.setsausagePizzaCount(numberofsausage);
		order1.setpepperoniPizzaCount(numberofpepperoni);
		order1.setvegetarianPizzaCount(numberofvegetarian);
		
		//Gives the variable bill total the calculation to reach the total
		billtotal=(order1.calculateCarryOutCharge())+(order1.calculateSalesTax())+(order1.calculatePizzaOrderCost());
		
		
		//Return the number of slices summary to the user. 
		System.out.println("\n\n\tPizza Shop Order Summary");
		System.out.println("\n\t\t\t\tPizza Slices Ordered");
		System.out.println("Cheese...\t\t\t\t"+numberofcheese);
		System.out.println("Sausage...\t\t\t\t"+numberofsausage);
		System.out.println("Pepperoni...\t\t\t\t"+numberofpepperoni);
		System.out.println("Vegitarian...\t\t\t\t"+numberofvegetarian);
		
		
		//Return the summarized bill to the user. The printf %6.2f rounds to two decimal places
		System.out.printf("\nSub-total:\t$%.2f",order1.calculatePizzaOrderCost());
		System.out.printf("\nTax:\t\t$%.2f",order1.calculateSalesTax());
		System.out.printf("\nCarry-out:\t$%.2f",order1.calculateCarryOutCharge());
		System.out.printf("\nTotal Bill:\t$%.2f",billtotal);
		

		keyboard.close();
	}

}
