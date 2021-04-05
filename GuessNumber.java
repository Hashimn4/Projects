/* 9/29/2019
 * Hashim Nadeem
 * CISC 1115
 * Program will come up with a number and will let the user guess that number
 */
package fall2019;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0, max = 100; //Sets the lowest number to 0 and the highest number to 100
		int range = max - min + 1; //The amount of numbers from which a number can be chosen
		int rand = (int)(Math.random()*range) + min; // The program will come up with a number using this
												    // formula
		
		// Tells the user about how the game will be played
		System.out.println("Hello, are you ready to play the Hi-Lo game?\n" + "The program will come up "
						  + "with a number from and you will try to guess that number");
		System.out.print("Enter your guess: "); // Prompts the user to enter a number from 0-100
		int count = 0; // Initializes counter to 0
		int guess = sc.nextInt(); // Reads in the number entered by the user
		count++; // Increments by 1 each time the user guesses
		
		while(guess != rand) { // This while loop will run as long as the entered number(guess) does not
							  // match with the program generated number
			if(guess < rand) { 
				System.out.println("My number is higher than yours."); // Prints this message if user's
																	 // number is lower than the program's
				}
			else {
				System.out.println("My number is lower than yours."); // Prints this if the number is
																	 // higher than the program's
			}
			System.out.print("Please enter another guess: "); // Prompts the user to enter another number
			guess = sc.nextInt(); // Reads the number
			count++; // Increments by 1 after each guess
		}
		if(guess == rand) { // Statement will run if the guess is correct
			// Lets the user know that the guess is correct and also prints the number of guesses
			System.out.println("Your guess is right!" + " It took you " + count + " guesses."); 
		}
		sc.close(); // Closes scanner object

	}

}
