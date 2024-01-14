package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Animal.Animal;

/** 
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab0
 * Date: 01/13/2024
 * 
 * A JUnit test class for the Animal class.
 * Create objective for Animal
 * test if we could get correct information from Animal class. 
 * Animal should have name, age, skin color.
 * 
 */

public class AnimalTest {

	Animal dog = new Animal("dog", 3, "white"); //create a animal with name dog, age 3 and skin color white
	
	@Test
	public void testName() {
		String expected = dog.getName(); // test if we could get animal name as "dog"
		assertEquals(expected, "dog");
	}

	@Test
	public void testAge() {
		int expected = dog.getAge(); // test if we could get animal age as 3
		assertEquals(expected, 3);
	}

	@Test
	public void testSkinColor() {
		String expected = dog.getSkinColor(); // test if we could get skin color name as "white"
		assertEquals(expected, "white");
	}

}
