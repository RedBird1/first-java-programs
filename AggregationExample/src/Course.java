/* 
 *File name: Course.java
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
public class Course
{
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	/**
	 * @param courseName
	 * @param instructor
	 * @param textbook
	 */
	public Course(String courseName, Instructor instructor, Textbook textbook)
	{

		this.courseName = courseName;
		this.instructor = instructor;
		this.textbook = textbook;
	}
	
	/**
	 * @return the courseName
	 */
	public String getCourseName()
	{
		return courseName;
	}
	/**
	 * @return the instructor
	 */
	public Instructor getInstructor()
	{
		return instructor;
	}
	/**
	 * @return the textbook
	 */
	public Textbook getTextbook()
	{
		return textbook;
	}
	
	public void updateInstructor(Instructor newInstructor)
	{
		this.instructor = newInstructor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Course\n\t Course name: "+ courseName + "\n"+
				instructor + "\n"+ textbook;
				
	}
	
	
	
	
	
	
}
