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

public class BankRecordsTest {

	public static void main(String[] args) {
		// Create an object of BankRecords class
		BankRecords br = new BankRecords();
		// Call readData() 
		br.readData();

	} // End main()

}
