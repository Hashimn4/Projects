/*11/5/2019
 * Hashim Nadeem
 * CISC 1115
 * Program will calculate the total cost of a paint job
 */
package fall2019;
import java.util.Scanner;

public class PaintCompany {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double HOURSPERSQUAREFOOT = 0.07;//Dividing 7 hours by 100 square feet to get 0.07 hours per
											   //one square foot
		final double PRICEOFLABORPERHOUR = 36.00;//Price of labor per hour
		final double STANDARD = 4.99;//Price of standard paint
		final double PREMIUM = 9.99;//Price of premium paint
		final double DELUXE = 14.99;
		welcome("Welcome.");//Calling the welcome method
		int option = paintMenu(sc, STANDARD, PREMIUM, DELUXE);//Assigns user's choice to option
		double sqrft = squareFeet(sc);//Assigns amount of square feet to sqrft
		double gallons = galOfPaint(sqrft);//Assigns the amount of gallons of paint to gallons
		double hoursLabor = hoursOfLabor(sqrft, HOURSPERSQUAREFOOT);//Assigns the amount of hours of labor
																	//to hoursLabor
		
		double pricePerGallon = 0;//Initializes pricePerGallon to zero
		if(option == 1) {
			pricePerGallon = STANDARD;//If the user selects option 1, the price of the standard paint is
								  //assigned to pricePerGallon
		}
		else if(option == 2) {
			pricePerGallon = PREMIUM;//If the user selects option 2, the price of the premium paint is
						         //assigned to pricePerGallon
		}
		else if(option == 3) {
			pricePerGallon = DELUXE;//If the user selects option 3, the price of the deluxe paint is
									//assigned to pricePerGallon
		}
		else {
			System.out.println("Invalid option.");//If the input does not match to 1, 2, or 3, the 
												  //program outputs the statement
		}
		
		double costPaint = costOfPaint(gallons, pricePerGallon);//Assigns the cost of the paint to
																//costPaint
		double costLabor = laborCharges(hoursLabor, PRICEOFLABORPERHOUR);//Assigns the labor cost to 
																		//costLabor
		double costJob = costOfJob(costPaint, costLabor);//Assigns the total cost of the paint job to
														//costJob
		
		System.out.printf("Number of square feet: %.2f square feet\n" +
						   "Number of gallons: %.2f gallons\n" +
						   "Hours of labor: %.2f hours\n" +
						   "Cost of paint: $%.2f\n" +
						   "Cost of labor: $%.2f\n" +
						   "Cost of the paint job: $%.2f\n", sqrft, gallons, hoursLabor, 
						   costPaint, costLabor, costJob);//Prints all of the values to the screen to two
														  //decimal places
	}
	
	public static void welcome(String message) {
		System.out.println(message);//Method for printing a welcome message to the screen
	}
	
	public static int paintMenu(Scanner scanner, final double STANDARD, final double PREMIUM,
								final double DELUXE) {
		System.out.println("We have three types of paint for you to pick from: " + "\n" + 
						   "1: Standard paint: $" + STANDARD + "\n" +
						   "2: Premium paint: $" + PREMIUM + "\n" +
						   "3. Deluxe paint: $" + DELUXE + "\n" +
						   "Enter 1, 2, or 3: ");//Prompts the user to choose between the three types of paint
		while(!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Incorrect option. Try again and enter 1, 2, or 3: ");//This while will keep
																				//running as long as the
																				//input is not an integer
		}
		return scanner.nextInt();//Returns the input
		}

	public static double squareFeet(Scanner scanner) {
		System.out.println("How many square feet is to be painted? ");
		return scanner.nextDouble();//Reads in the amount of square feet from the user
	}
	
	public static double galOfPaint(double sqrft) {
		return sqrft/100;//Calculates how many gallons of paint is needed depending on the square feet
	}
	
	public static double hoursOfLabor(double sqrft, final double HOURSPERSQUAREFOOT) {
		return sqrft * HOURSPERSQUAREFOOT;//Calculates the hours of labor required
	}
	
	public static double costOfPaint(double gallons, double pricePerGallon) {
		return gallons * pricePerGallon;//Calculates the cost of the paint
	}
	
	public static double laborCharges(double hoursLabor, final double PRICEOFLABORPERHOUR) {
		return hoursLabor * PRICEOFLABORPERHOUR;//Calculates the cost of the labor
	}
	
	public static double costOfJob(double costPaint, double costLabor) {
		return costPaint + costLabor;//Calculates the total cost of the paint job by adding the paint cost
								     //and the labor cost
	}
	
	}
