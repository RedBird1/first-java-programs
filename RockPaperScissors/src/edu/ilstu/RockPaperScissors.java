/* 
 *File name: RockPaperScissors.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Sep 10, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *<insert clas description here>
 *
 * @author Zachary Schleder
 *
 */

import java.util.Random;

import javax.swing.JOptionPane;
public class RockPaperScissors
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
		String input;
		int uchoice;
		int cmpchoice;
		
		//Prompts user for input
		input = JOptionPane.showInputDialog("What will it be? Rock, Paper or Scissors\n" +"1 for Rock, 2 for Paper, 3 for Scissors");
		//JOptionPane.showMessageDialog(null, "Hello World!!");
		uchoice = Integer.parseInt(input);
		
		
		
	
		JOptionPane.showInputDialog(null,"Paper beats rock you lose");
			


		
		
		//Generates a random number
		Random rnd = new Random();
		int x = rnd.nextInt(3);
		System.out.println(x);
		
		
		

	}

}
