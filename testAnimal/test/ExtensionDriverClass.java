package test;

/**
 * 	Name: Xuedinan Gao
 *  Date: 1/15/2024
 * 
 *  This is Driver class for all testing case of Animal and Dog
 * 
 */


public class ExtensionDriverClass {

/**@param args The command line arguments.
 * 
 * Calling all testing method from test classes and check if there is any error message pop up
 * 
 */
	
	public static void main(String[] args) {
		
		AnimalTest al = new AnimalTest(); //create test objective
		
		al.testName(); // test animal name
		al.testAge(); // test animal age
		al.testSkinColor(); // test animal skin color
		
		DogTest dt = new DogTest(); //create test objective
		
		dt.testName(); // test dog name
		dt.testAge(); // test dog age
		dt.testSkinColor(); // test dog skin color
		
		System.out.println("Completed all testing case for Class Animal and Dog \n"); // inform user test completed

	}

}
