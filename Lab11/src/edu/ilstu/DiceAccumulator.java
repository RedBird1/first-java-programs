/* 
 *File name: DiceAccumulator.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 29, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;


/**
 *methods that will increment the number of each double by one. 
 *Getters to return the data pertaining to how many doubles are rolled
 *in the desired number of rolls. 
 *
 * @author Zachary Schleder
 *
 */
public class DiceAccumulator
{
	private int snakeEyes=0;
	private int twos=0;
	private int threes=0;
	private int fours=0;
	private int fives=0;
	private int sixes=0;
	
	/**
	 * Increments the number of snakeeyes by one
	 */
	public void addSnakeEyes()
	{
		snakeEyes++;
	}
	/**
	 * Increments the number of twos by one
	 */
	public void addTwos()
	{
		twos++;
	}
	/**
	 * Increments the number of threes by one
	 */
	public void addThrees()
	{
		threes++;
	}
	/**
	 * Increments the number of fours by one
	 */
	public void addFours()
	{
		fours++;
	}
	/**
	 * Increments the number of fives by one
	 */
	public void addFives()
	{
		fives++;
	}
	/**
	 * Increments the number of sixes by one
	 */
	public void addSixes()
	{
		sixes++;
	}
	/**
	 * 
	 * @return snakeEyes
	 */
	public int getSnakeEyes()
	{
		return snakeEyes;
	}
	/**
	 * 
	 * @return twos
	 */
	public int getTwos()
	{
		return twos;
	}
	/**
	 * 
	 * @return threes
	 */
	public int getThrees()
	{
		return threes;
	}
	/**
	 * 
	 * @return fours
	 */
	public int getFours()
	{
		return fours;
	}
	/**
	 * 
	 * @return fives
	 */
	public int getFives()
	{
		return fives;
	}
	/**
	 * 
	 * @return sixes
	 */
	public int getSixes()
	{
		return sixes;
	}
	
	
}
