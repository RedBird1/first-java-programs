/* 
 *File name: Book.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 21, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *This Class is used to set the number of books sold (Harry Potter, Life of Pi)
 *This class also implements methods that calculate.
 *
 * @author Zachary Schleder
 *
 */
public class Book
{
	//Instance variables for Book class
	private final double SALESTAX = .075;
	private String bookTitle;
	private double bookPrice;
	private double costofSale;
	
	/**
	 *
	 */
	public Book()
	{
		
	}
	/**
	 * This is the default constructor for the book class. It holds a string (title) and 
	 */
	public Book(String bkTitle, double bkPrice)
	{
		bookTitle=bkTitle;
		bookPrice=bkPrice;
	}
	/**
	 * This method will return the title of the object passing through the Book class. 
	 * 
	 * @retun bookTitle
	 */
	public String getBookTitle()
	{
		return bookTitle;
	}
	/**
	 * This method will calculate the price of a single unit
	 * 
	 * @return  price of the book object.
	 * 
	 */
	public Double getBookPrice()
	{
		return bookPrice;
	}
	/**
	 * This method will calculate the price of a single unit
	 * 
	 * @return cost of a single sale of book
	 * 
	 */
	public double calculateSaleCost(double unitsSold)
	{
		costofSale=(bookPrice*SALESTAX)+bookPrice;
		return costofSale;
	}
	/**
	 * This will calculate the price of the Book after the user inputs the amount of the price increase
	 * 
	 * @return 
	 */
	public double getIncreasePrice(double percent)
	{
		return (costofSale*percent)+costofSale; 
	}
	
	
}
