/* 11/19/19
 * Hashim Nadeem
 * CISC 1115
 * Program will read zipcodes and number of voters from a file and perform various tasks such as:
 * displaying the contents of the file into arrays, checking whether a zipcodes belongs to Brooklyn
 * or the Bronx, and calculating the zipcode with the maximum number of voters from both boroughs
 */

package fall2019;
import java.util.Scanner;
import java.io.*;

/**
 * VoterStats.java - will read zipcodes and number of voters from a file and perform various tasks such as:
 * displaying the contents of the file into arrays, checking whether a zipcodes belongs to Brooklyn
 * or the Bronx, and calculating the zipcode with the maximum number of voters from each borough
 * @author hashimn4
 */
public class VoterStats {

	public static void main(String[] args) throws IOException {
		final int TOTALSIZE = 10;
		final int BOROUGHSIZE = 5;
		int [] zipCodes = new int[TOTALSIZE];
		int [] voters = new int[TOTALSIZE];
		printArray(zipCodes, voters);
		int [] brooklynZipcodes = new int[BOROUGHSIZE];
		int [] brooklynVoters = new int[BOROUGHSIZE];
		int [] bronxZipcodes = new int[BOROUGHSIZE];
		int [] bronxVoters = new int[BOROUGHSIZE];
		
		int m = 0, k = 0;
		for(int i = 0; i < TOTALSIZE; i++) {
			if(zipCodes[i] > 11200) { //Add zipcodes above 11200 to the array brooklynZipcodes and the 
									  //corresponding voters to the array brooklynVoters
				brooklynZipcodes[m] = zipCodes[i];
				brooklynVoters[m] = voters[i];
				m++;
			}
			else {//Add the zipcodes under 11200 to the array bronxZipcodes and the corresponding
				  //voters to bronxVoters
				bronxZipcodes[k] = zipCodes[i];
				bronxVoters[k] = voters[i];
				k++;
			}
		}
		
		System.out.println();
		System.out.println("Brooklyn");
		for(int i = 0; i < BOROUGHSIZE; i++) {//Print the brooklyn zipcodes and voters 
			System.out.println(brooklynZipcodes[i] + " " + brooklynVoters[i]);
		}
		System.out.println("Bronx");
		for(int i = 0; i < BOROUGHSIZE; i++) {//Print the bronx zipcodes and voters
			System.out.println(bronxZipcodes[i] + " " + bronxVoters[i]);
		}
		
		System.out.println();
		for(int i = 0; i < BOROUGHSIZE; i++) {
			if(isBrooklyn(brooklynZipcodes)) {//Print the zipcodes if they belong to brooklyn
				System.out.println(brooklynZipcodes[i] + " is in Brooklyn");
			}
		}
		for(int i = 0; i < BOROUGHSIZE; i++) {
			if(isBronx(bronxZipcodes)) {//Print the zipcodes if they belong to the bronx
				System.out.println(bronxZipcodes[i] + " is in Bronx");
			}
		}
		
		int brooklynMaxIndex = maxArray(brooklynZipcodes, brooklynVoters);
		int brooklynMaxZipcode = brooklynZipcodes[brooklynMaxIndex];
		int bronxMaxIndex = maxArray(bronxZipcodes, bronxVoters);
		int bronxMaxZipcode = bronxZipcodes[bronxMaxIndex];
		
		System.out.println();
		System.out.println("The index of the max in Brooklyn is: " + brooklynMaxIndex);
		System.out.println("The zipcode with the most voters in Brooklyn is: " 
							+ brooklynMaxZipcode);
		
		System.out.println();
		System.out.println("The index of the max in the Bronx is: " + bronxMaxIndex);
		System.out.println("The zipcode with the most voters in Brooklyn is: "
						   + bronxMaxZipcode);
	}
	
	/**
	 * Reads zipcodes and number of voters from a file and stores them in arrays
	 * @param x An array reference variable
	 * @param y An array reference variable
	 * @throws IOException
	 */
	public static void printArray(int [] x, int [] y) throws IOException {
		File f = new File("/users/hashimn4/documents/VoterStats.txt");
		Scanner sc = new Scanner(f);
		for(int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			System.out.println(x[i] + " " + y[i]);
		}
		sc.close();
	}
	
	/**
	 * Check for zipcodes above 11200
	 * @param x An array reference variable
	 * @return A boolean value
	 */
	public static boolean isBrooklyn(int[] x) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] > 11200) {
				return true;
			}
			
		}
		return false;
	}
	
	/**
	 * Check for zipcodes under 11200
	 * @param x An array reference variable
	 * @return A boolean value
	 */
	public static boolean isBronx(int[] x) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] < 11200) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Search for greatest number of voters
	 * @param t An array reference variable
	 * @param u An array reference variable
	 * @return An integer data type
	 */
	public static int maxArray(int[] t, int[] u) {
		int maxIndex = 0;
		int max = u[0];
		for(int i = 1; i < t.length; i++) {
			if(u[i] > max) {
				max = u[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
	

	

