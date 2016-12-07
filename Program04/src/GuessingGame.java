/* 
 *File name: GuessingGame.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 26, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
import java.util.Random;
import java.util.Scanner;

/**
 * In this class are methods that control the game. -Ask user for guesses. -Set
 * up range of numbers to guess. -Evaluate how close the guess is to the mystery
 * number.
 *
 *
 * @author Zachary Schleder
 *
 */
public class GuessingGame
{

	private final double HOTRANGE_10 = .10;
	private final double WARMRANGE_20 = .20;

	private int rangeEnd = 20;
	private int mysteryNumber = 0;

	public GuessingGame()
	{

	}

	/**
	 * default constructor to set rangeEnd
	 * 
	 * @param rangeEnd
	 */
	public GuessingGame(int rangeEnd)
	{
		this.rangeEnd = rangeEnd;
	}

	/**
	 * Gets the rangeEnd variable
	 * 
	 * @return rangeEnd
	 */
	public int getrangeEnd()
	{
		return rangeEnd;
	}

	/**
	 * accepts scanner object. and rangeEnd integer -Generate Random number
	 * between one and rangEnd limit -Loop to prompt user for guess until
	 * mysteryNumber is found. -Count number of turns. Count how many loops are
	 * done.
	 * 
	 * @param Scanner
	 */
	public void playGame(Scanner keyboard, int rangeEnd)
	{
		this.rangeEnd = rangeEnd;
		// creates the random number from random class
		Random rand = new Random();
		mysteryNumber = rand.nextInt(rangeEnd) + 1;
		// object for GameStats Class
		//GameStats stats = new GameStats();

		// Counter for how many times loop is completed.
		if (rangeEnd == 20)
		{

			int i = 1;
			for (int guess = 0; guess != mysteryNumber; i++)
			{

				// asks user to enter number until it is vali
				guess = makeGuess(keyboard);

				// Compares guess to the mystery number
				if (guess != mysteryNumber)
				{
					evaluateGuess(guess);
					System.out.println("Try again.");
				}
				else
				{
					System.out.println("You guessed the number!!!!!");
					System.out.println("It took you " + i
							+ " tries to guess the mystery number");

				}
				
			}
		}
		else if(rangeEnd==50)
		{
			int i = 1;
			for (int guess = 0; guess != mysteryNumber; i++)
			{

				// asks user to enter number until it is vali
				guess = makeGuess(keyboard);

				// Compares guess to the mystery number
				if (guess != mysteryNumber)
				{
					evaluateGuess(guess);
					System.out.println("Try again.");
				}
				else
				{
					System.out.println("You guessed the number!!!!!");
					System.out.println("It took you " + i
							+ " tries to guess the mystery number");

				}
			}
			
			
		}

	}

	/**
	 * Accepts scanner object. -Asks user to enter a guess. -Guess is within the
	 * valid range.
	 * 
	 * @return
	 * 
	 */
	public int makeGuess(Scanner keyboard)
	{

		System.out.println("\nGuess a number between 1 and " + rangeEnd);
		int guess = keyboard.nextInt();

		while (guess < 1 || guess > rangeEnd)
		{
			System.out.println("Enter a valid number.");
			guess = keyboard.nextInt();

		}
		if (guess >= 1 && guess <= rangeEnd)
		{
			return guess;
		}

		return 0;

	}

	/**
	 * Accepts number entered as a guess. -if within 10% range display hot. -if
	 * within 20% range display warm. -if within 25% range display cold. -if
	 * number is exact display "You guessed the number!"
	 */

	public void evaluateGuess(int guess)
	{
		if (guess <= mysteryNumber + (mysteryNumber * HOTRANGE_10)
				&& guess >= mysteryNumber - (mysteryNumber * HOTRANGE_10))
		{
			System.out.println("Hot");
		}
		if (guess <= mysteryNumber + (mysteryNumber * WARMRANGE_20)
				&& guess >= mysteryNumber - (mysteryNumber * WARMRANGE_20))
		{
			System.out.println("Warm");
		}
		else
		{
			System.out.println("Cold");
		}
	}

}
