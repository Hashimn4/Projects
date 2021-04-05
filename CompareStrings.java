package fall2019;
import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String s2 = sc.nextLine();
		boolean same = true;
		if(compare(s1, s2)) {
			for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
				} 
				else {
					same = false;
				}
			}
			if(same) {
				System.out.println("They are the same.");
			}
			else System.out.println("They are not the same.");
		}
		else {
			System.out.println("Lengths are not the same.");
		}
		sc.close();
	}
	public static boolean compare(String x, String y) {
		if(x.length() != y.length()) {
			return false;
		}
	return true;

}
}
