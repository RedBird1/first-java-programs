/* 
 *File name: Song.java
 *
 *Programmer: Zachary Schleder
 *ULID: zschled
 *
 *Date: Nov 19, 2014
 *
 *Class: IT 168
 *Lecture session: SEC-10
 *Lecture Instructor: Matsuda
 *Lab Section: SEC-12
 *Lab Instructor: Nasiba Al-Rawi
 */
package edu.ilstu;

/**
 * This Song object that holds the title and artist info for each song.
 *
 * @author Zachary Schleder
 *
 */
public class Song
{

	private String title = null;
	private String artist = null;

	/**
	 * constructor for song object.
	 * 
	 * @param title
	 * @param artist
	 */

	public Song(String title, String artist)
	{
		this.title = title;
		this.artist = artist;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist()
	{
		return artist;
	}

	/**
	 * @param artist
	 *            the artist to set
	 */
	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	/**
	 * toString
	 * 
	 * @return title & artist.
	 */
	public String toString()
	{
		return "Song title: " + title + "\nSong artist: " + artist;
	}

}
