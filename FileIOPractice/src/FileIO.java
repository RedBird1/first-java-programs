import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Zach
 *
 */
public class FileIO {

	public static void main(String[] args) {
		String inputFileName = "inFile.txt";
		String outputFileName = "outFile.txt";

		File inFile = new File(inputFileName);
		File outFile = new File(outputFileName);

		Scanner input = null;
		PrintWriter output = null;
		FileOutputStream outstream = null;

		// Array to receive the input.
		String[] inputArray = new String[50];

		try {
			input = new Scanner(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
		int itemCount = 0;
		int i = 0;
		while (input.hasNextLine()) {

			String line = input.nextLine();
			inputArray[i] = line;

			itemCount++;
			i++;
		}

		input.close();
		try {
			outstream = new FileOutputStream(outFile, true);
			output = new PrintWriter(outstream);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (int j = 0; j < itemCount; j++) {
			output.println(inputArray[j]);
		}

		output.close();
	}

}
