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


/**
 * create a animal with name puppy, age 5 and skin color yellow
 *
 */

public class DogTest {
	Dog dog = new Dog("puppy", 5, "yellow");

	/**
	 * test if we could get animal name as "puppy"
	 *
	 */	
	
	@Test
	public void testName() {
		String expected = dog.getName();
		assertEquals(expected, "puppy");
	}

	/**
	 * test if we could get animal age as 5
	 *
	 */		

	@Test
	public void testAge() {
		int expected = dog.getAge();
		assertEquals(expected, 5);
	}

	/**
	 * test if we could get skin color name as "yellow"
	 *
	 */		

	@Test
	public void testSkinColor() {
		String expected = dog.getSkinColor();
		assertEquals(expected, "yellow");
	}

}


