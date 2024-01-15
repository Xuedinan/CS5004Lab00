package TestFileLab0;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import lab00ExampleImport.Person;


/**
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab0
 * Date: 01/10/2024
 * 
 * A JUnit test class for the Person class.
 * Test if we could get all information of the person.
 * Person should have first name, last name, year of birth
 */

/**
 * create Person with first name John, last name Doe, year of birth 1989
 *
 */  

public class PersonTest {

    Person john = new Person("John", "Doe", 1989);
 

/**
 * test if we could get john's first name
 *
 */ 
 
  @Test
  public void testFirst() {
	  String expected = john.getFirstName();
    assertEquals("John", expected);

  }

/**
 * test if we could get john's last name
 *
 */

  @Test
  public void testLast() {
	  String expected = john.getLastName();
    assertEquals("Doe", expected);
  }

/**
 * test if we could get john's birth of year
 *
 */

  @Test
  public void testYearOfBirth() {
	  int expected = john.getYearOfBirth();
    assertEquals(1989, expected);
  }

}
