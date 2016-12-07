import java.io.File;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author Zach
 *
 */

public class CreateSessionFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "SessionCount.txt";
		File sessionCount = new File(fileName);
		PrintWriter pw = null;
		
		
		try{
			pw = new PrintWriter(sessionCount);
		}
		catch(Exception e ){
			System.out.println("Error: "+e.getMessage());
		}
		
		int i=0;
		
		while(i<=4000)
		{
			pw.println("12/04/14"+" Friday"+" 10"+" 432");
			i++;
		}
		
		pw.close();
		
		
		
		
		
	}

}
