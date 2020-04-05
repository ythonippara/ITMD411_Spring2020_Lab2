/**
 * This program reads data from a .csv file,
 * stores records in ArrayList and prints out
 * a report in a tabular form. The report includes
 * 25 rows of data for the following columns:
 * ID, AGE, SEX, REGION, INCOME, MORTGAGE.
 * 
 * @author Yulia Thonippara (A20411313)
 * Created for ITMD 411 Spring 2020
 */

public abstract class Client {
	
	public abstract void readData(); // Read file detail
	
	public abstract void processData(); // Process file detail
	
	public abstract void printData(); // Print file detail

} // End class Client
