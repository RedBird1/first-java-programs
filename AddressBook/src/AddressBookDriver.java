import java.util.Scanner;

/**
 * @author Zach
 *
 */
public class AddressBookDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		String firstname=null;
		String middlename=null;
		String lastname=null;
		
		String streetAddress= "#8 Cottonwood Lane";
		String town= "Lincoln";
		String stateCode= "IL";
		String zipCode= "61761";
		
		AddressBook contact1= new AddressBook(firstname,middlename,lastname);
		
		System.out.print("Enter your first name: ");
		firstname=keyboard.nextLine();
		System.out.print("Enter your middlename: ");
		middlename=keyboard.nextLine();
		System.out.print("Enter your lastname: ");
		lastname=keyboard.nextLine();
	
		
		contact1.readCustomerInfo(keyboard);
		
		System.out.println(contact1.getfirstName());
		System.out.println(contact1.getlastName());
		System.out.println(contact1.getZipCode());
		
		//contact1.formatMailingLable();
		
	}

}
