/* 
 *File name: GameStats.java
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

/**
 *Keeps track of the statistics for the game. 
 *
 * @author Zachary Schleder
 *
 */
public class GameStats
{
	
	
	private int numberGames=0;
	private int bestGame_20=0;
	private int bestGame_50=0;
	
	
	public GameStats(int bestGame_20,int bestGame_50, Integer numberGames)
	{
		this.bestGame_20=bestGame_20;
		this.bestGame_50=bestGame_50;
		this.numberGames=numberGames;
	}
	
	/**
	 * getter for the best game
	 * with 20 end range
	 * @return bestGame_20
	 */
	public int getbestGame_20()
	{
		return bestGame_20;
	}
	/**
	 * getter for the best game
	 * with 50 end range
	 * @return bestGame_50
	 */
	public int getbestGame_50()
	{
		return bestGame_50;
	}
	/**
	 * getter for the number of games played
	 * @return numberGames
	 */
	public int getnumberGames()
	{
		return numberGames;
	}
	/**
	 * increments the number of games played. 
	 */
	public void numberGamesPlayed(int numberGames)
	{
		this.numberGames=numberGames;
	}
	/**
	 * Accepts the number of guesses to reach mystery number & end range.
	 * determines if the number of guesses is better than the previous one within the range.
	 */
	public int determineBestGame()
	{
		return 0;
	}
	/**
	 * displays how many games were played & the best number of guesses
	 */
	public void displayGameStats()
	{
		System.out.println("You have played "+getnumberGames()+" games.");
		System.out.println("Your best game using the 1-20 range is. "+bestGame_20);
		System.out.println("Your best game using the 1-50 range is. "+bestGame_50);
	}
	
	
	
	
}
