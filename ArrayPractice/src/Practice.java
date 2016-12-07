/* 
 *File name: Practice.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 13, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 * <insert clas description here>
 *
 * @author Zachary Schleder
 *
 */
public class Practice
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		int[] numberList = { 12, 34, 6, 33, 25 };

		boolean found = false;
		int i = 0;
		int numtoFind = 6;
		int index = -1;

		while (!found && 1 < numberList.length)
		{

			if (numtoFind == numberList[i])
			{
				index = i;
				found = true;

			}
			i++;
		}
		
		System.out.println(index);
		System.out.println(numtoFind);
	}

}
