
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */

import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab1b {
    
	/**stores the data retrived from the file */
    Vector <Double> douVector; 
    /** variable used to compute the run-time */
    long startTime, endTime, totalTime;
    /** Constructor: computes the running time and call readFile
     * method
     * @return 
     * @throws FileNotFoundException 
     */
    public void lab() throws FileNotFoundException {
	startTime = System.currentTimeMillis();
	readFile("Lab1b.dat");
	endTime = System.currentTimeMillis();    
	totalTime = endTime - startTime;
	System.out.println("total time taken: " + totalTime + " milliseconds");
    }
    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
     * @throws FileNotFoundException 
    */
    public Lab1b(String filename) throws FileNotFoundException {
	readFile(filename);
    }
    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     * @throws FileNotFoundException 
     */
    public void readFile(String filename) throws FileNotFoundException {
    	File inputFile = new File(filename);
	    Scanner input = new Scanner(inputFile);
	    douVector = new Vector<Double>();
	    int max,count=0;
	    double elt = 0.0;
    } //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument
     * @throws FileNotFoundException */
    public static void main(String args[]) throws FileNotFoundException {
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	    new Lab1b(args[0]);
    } //end main
    
} //end class Lab1b
