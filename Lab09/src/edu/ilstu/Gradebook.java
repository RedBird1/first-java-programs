/* 
 *File name: Gradebook.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 22, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *This is the grade book class. it has variables for the number of each letter grade
 *The constructor beings in the data for number of each grade from the main.
 *Each variable has a getter and setter. There is a method to count the total number of grades
 *Then the drawbargraph method uses a loop to count the number each grade and display to user.
 *
 * @author Zachary Schleder
 *
 */
public class Gradebook
{
	private int numberA=0;
	private int numberB=0;
	private int numberC=0;
	private int numberD=0;
	private int numberF=0;
	
	/**Special Constructor to receive the number of each grade.
	 * @param numberA
	 * @param numberB
	 * @param numberC
	 * @param numberD
	 * @param numberF
	 */
	public Gradebook(int numberA, int numberB, int numberC, int numberD,
			int numberF)
	{
		this.numberA = numberA;
		this.numberB = numberB;
		this.numberC = numberC;
		this.numberD = numberD;
		this.numberF = numberF;
	}

	/**Returns the number of A grades
	 * @return the numberA
	 */
	public int getNumberA()
	{
		return numberA;
	}

	/**Sets the number of A grades
	 * @param numberA the numberA to set
	 */
	public void setNumberA(int numberA)
	{
		this.numberA = numberA;
	}

	/**Returns the number of B grades
	 * @return the numberB
	 */
	public int getNumberB()
	{
		return numberB;
	}

	/**Set the number of B grades
	 * @param numberB the numberB to set
	 */
	public void setNumberB(int numberB)
	{
		this.numberB = numberB;
	}

	/**Returns the number of C grades
	 * @return the numberC
	 */
	public int getNumberC()
	{
		return numberC;
	}

	/**set the number of C grades
	 * @param numberC the numberC to set
	 */
	public void setNumberC(int numberC)
	{
		this.numberC = numberC;
	}

	/**Returns the number of D grades
	 * @return the numberD
	 */
	public int getNumberD()
	{
		return numberD;
	}

	/**Sets the number od D grades
	 * @param numberD the numberD to set
	 */
	public void setNumberD(int numberD)
	{
		this.numberD = numberD;
	}

	/**Returns the number of F grades
	 * @return the numberF
	 */
	public int getNumberF()
	{
		return numberF;
	}

	/**Set the number of F grades
	 * @param numberF the numberF to set
	 */
	public void setNumberF(int numberF)
	{
		this.numberF = numberF;
	}
	/**
	 * Returns the total number of grades A-F
	 * @return
	 */
	public int totalNumberGrades()
	{
		return (numberA+numberB+numberC+numberD+numberF);
	}
	/**
	 * creates a bar graph and uses an astrik to represent the number of each grade.
	 * Does each loop for each letter grade for the number of each grade. 
	 * The number of grade is decremented by one until it reaches 0
	 * then the loops are complete and will display the correct number of *
	 */
	public void drawBarGraph()
	{
		System.out.print("A");
		for (int a= numberA; a > 0; a--)
		{
			System.out.print("*");
		}
		System.out.println(" "+numberA);
		
		System.out.print("B");
		for (int a = numberB; a >0; a--)
		{
			System.out.print("*");
		}
		System.out.println(" "+numberB);
		
		System.out.print("C");
		for (int a = numberC; a >0; a--)
		{
			System.out.print("*");
		}
		System.out.println(" "+numberC);
		
		System.out.print("D");
		for (int a = numberD; a >0; a--)
		{
			System.out.print("*");
		}
		System.out.println(" "+numberD);
		
		System.out.print("F");
		for (int a = numberF; a >0; a--)
		{
			System.out.print("*");
		}
		System.out.println(" "+numberF);
	}
	
	
	
	
}
