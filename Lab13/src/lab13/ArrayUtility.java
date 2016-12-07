/* 
 *File name: ArrayUtility.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 12, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package lab13;

/**
 * This Array utility class contains methods that will be used to manipulate an
 * array of integers.
 *
 * @author Zachary Schleder
 *
 */
public class ArrayUtility
{

	/**
	 * Array method that reads array and compares to see if that value is
	 * greater than 20. If the value if greater than 20. then the count is
	 * incremented. then the percentage of values greater than 20 is calculated.
	 * That percentage is then returned.
	 * 
	 * @param intArray
	 * @return
	 */
	public double findPercentageGreaterThanTwenty(int[] intArray)
	{
		int numGreater20 = 0;

		for (int index = 0; index < intArray.length; index++)
		{

			if (intArray[index] > 20)
			{
				numGreater20++;
			}

		}

		double percentageGreater20 = (double) numGreater20 / intArray.length;

		return percentageGreater20;

	}

	/**
	 * Method to find the smallest value in an array. Reads through the array
	 * comparing the incrementing index to the first index. if the value is
	 * smaller it replaces that smallest variable and it continues to read to
	 * find a smaller until the array has been finished read to the end. returns
	 * the smallest values.
	 * 
	 * @param intArray
	 * @return
	 */
	public int findSmallestInt(int[] intArray)
	{
		int smallest = intArray[0];

		for (int index = 0; index < intArray.length; index++)
		{
			if (intArray[index] < smallest)
			{
				smallest = intArray[index];
			}

		}

		return smallest;
	}

	/**
	 * this method reads through the array comparing the next value to the value
	 * of the index held in the largest variable. if a larget number is read
	 * then it is stored in the largest variable. returns the largest value.
	 * 
	 * @param intArray
	 * @return
	 */
	public int findLargestInt(int[] intArray)
	{
		int largest = intArray[0];

		for (int index = 0; index < intArray.length; index++)
		{
			if (intArray[index] > largest)
			{
				largest = intArray[index];
			}
		}

		return largest;
	}

	/**
	 * method uses the find smallest and find largest methods to find smallest
	 * and largest value This method returns the difference between these two
	 * values.
	 * 
	 * @param intArray
	 * @return
	 */
	public int findDifferenceLargestSmallest(int[] intArray)
	{
		int largest = findLargestInt(intArray);
		int smallest = findSmallestInt(intArray);
		int difference = largest - smallest;

		return difference;

	}

	/**
	 * Method that reads the array in reverse order and prints to the screen as
	 * read if index is greater than 0
	 * 
	 * @param intArray
	 */
	public void printReverseOrder(int[] intArray)
	{

		for (int index = 9; index < intArray.length; index--)

			if (index >= 0)
			{
				{
					System.out.println("IntArray[" + index + "] = " + intArray[index]);
				}
			}
		// System.out.println("IntArray[" + 0 + "] = " + intArray[0]);
	}

	/**
	 * Method that reads through each index of the array and adds 4 to that
	 * value that it holds
	 * 
	 * @param intArray
	 */
	public void increaseValues(int[] intArray)
	{
		for (int index = 0; index < intArray.length; index++)
		{
			intArray[index] = intArray[index] + 4;

		}

	}

}
