import java.util.Scanner;

public class ScannerExamples
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the Perimeter");
		
		int perimeter = keyboard.nextInt();
		
		System.out.println(perimeter);

	}

}
