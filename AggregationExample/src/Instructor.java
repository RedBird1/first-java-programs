/* 
 *File name: Instructor.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 21, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 *<insert clas description here>
 *
 * @author Zachary Schleder
 *
 */
public class Instructor
{

	private String firstname;
	private String middlename;
	private String lastname;
	private String officeName;
	private String officePhone;
	
	public  Instructor()
	{
		
	}

	public Instructor(String firstname, String lastname, String middlename, String officeName,
			String officePhone)
	{
		this.firstname = firstname;
		this.middlename = middlename;
		this.officeName = officeName;
		this.officePhone = officePhone;
	}

	/**
	 * This will return the firstname of the instructor 
	 * @return the firstname
	 */
	public String getFirstname()
	{
		return firstname;
	}

	/**
	 * @return the middlename
	 */
	public String getMiddlename()
	{
		return middlename;
	}

	/**
	 * @return the officeName
	 */
	public String getOfficeName()
	{
		return officeName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Instructor\n\tName:"+firstname+""+
				lastname+ "\n\tOffice Number: "+
				officeName+"\n\tOfficePhone: "+ officePhone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
