/* 
 *File name: Pizza.java
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
 *
 *
 * @author Zachary Schleder
 *
 */
public class PizzaOrder
{
	//Constants for the % charge for the sales tax carry out charge, and pizza price per unit. 
	private final double SALESTAX=.025;
	private final double CARRYOUT=.1;
	private final double CHEESE= 2.40;
	private final double SAUSAGE=3.00;
	private final double PEPPERONI=3.00;
	private final double VEGETARIAN=3.00;
	//variables that hold the price of ea specific pizza type
	private double cheesePizzaCout;
	private double sausagePizzaCount;
	private double pepperoniPizzaCount;
	private double vegetarianPizzaCount;
	
	public Pizza()
	{
		
	}
	
	public PizzaOrder(double cheeseCount,double sausageCount, double pepperoniCount, double vegetarianCount)
	{
		cheesePizzaCout= cheeseCount;
		sausagePizzaCount= sausageCount;
		pepperoniPizzaCount= pepperoniCount;
		vegetarianPizzaCount= vegetarianCount;
	}
	
	
	
	
}	