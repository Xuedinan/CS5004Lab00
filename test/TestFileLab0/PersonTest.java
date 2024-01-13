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


public class PersonTest {

  private Person john; //create Person john

  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1989);//create Person with first name John, last name Doe, year of birth 1989
  }

  @Test
  public void testFirst() {
	  String expected = john.getFirstName(); //test if we could get john's first name
    assertEquals("John", expected);

  }

  @Test
  public void testSecond() {
	  String expected = john.getLastName();//test if we could get john's last name
    assertEquals("Doe", expected);
  }

  @Test
  public void testYearOfBirth() {
	  int expected = john.getYearOfBirth();//test if we could get john's birth of year
    assertEquals(1989, expected);
  }

}
