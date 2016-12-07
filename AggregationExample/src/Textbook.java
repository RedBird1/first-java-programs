/* 
 *File name: Textbook.java
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
public class Textbook
{
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	
	/**
	 * @param title
	 * @param author
	 * @param publisher
	 * @param isbn
	 */
	public Textbook(String title, String author, String publisher, String isbn)
	{

		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor()
	{
		return author;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher()
	{
		return publisher;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn()
	{
		return isbn;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Textbook\n\tAuthor: "+ author+
				"\n\t ISBN: "+isbn;
	}
	
	
	
	
	
	
	
}
