/* 
 *File name: CourseApp.java
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
public class CourseApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Instructor instructor = new Instructor("anna", "Smith", null, "OU 213E", "2176712007");
		Textbook book = new Textbook("Java", "Pearson","Savitch", "10-12345");
		Course myclass = new Course("IT 168", instructor, book);

		
		System.out.println(book);
		System.out.println(myclass);
		
	}

}
