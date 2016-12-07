/* 
 *File name: Arrayloop.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 11, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 *<insert clas description here>
 *
 * @author Zachary Schleder
 *
 */
public class Arrayloop
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] scores = {2,24,25,31,45};
		
		for ( int i = 0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		//calculate the average 
		int sum = 0;
		for (int i=0; i<scores.length; i++)
		{
			sum += scores[i];//sum = sum + scores.
		}
		
		System.out.println("average: "+(double)sum/scores.length);
		
		//Find the highest value.
		int highestValue = scores[0];
		for (int i=1; i<scores.length; i++)
		{
			if(scores[i]>highestValue)
			{
				highestValue=scores[i];
			}
		}
		
		//Find the lowest value.
		int lowestValue = scores[0];
		for (int i=1; scores.length; i++)
		{
			if(scores[i]>lowestValue)
			{
				lowestValue=scores[i];
			}
		}
		
	}

}
