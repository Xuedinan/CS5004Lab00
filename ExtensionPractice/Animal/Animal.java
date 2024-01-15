package Animal;

/**
 * Edited by: Xuedinan Gao
 * Assignment: CS5004 Lab0
 * Date: 01/13/2024
 * 
 * This class represents a Animal. A Animal has a name, an age and a skin color.
 */

public class Animal{
	private String name;
	private int age;
	private String skinColor;

  /**
   * Construct a Animal object that has the provided name, age and  skin color.
   *
   * @param name  the name to be given to this animal
   * @param age the age to be given to this animal
   * @param skinColor the skinColor to be given to this animal
   */


	public Animal(String name, int age, String skinColor) {
		this.name = name;
		this.age = age;
		this.skinColor = skinColor;
	}		
	
  /**
   * Return the name of this animal.
   *
   * @return the name of this animal
   */

	public String getName() {
		return name;
	}
	
	
  /**
   * Return the age of this animal.
   *
   * @return the age of this animal
   */
	
	public int getAge() {
		return age;
	}

  /**
   * Return the skin color of this animal.
   *
   * @return the skin color of this animal
   */
	
	public String getSkinColor() {
		return skinColor;
	}

	
}