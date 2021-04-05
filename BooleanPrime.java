/*Hashim Nadeem
 * Prime number test
 */
package fall2019;
public class BooleanPrime {

	public static void main(String[] args) {
		for(int n = -100; n < 100; n++) {
			if(isPrime(n)) {
				System.out.println(n + " is prime.");
			}
			else System.out.println(n + " is not prime.");
		}
	}
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		boolean prime = true;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				prime = false;
			}
		}
		return prime;
		
	}
}
