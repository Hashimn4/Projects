/*Hashim Nadeem
 * 11/4/2019
 * Program will print an array of assigned values and then print another array with 2 added to each 
 * element
 */
package fall2019;

public class Grades {

	public static void main(String[] args) {
		final int SIZE = 5;
		int[] myGrades = new int[SIZE];
		myGrades[0] = 53;
		myGrades[1] = 81;
		myGrades[2] = 89;
		myGrades[3] = 92;
		myGrades[4] = 100;
		
		for(int i = 0; i < SIZE; i++) {
			System.out.println(i + " is " + myGrades[i]);
		}
		
		for(int i = 0; i < SIZE; i++) {
			myGrades[i] += 2;
		}
		
		for(int i = 0; i < SIZE; i++) {
			System.out.println(i + " is " + myGrades[i]);
		}
		
	}

}
