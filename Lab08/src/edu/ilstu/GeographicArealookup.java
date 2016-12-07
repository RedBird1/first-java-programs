/* 
 *File name: GeographicArealookup.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 8, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 *This class is used to determin the geographical area depending on the first
 *number in the zip code
 *
 * @author Zachary Schleder
 *
 */
public class GeographicArealookup
{
	
	public void GeographicArealookup()
	{
		
	}
	/**
	 * this is a switch that receives the zip substring(0,1)
	 * then determines the area depending on the first number in the zip code
	 * @param zip
	 * @return area
	 */
	public String determineAreaByZip(String zip)
	{
		String area=null;
		switch(zip)
		{
			
			case ("0"):
				area="East Cost";
				break;
			case ("1"):
				area="East Cost";;
				break;
			case ("2"):
				area="East Cost";;
				break;
			case ("3"):
				area="East Cost";
				break;
			case ("4"):
				area="Central Plains";
				break;
			case ("6"):
				area="Central Plains";
				break;
			case ("7"):
				area="South";
				break;
			case ("8"):
				area="West";
				break;
			case ("9"):
				area="West";
				break;
		
			default:
				area="invalid zip";
		}
		
			return area; 
	}

}
