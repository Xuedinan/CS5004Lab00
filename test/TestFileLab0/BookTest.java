package TestFileLab0;

import static org.junit.Assert.*;

import org.junit.Test;

import lab00ExampleImport.Book;
import lab00ExampleImport.Person;

/** 
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab0
 * Date: 01/10/2024
 * 
 * A JUnit test class for the Book class.
 * Create objective for book and person
 * test if we could get correct information from Book class. 
 * Book should have title, author, price.
 * 
 */


public class BookTest {
	Person bkAuthor = new Person("Dave", "West", 35); // create a person who's one of the author for the book bk
	Book bk = new Book("Head First Object-Oriented Analysis and Design", // create book object with book title, price and author bt
						bkAuthor, (float) 25.5);

/**
 * test if we could get book title
 *
 */ 	

	@Test
	public void testBookTitle() {
		String expected = bk.getTitle();
		assertEquals(expected, "Head First Object-Oriented Analysis and Design");
	}

/**
 * test if we could get author's first name
 *
 */	

	@Test
	public void testBookAuthor() { 
		String expected = bkAuthor.getFirstName();
		assertEquals(expected, "Dave");
	}

/**
 * test price with floating point number
 *
 */
	
	@Test
	public void testBookPrice() {
		float expected = bk.getPrice();
		assertEquals(expected, 25.5, 0.000001); 
	}
	
}
