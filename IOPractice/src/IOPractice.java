import java.io.PrintWriter;
import java.io.*;
import java.util.Scanner;
import java.io.File;
public class IOPractice {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number=0;
		int count=0;
		PrintWriter output = null;
		
		try{
			output = new PrintWriter("Numbers.txt");
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
			System.exit(1);
		}
		
		for (int i=0; i<10; i++)
		{
			System.out.print("Enter a whole positive number: ");
			
			number = keyboard.nextInt();
			output.println(number);
		}
		
		
		
		 File infile = new File("InputData.txt");
		 Scanner input = null;
		 
		 try
		 {
			 input = new Scanner(infile);
			 
		 }
		 
		 catch(FileNotFoundException e)
		 {
			 System.out.println("done!");
		 }
		 
		 
		keyboard.close();
		//commits to the file
		output.close();
		
		
		
		
		

	}

}
