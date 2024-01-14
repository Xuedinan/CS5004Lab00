package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Animal.Dog;

/** 
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab0
 * Date: 01/13/2024
 * 
 * A JUnit test class for the Dog class.
 * Create objective for Dog
 * test if we could get correct information from Dog class. 
 * Dog should have name, age, skin color.
 * 
 */

public class DogTest {
	Dog dog = new Dog("puppy", 5, "yellow"); //create a animal with name puppy, age 5 and skin color yellow
	
	@Test
	public void testName() {
		String expected = dog.getName(); // test if we could get animal name as "puppy"
		assertEquals(expected, "puppy");
	}

	@Test
	public void testAge() {
		int expected = dog.getAge(); // test if we could get animal age as 5
		assertEquals(expected, 5);
	}

	@Test
	public void testSkinColor() {
		String expected = dog.getSkinColor(); // test if we could get skin color name as "yellow"
		assertEquals(expected, "yellow");
	}

}


