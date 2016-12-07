import java.io.File;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Zach
 *
 */
public class FileIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String FileName = "numbers.txt";
		File inputFile = new File(FileName);
		Scanner input=null;
		try {			
			input = new Scanner(inputFile);
		}
		catch (Exception e)
		{
			System.out.print("Error "+e.getMessage());
		}
		
		
		int[] numberArray=;
		int i=0;
		while (input.hasNextLine())
		{
			int number = input.nextInt();
			
		
			numberArray[i]=number;
		
			
		}
		
		for (int j = 0; j<= numberArray.length;i++)
		{
			System.out.println(numberArray[i]);
		}

	}

}
