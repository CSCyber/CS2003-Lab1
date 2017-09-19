
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author Colton Sutton
 * @since 8/30/2017
 * @version 3.1415369
 */

import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;

public class Lab1b {
    
    // data members

    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
    */
    public Lab1b(String filename) {

	readFile(filename);
    }

    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     */
    public void readFile(String filename) {
	// Reads in a file, scans for doubles and adds them to total, then prints out the average
        try {
    	File inputFile = new File(filename);
	    Scanner input = new Scanner(inputFile);
	    double total = 0.0;
	    int count = 0;
	    while (input.hasNextDouble()) {
	    	total += input.nextDouble();
	    	
	    	count++;
	    }
	    
	    System.out.printf("The average of the imported doubles was %.5f", (total/count));
	    
		input.close();
        }
		catch(IOException e){
			
			System.err.println("\nError in file input.");
		}
        
    } //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) {
	    new Lab1b("Lab1b.dat");
    } //end main
    
} //end class Lab1b
