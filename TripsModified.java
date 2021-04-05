/*Hashim Nadeem
 *11/09/2019
 *Program reads in the number of miles and price per trip and calculates the cost per trip
 *Program uses partially filled arrays and counts the number of data elements
 */

package fall2019;
import java.util.Scanner;

public class TripsModified {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SIZE = 3;//Size of array - three elements in an array
		double[] miles = new double[SIZE];//Creates an array which stores three numbers of miles 
		double[] pricePerMile = new double[SIZE];//Creates an array which stores three prices per miles
		double[] trips = new double[SIZE];//Create an array which stores three costs of trips
		int h = 0;//Counter initialized to zero
		
		while(h < SIZE) {//Loop runs until the maximum size is reached
			System.out.println("Enter number of miles: ");
			miles[h] = sc.nextDouble();//Reads in number of miles
			System.out.println("Enter price per mile: ");
			pricePerMile[h] = sc.nextDouble();//Reads in the pricer per mile
			trips[h] = miles[h] * pricePerMile[h];//Calculates the cost of the trip
			h++;
			System.out.println("Number of elements: " + h);//Prints how many data elements were read in
			System.out.println("Miles     Price   CostOfTrips");//Prints the headers of the table
			for(int i = 0; i < h; i++) {//Loop runs until the end of the number of elements read in
				//Prints the number of miles, price per mile, and costs of the trips
				//System.out.println(miles[i] + "      " + pricePerMile[i] + "      " + trips[i]);
				System.out.printf("%.2f     $%.2f   $%.2f\n", miles[i], pricePerMile[i], trips[i]);
			}
		}
		sc.close(); //Closes scanner object
	}
}
