/* 
 *File name: Address.java
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
 *Address object that holds the organization information for
 *street address
 *city
 *state
 *zip
 *
 * @author Zachary Schleder
 *
 */
public class Address
{

	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	
	/**
	 * Default constructor 
	 */
	public Address()
	{
		
	}
	/**
	 * Address Constructor
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Address(String streetAddress, String city, String state, String zip)
	{
		this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress()
	{
		return streetAddress;
	}

	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip()
	{
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	
	
	
}
