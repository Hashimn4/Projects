package fall2019;
import java.util.Scanner;

public class someNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    final int SIZE = 500;
	    int[] numbers = new int[SIZE]; // declares an array with SIZE ints
	    int counter=0;
	    System.out.println("Enter a #, ^D to exit:");
	    while(sc.hasNextInt()  && counter < SIZE) {
	      System.out.println("Enter a number: ");
	      numbers[counter]=sc.nextInt();
	      counter++;
	      System.out.println("counter= " + counter);
	      for (int i=0; i<counter; i++)
	        System.out.print(numbers[i] + " ");
	    }
	    System.out.println(counter + " numbers were read in."
	                         + " That is the # of elements in the array.");
	    sc.close();
	}

}
