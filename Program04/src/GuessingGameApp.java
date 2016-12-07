import java.util.Scanner;

/*
 * File name: GameStats.java
 *
 * Programmer: Pat Matsuda
 * ULID: mpmatsu
 *
 * Date: Sep 10, 2014
 *
 * Class: IT 168
 * Lecture Section: 1, 10, 13
 * Lecture Instructor: Patricia Matsuda
 * Lab Section: 2,3,11,12,14,15
 * LabInstructor: Nasiba Al-Rawi, Aayush Agrawal, Karl Bissereth, 
 * 					Swarup Deonepudi
 */

/**
 * GuessingGameApp contains run method that controls the menu option that the
 * user selects, then starts the correct action according to input
 * Also contains methods 
 * -display instructions
 * -get choice
 * -updategamestats
 * -and saygoodby
 * The main at the bottom will hold the GuessingGameApp object that will use the run() method
 * to play the game. 
 *
 * @author Holbrook, Matsuda
 *
 */
public class GuessingGameApp
{
	private GuessingGame game;
	private GameStats stats;
	private Scanner keyboard;

	/**
	 * loops to display the menu option to user after each play through. input
	 * of 1 will play the defualt game with default range of 20. input of 2 will
	 * allow user to toggle the end range. input of 3 will display the game
	 * stats to the user. input of 4 will end the game and the prompting menu
	 * loop.
	 * 
	 */
	public void run()
	{
		game = new GuessingGame();
		// stats = new GameStats(0, 0, null);
		keyboard = new Scanner(System.in);

		int choice = 0;
		int endRange = 20;
		int numberGuesses = 0;

		displayInstructions();

		// while loop to display menu and user options after every play
		while (choice == 0)
		{
			// Menu options for user.
			System.out.println("\nGuessing Game Menu");
			System.out.println("\n1. Pay a Game" + "\n2. Change Number Range"
					+ "\n3. Statistics for Session" + "\n4. Quit");

			System.out.print("\nPlease enter your choice: ");
			choice = keyboard.nextInt();

			// Counter for number of games played
			// z++ after every playGame()
			int z = 1;
			while (choice >= 1 && choice <= 4)
			{
				// User input 1, play the game.
				if (choice == 1)
				{

					System.out.println("\nLet's play. I've chosen my number.");
					System.out.println("It's a whole number from 1 to "
							+ endRange);

					game.playGame(keyboard, endRange);

					z++;
					choice = 0;

				}
				// User input 2, adjust the endpoint
				if (choice == 2)
				{
					System.out
							.print("Would you like to change the range to 1-50?\n"
									+ "Enter '1' for 50 '2' for 20: ");
					int rangeOption = keyboard.nextInt();

					// validates the change to 50
					if (rangeOption == 1)
					{
						endRange = 50;
						System.out.print("The range has been changed to 50");
						game.playGame(keyboard, endRange);
						z++;
					}
					else
					{
						System.out.println("Invalid input"
								+ "\nthe game will use default 1-20 range");
						game.playGame(keyboard, 20);
						z++;

					}
					choice = 0;

				}
				// User input 3, display the game stats
				if (choice == 3)
				{
					stats.displayGameStats();
					choice = 0;
				}
				// User input 4, Quit the game.
				if (choice == 4)
				{
					displayGoodbye();
					// will make loop quit.
					choice = 5;

				}

				// if(endRange)
				// updateGameStats(z, endRange);
			}

		}

	}

	/**
	 * Method that displays the instructions to the user.
	 */
	private void displayInstructions()
	{
		// display instructions to the user
		System.out
				.print("on the following screen you will find a menu with three choices\n\t"
						+ "The first choice will ne to play the game.\n"
						+ "The second choice will be to change the game's end range.\n\t\t"
						+ "It can either be 1-20(the default) or 1-50\n\t"
						+ "The third choice will be to display your statistics for the session\n\t"
						+ "The fourth choice will be to quit the game.");
		// Menu for how to play the game
		System.out
				.println("PLaying the game: \n\t"
						+ "You will try to guess the number the computer has chosen.\n\t"
						+ "After each guess, if you haven't guessed the number,\n"
						+ "you will be given a hint of cold, warm, or hot.");
	}

	/**
	 * Returns the choice value
	 * 
	 * @param choice
	 * @return
	 */
	private int getChoice(int choice)
	{
		return choice;

	}

	/**
	 * update game stats method that receives the number of guess and end range
	 * 
	 * @param numberGuesses
	 * @param endRange
	 */
	private void updateGameStats(int numberGuesses, int endRange)
	{

	}

	/**
	 * Displays goodbye message, used in option number 4 of the menu.
	 */
	private void displayGoodbye()
	{
		System.out
				.println("\nThanks for playing the IT 168 Guessing game. Game over.");
	}

	public static void main(String[] args)
	{
		//application object
		GuessingGameApp application = new GuessingGameApp();

		application.run();
	}
}
