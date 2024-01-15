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

/**
 * create a animal with name monkey, age 3 and skin color white
 *
 */

public class AnimalTest {

	Animal monkey = new Animal("Monkey", 3, "white");

/**
 * test if we could get animal name as "monkey"
 *
 */	

	@Test
	public void testName() {
		String expected = monkey.getName();
		assertEquals(expected, "Monkey");
	}

/**
 * test if we could get animal age as 3
 *
 */		

	@Test
	public void testAge() {
		int expected = monkey.getAge();
		assertEquals(expected, 3);
	}

/**
 * test if we could get skin color name as "white"
 *
 */	
	
	@Test
	public void testSkinColor() {
		String expected = monkey.getSkinColor();
		assertEquals(expected, "white");
	}

}
