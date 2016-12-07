import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/* 
 *File name: FileDriver.java

 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 9, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 *
 * @author Zachary Schleder, Driver used to read data from file and sort
 *         according to URL. Creates address object that is passed to the
 *         organization class. Prints data to a file related to the specific
 *         url. Creates CSV file in an excel report. One for each Url exception.
 *
 */
public class FileDriver
{

	/**
	 * @param args
	 */

	public static void main(String[] args)
	{
		// gets the file name from the user.
		System.out.print("Please enter the name of the file: ");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.next();

		// declares input steam to the file
		Scanner inputStream = null;

		// declares the address and organization objects.
		Address address1 = new Address();
		Organization organization1 = new Organization();

		// Initializes input steam to the file.
		try
		{
			inputStream = new Scanner(new File(fileName));
		}

		catch (FileNotFoundException e)
		{
			System.out.println("Error in opening file " + fileName);
			System.exit(0);
		}

		// Loop to read file as long as there is another line.
		while (inputStream.hasNext())
		{

			{
				// reads file for desired data.
				String organization = inputStream.nextLine();
				String streetAddress = inputStream.nextLine();
				String city = inputStream.next();
				String state = inputStream.next();
				String zip = inputStream.nextLine();
				String url = inputStream.nextLine();
				String urlID = url.substring(url.length() - 3, url.length());

				// uses the data read to initialize the adress and organization
				// objects.
				address1 = new Address(streetAddress, city, state, zip);
				organization1 = new Organization(organization, address1, url);

				// Sort organization data by URL.
				// Writes to the zjs_com_List.csv file.
				if (urlID.equals("com"))
				{
					// creates new File and writes toString to it
					try (PrintWriter out = new PrintWriter(new BufferedWriter(
							new FileWriter("zjs_com_List.csv", true))))
					{
						out.println(organization1.toString());
					}
					catch (IOException e)
					{
						System.out.println("Error: " + e.getMessage());
						System.exit(1);
					}

				}
				// Creates & Writes to the the zjs_edu_List.csv file.
				else if (urlID.equals("edu"))
				{
					// creates new File and writes toString to it
					try (PrintWriter printW = new PrintWriter(
							new BufferedWriter(new FileWriter(
									"zjs_edu_List.csv", true))))
					{
						printW.println(organization1.toString());
					}
					catch (IOException e)
					{
						System.out.println("Error: " + e.getMessage());
						System.exit(1);
					}
				}
				// Creates & Writes to the zjs_org_List.csv file.
				else if (urlID.equals("org"))
				{
					// creates new File and writes toString to it
					try (PrintWriter printW = new PrintWriter(
							new BufferedWriter(new FileWriter(
									"zjs_org_List.csv", true))))
					{
						printW.println(organization1.toString());
					}
					catch (IOException e)
					{
						System.out.println("Error: " + e.getMessage());
						System.exit(1);
					}
				}
				// Creates & Writes to the zjs_rejects_List.csv file.
				else
				{
					// creates new File and writes toString to it
					try (PrintWriter printW = new PrintWriter(
							new BufferedWriter(new FileWriter(
									"zjs_rejects_List.csv", true))))
					{
						printW.println(organization1.toString());
					}
					catch (IOException e)
					{
						System.out.println("Error: " + e.getMessage());
						System.exit(1);

					}

				}

			}

		}

		inputStream.close();
		keyboard.close();
	}

}
