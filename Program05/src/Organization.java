/* 
 *File name: Organization.java
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
 *This class holds the organizations name and url. 
 *Also an address object is passed that holds information about the org's address. 
 *
 *
 * @author Zachary Schleder
 *
 */
public class Organization
{

	private String organizationName;
	private Address address;
	private String url;
	
	public Organization()
	{
		
	}
	public Organization (String organizationName, Address address, String url)
	{
		this.organizationName=organizationName;
		this.address=address;
		this.url=url;
	}


	/**
	 * @return the organizationName
	 */
	public String getOrganizationName()
	{
		return organizationName;
	}


	/**
	 * @param organizationName the organizationName to set
	 */
	public void setOrganizationName(String organizationName)
	{
		this.organizationName = organizationName;
	}


	/**
	 * @return the address
	 */
	public Address getAddress()
	{
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address)
	{
		this.address = address;
	}


	/**
	 * @return the url
	 */
	public String getUrl()
	{
		return url;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}
	/**
	 * toString that outputs data as a csv
	 */
	public String toString()
	{
		return organizationName+","+address.getStreetAddress()+
				","+address.getCity()+","+address.getState()+","
				+address.getZip()+","+url;
		
	}
	
}
