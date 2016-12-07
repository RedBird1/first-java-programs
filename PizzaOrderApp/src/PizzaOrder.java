/* 
 *File name: PizzaOrder.java
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

/**
 *This is the pizza order class
 *it will receive variables from the object in the driver class
 *It will also contain methods to calculate the carryout charge, sales charge, 
 *and the order charge. 
 *
 * @author Zachary Schleder
 *
 */
public class PizzaOrder
{

		//Constants for the % charge for the sales tax carry out charge, and pizza price per unit. 
		private final double SALES_TAX=.025;
		private final double CARRY_OUT=.1;
		private final double CHEESE= 2.40;
		private final double SAUSAGE=3.00;
		private final double PEPPERONI=3.00;
		private final double VEGETARIAN=3.50;
		//variables that hold the price of ea specific pizza type
		private double cheesePizzaCount;
		private double sausagePizzaCount;
		private double pepperoniPizzaCount;
		private double vegetarianPizzaCount;
		
		/**
		 * 	Default constructor for the PizzaOrder class	
		 */
		public PizzaOrder()
		{
			
		}
		
		/**
		 *  This is the special constructor for the PizzaOder class
		 */
		public PizzaOrder(double cheeseCount,double sausageCount, double pepperoniCount, double vegetarianCount)
		{
			cheesePizzaCount = cheeseCount;
			sausagePizzaCount= sausageCount;
			pepperoniPizzaCount= pepperoniCount;
			vegetarianPizzaCount= vegetarianCount;
		}
		
		/**
		 * 		This is the setter for the amount of cheese slices
		 */
		public void setcheesePizzaCount( double cheeseCount)
		{
			cheesePizzaCount = cheeseCount;
		}
		
		/**
		 * This is the setter for the amount of sausage sausage slice
		 */
		public void setsausagePizzaCount( double sausageCount)
		{
			sausagePizzaCount = sausageCount; 
		}
		
		/**
		 * 	This is the setter for the amount pepperoni slice	
		 */
		public void setpepperoniPizzaCount( double pepperoniCount)
		{
			pepperoniPizzaCount = pepperoniCount;
		}
		
		/**
		 * 	This is the setter for the vegetarian slice	
		 */
		public void setvegetarianPizzaCount( double vegetarianCount)
		{
			vegetarianPizzaCount = vegetarianCount;
		}
		
		/**
		 * This method calculates the total cost of the order. Doesn't account for the sales tax or the carry out charge
		 * 	@return	 The sub-total of the bill
		 */
		public double calculatePizzaOrderCost()
		{
			return (vegetarianPizzaCount*VEGETARIAN)+(pepperoniPizzaCount*PEPPERONI)+(sausagePizzaCount*SAUSAGE)+(cheesePizzaCount*CHEESE);
		}
		
		/**
		 * 	This method calculates the total amount of the sales tax to be applied to the sub total. 
		 * @return The total sales tax to be added to the total bill	
		 */
		public double calculateSalesTax()
		{
			return SALES_TAX*calculatePizzaOrderCost();
		}
		
		/**
		 * This method calculates which amount should be added to the total bill as the carry out charge
		 * 	@return the total charge to be added to the bill	
		 */
		public double calculateCarryOutCharge()
		{
			return CARRY_OUT*calculatePizzaOrderCost();
		}
		
		
}
