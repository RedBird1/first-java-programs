/* 
 *File name: DiceSimulationDriver.java
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
 *Driver class for the App. 
 *holds the number of rolls variable. that is then passed into the Accumulator class.
 *All starts the runSimulaton method. 
 *
 * @author Zachary Schleder
 *
 */
public class DiceSimulationDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int numberRolls=10000;
		
		DiceSimulator simulation = new DiceSimulator();
		DiceAccumulator accumulator;
		
		accumulator=simulation.runSimulation(numberRolls);
		
		
		
		
		//Return the stats for the number of doubles. 
		System.out.print("Number of rolls: \t"+numberRolls+
		"\nNumber snake eyes: \t"+accumulator.getSnakeEyes()+
		"\nNumber twoes: \t\t"+accumulator.getTwos()+
		"\nnumber threes: \t\t"+accumulator.getThrees()+
		"\nNumber fours: \t\t"+accumulator.getFours()+
		"\nNumber fives: \t\t"+accumulator.getFives()+
		"\nNumber sixes: \t\t"+accumulator.getSixes());
		
	

	}

}
