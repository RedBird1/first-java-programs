import java.util.Scanner;


public class AddressBook {
	
	//Customer Name info (variables-Instance)
	private String firstName;
	private String middleName;
	private String lastName;
	
	//Contact info variables
	private String streetAddress= null;
	private String town= null;
	private String stateCode= null;
	private String zipCode= null;
	
	private String phoneNumber= null;
	
	public AddressBook()
	{
		
	}
	
	public AddressBook(String firstname, String middlename, String lastname)
	{
		firstName=firstname;
		middleName=middlename;
		lastName=lastname;
	}
	
	public String getZipCode()
	{
		return zipCode;
	}
	
	
	public void setfirstName(String firstname)
	{
		firstName=firstname;
	}
	
	public void setmiddleName(String middlename)
	{
		middleName=middlename;
	}
	
	public void setlastName(String lastname)
	{
		lastName=lastname;
	}

	public String getfirstName()
	{
		return firstName;
	}
	
	public String getmiddleName()
	{
		return middleName;
	}

	public String getlastName()
	{
		return lastName;
	}
	
	public void readCustomerInfo(Scanner keyboard)
	{
		System.out.print("Enter the street address: ");
		streetAddress=keyboard.nextLine();
		System.out.print("Enter the town: ");
		town=keyboard.nextLine();
		System.out.print("Enter the state code: ");
		stateCode=keyboard.nextLine();
		System.out.print("Enter the zip code: ");
		zipCode=keyboard.nextLine();
		System.out.print("Enter you phone number in the form 999999999: ");
		phoneNumber=keyboard.nextLine();
		
	}
	/**
	public void formatMailingLable()
	{
		if (firstName== null)
		{
			System.out.println("Silver Beach Rentals");
			System.out.println("239 E. Hwy 98");
			System.out.println("Destin, FL 32540");
			
		}
		else
		{
			System.out.println("This order will be shipped to:");
			System.out.println("\t"+firstName+" "+middleName+" "+ ""+lastName);
			System.out.println("\t"+streetAddress);
			System.out.println("\t"+town+", "+stateCode+" "+zipCode);
			
		}
	}
	*/
	
	/**
	 * This method formats the phone number. in this form (999)999-9999
	 */
	public void formatPhone()
	{
		System.out.println("("+phoneNumber.substring(0, 3)+")"+phoneNumber.substring(4, 6)+"-"+phoneNumber.substring(7, 9));
	}
	
	
	
}
