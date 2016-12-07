/* 
 *File name: WidgetProducer.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 24, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *The widget producer class, primary method. Calculates days to produce.
 *The class can also get widgets per hour. 
 *The widget producers pass the widgetPerHour variable
 *
 * @author Zachary Schleder
 *
 */
public class WidgetProducer
{

	private final int HOURS_PER_DAY=16;
	private double widgetsPerHour;
	
	/**
	 *Constructor for the widget producer 
	 * @param widgetsPerHour
	 */
	public WidgetProducer(double widgetsPerHour)
	{
		this.widgetsPerHour=widgetsPerHour;
	}
	/**
	 * Getter for the widgets per hour
	 * @return widgetsPerHour
	 */
	public double getwidgetsPerHour()
	{
		return widgetsPerHour;
	}
	
	
	/**
	 * 
	 * @param numberWidgets
	 * @return daysToProduce
	 */
	public double calculateDaysProduce (int numberWidgets)
	{
		
		double daysToProduce =(numberWidgets)/(widgetsPerHour*HOURS_PER_DAY);
		return daysToProduce;

	}	
}
