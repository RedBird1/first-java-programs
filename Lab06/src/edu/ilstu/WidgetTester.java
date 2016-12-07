/* 
 *File name: WidgetTester.java
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
 *Widget tester. This is a driver class for the widget producer class. 
 *It holds the widget producer objects that can produce widget at a different rate.  
 *
 * @author Zachary Schleder
 *
 */
public class WidgetTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int numberofwidgets=100;
		
		WidgetProducer order342= new WidgetProducer(10); 
		WidgetProducer order343= new WidgetProducer(50);
		WidgetProducer order344= new WidgetProducer(100);
		
	
		
		//Returns calculations days for] 100 widgets produced at different productivity rates (widgPerHour)
		System.out.println(numberofwidgets+" widgets produced at "+order342.getwidgetsPerHour()+" per hour will take "+order342.calculateDaysProduce(numberofwidgets)+" days.");
		System.out.println(numberofwidgets+" widgets produced at "+order343.getwidgetsPerHour()+" per hour will take "+order343.calculateDaysProduce(numberofwidgets)+" days.");
		System.out.println(numberofwidgets+" widgets produced at "+order344.getwidgetsPerHour()+" per hour will take "+order344.calculateDaysProduce(numberofwidgets)+" days.");
	
	}

}
