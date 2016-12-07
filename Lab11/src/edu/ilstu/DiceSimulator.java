/* 
 *File name: DiceSimulator.java
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
 *Simulates the dice roll the desired number of times.
 *And then passes data to the accumulator for how many doubles 
 *are rolled. 
 *
 * @author Zachary Schleder
 *
 */
public class DiceSimulator
{

	public DiceAccumulator runSimulation(int numberRolls)
	{
		//Creates the instance of the DiceAccumulator class
		DiceAccumulator accumulator = new DiceAccumulator();
		
		//Creates our two die objects that will be manipulated.
		Die die1 = new Die();
		Die die2 = new Die();

		//Loop to generate dice rolls until the desired'numberRolls' variable. 
		for (int i = 0; i < numberRolls; i++)
		{
			// Rolling the dice
			die1.roll();
			die2.roll();

			//if the the spots cariable in each die object is equal then the following conditions
			//will be evaluated. the accumulator keeps the data on jumber of doubles for each 
			//outcome.
			if (die1.equals(die2))
			{
				
				if (die1.getSpots() == 1)
				{
					 accumulator.addSnakeEyes();
				}

				else if (die1.getSpots() == 2)
				{
					 accumulator.addTwos();
				}

				else if (die1.getSpots() == 3)
				{
					 accumulator.addThrees();
				}

				else if (die1.getSpots() == 4)
				{
					 accumulator.addFours();
				}

				else if (die1.getSpots() == 5)
				{
					 accumulator.addFives();
				}

				else if (die1.getSpots() == 6)
				{
					 accumulator.addSixes();
				}
			
			}
			
		}
		return accumulator;
	}
}
