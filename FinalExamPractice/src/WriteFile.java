import java.io.File;
import java.io.PrintWriter;


public class WriteFile {

	public static void main(String[] args) {
		String fileName = "numbers.txt";
		File outputFile = new File(fileName);
		PrintWriter pw = null;
		
		try {
			
			pw = new PrintWriter(outputFile);
			
		}
		catch (Exception e)
		{
			System.out.println("Error "+e.getMessage());
		}

		int i = 0;
		while (i<20)
		{
			pw.println(i);
			i++;
		}
		
		pw.close();
	}

}
