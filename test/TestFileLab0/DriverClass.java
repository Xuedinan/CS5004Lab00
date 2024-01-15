package TestFileLab0;


/**
 * 	Name: Xuedinan Gao
 *  Date: 1/15/2024
 * 
 *  This is Driver class for all testing case of Book and Person
 * 
 */

public class DriverClass {

/**@param args The command line arguments.
 * 
 * Calling all testing method from test classes and check if there is any error message pop up
 * 
 */	

	public static void main(String[] args) {

		BookTest bt = new BookTest(); //create test objective
		
		bt.testBookTitle(); // test book title
		bt.testBookAuthor(); // test book author
		bt.testBookPrice(); // test book price
		
		PersonTest pt = new PersonTest(); //create test objective
		
		pt.testFirst(); // test person first name
		pt.testLast(); // test person last name
		pt.testYearOfBirth(); // test person year of birth
		
		System.out.println("Completed all testing case for Class Person and Book. \n"); // inform user test completed

	}

}

