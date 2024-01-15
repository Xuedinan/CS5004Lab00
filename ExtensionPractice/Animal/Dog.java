package Animal;

/**
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab0
 * Date: 01/13/2024
 * 
 * This class represents a Dog that inherit all attributes from Animal . A Dog has a name, an age and a skin color.
 */

public class Dog extends Animal{

  /**
   * Construct a Animal object that has the provided name, age and  skin color.
   *
   * @param name  the name to be given to this dog
   * @param age the age to be given to this dog
   * @param skinColor the skinColor to be given to this dog
   */

	public Dog(String name, int age, String skinColor) {
		super(name, age, skinColor);
	}
	
}