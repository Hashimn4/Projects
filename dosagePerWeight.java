/* 9/6/2019
 * Hashim Nadeem
 * CISC 1115
 * This program will calculate the dosage of a medication according to the patients' weights
 */

package fall2019;
import java.util.Scanner;

public class dosagePerWeight {

	public static void main(String[] args) {
		
		//Patient 1
		double weightInPounds; 
		System.out.println("Enter Patient 1's weight in pounds: "); //Reading from input patients weight
		Scanner sc = new Scanner(System.in); // creating scanner object
		weightInPounds = sc.nextDouble(); // reading input as a double
		double weightInKilo = weightInPounds/2.2046; //Calculate pounds to kilograms
		double dosage = weightInKilo*50; //Calculate the dosage according to weight
		System.out.println("You entered: " + weightInPounds + "lbs"); //printing weight
		System.out.println("The dosage is: " + dosage + "mg"); // printing dosage
		sc.close(); // closing scanner
		
		//Patient 2
		weightInPounds = 150;
		weightInKilo = weightInPounds/2.2406; //Calculate pounds to kilograms
		dosage = weightInKilo*50; //Calculate the dosage according to weight
		
		System.out.println("Patient 2: ");
		System.out.print("Weight in pounds - " + weightInPounds +"lbs."); //Display weight
		  															     //in pounds(lbs)
		System.out.print(" Weight in Kilo - " + weightInKilo + "kg."); //Display weight in
		           												      //kilograms(kg)
		System.out.println(" Dosage - " + dosage + "mg."); //Display calculated dosage(mg)
		
		//Patient 3
		weightInPounds = 190; 
		weightInKilo = weightInPounds/2.2406; //Calculate pounds to kilograms
		dosage = weightInKilo*50; //Calculate the dosage according to weight
		
		System.out.println("Patient 3:");
		System.out.print("Weight in pounds - " + weightInPounds + "lbs."); //Display weight
		     															  //in pounds(lbs)
		System.out.print(" Weight in Kilo - " + weightInKilo + "kg."); //Display weight in
		      														  //kilograms(kg)
		System.out.println(" Dosage - " + dosage + "mg."); //Display calculated dosage(mg)
		
	}

}
