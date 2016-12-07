
/* 
 *File name: GasMeter.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Oct 22, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */

/**
 *
 *
 * @author Zachary Schleder
 *
 */
public class GasMeter
{
	private String accountNumber;
	private String streetAddress;
	private String city;
	private double therms;
	
	/**
	 * @param accountNumber
	 * @param streetAddress
	 * @param city
	 * @param therms
	 */
	public GasMeter(String accountNumber, String streetAddress, String city,
			double therms)
	{
		this.accountNumber = accountNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.therms = therms;
	}
	

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress()
	{
		return streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @return the therms
	 */
	public Double getTherms()
	{
		return therms;
	}
	/**
	 * calculates cost therms*rate 
	 * @param day
	 * @return
	 */
	public double calculateCost(int day)
	{
		return therms*dertermineRate(day);
	}
	/**
	 * determines the rate depending on the day of the month.
	 * @param day
	 * @return
	 */
	private double dertermineRate(int day)
	{
		double rate=0;
		//early
		if (day<=31 && day>=27)
		{
			rate=.04;
			
		}
		//on time
		else if(day<27 && day>=9)
		{
			
			rate=.05;
		}
		//late
		else if (day>=1 && day<9)
		{
			
			rate=.06;
		}
			
		return rate;
	}
	
	
	
}
