//Hashim Nadeem
package fall2019;
import java.util.Scanner;

public class CToFMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in celsius: ");
		double celsius = sc.nextDouble();
		System.out.println("The faranheit value is: " + Faranheit(celsius));
		sc.close();
	}
	public static double Faranheit(double number) {
		return (9/5.0) * number + 32;
	}

}
