import java.util.*;
import java.io.*;

/**
 * A program which reads from a file consisting of first and last names and their phone numbers.
 * Counts and displays how many entries were processed.
 * Compares entries and displays messages depending on whether only the names are equal or if both
 * the names and their phone numbers are equal
 * @author Hashim Nadeem
 */
public class PhonebookEntry {
	
	/**
	 * Reads the names and phone numbers from the file.
	 * Counts how many entries were processed and prints how many were processed.
	 * Compares entries to see whether they are equal or not
	 * Prints the entries to the screen
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		File f = new File("phonebook.text");
		Scanner st = new Scanner(f);
		int count = 0;
		PhonebookEntry entry = read(st);
		PhonebookEntry old = null;
		while(entry!=null) {
			if(old != null && entry.equals(old)) {
			}
			else {
				System.out.println("phone book entry: " + entry.toString());
				entry.call();
				System.out.println();
			}
			count++;
			old = new PhonebookEntry(entry.getName(), entry.getPhoneNumber());
			entry = read(st);
		}
		System.out.println("---");
		System.out.println(count + " phonebook entries processed.");
	}
	
	private Name name;
	private PhoneNumber phoneNumber;
	
	/**
	 * Constructor which takes two arguments, a reference to a Name object and a reference to a PhoneNumber object, and assigns the references to their copies of the objects to name and 
	 * phoneNumber respectively
	 * @param label A reference to a Name object
	 * @param number A reference to a PhoneNumber object
	 */
	public PhonebookEntry(Name label, PhoneNumber number) {
		name = new Name(label);
		phoneNumber = new PhoneNumber(number);
	}
	
	/**
	 * A method of type Name which returns a reference to the copy of name
	 * @return a reference to the copy of the name variable
	 */
	public Name getName() {
		return new Name(name);
	}
	
	/**
	 * A method of type PhoneNumber that returns a reference to the copy of phoneNumber
	 * @return a reference to the copy of the phoneNumber variable
	 */
	public PhoneNumber getPhoneNumber() {
		return new PhoneNumber(phoneNumber);
	}
	
	/**
	 * A method which uses the isTollFree method of the PhoneNumber class on the phoneNumber variable to determine whether the number is toll-free or not. It then prints the phone book
	 * entry being called with the toll-free message if it is a toll-free number
	 */
	public void call() {
		if(phoneNumber.isTollFree()) {
			System.out.println("Dialing " + "(toll-free) " + getName() + ": " + getPhoneNumber());
		}
		else {
			System.out.println("Dialing " + getName() + ": " + getPhoneNumber());
		}
	}
	
	/**
	 * A method that takes another PhonebookEntry object and compares it with another PhonebookEntry object. If the names are equal and the phone numbers are not, 
	 * the warning duplicate name message is printed. If names are equal and also the phone numbers, then the duplicate phone book entry message is displayed
	 * @param other A reference to a PhonebookEntry object
	 * @return false if the names are equal but not the phone numbers. Returns true if both the names and phone numbers are equal.
	 */
	public boolean equals(PhonebookEntry other) {
		if(name.equals(other.name) && !phoneNumber.equals(other.phoneNumber)) {
			System.out.println("Warning duplicate name encountered " + "\"" + name + ": " + phoneNumber + "\"" + " discovered");
			return false;
		}
		if(phoneNumber.equals(other.phoneNumber) && name.equals(other.name)) {
			System.out.println("Duplicate phone book entry: " + "\"" + name + ": " + phoneNumber + "\"" + " discovered");
			return true;
		}
		return false;
	}
	
	/**
	 * A method that returns the first and last names along with the corresponding phone numbers
	 */
	public String toString() {
		return getName() + ": " + getPhoneNumber();
	}
	
	/**
	 * This method takes a reference to a scanner object and reads the first, last names and their 
	 * phone numbers. 
	 * @param sc the scanner object which has access to the file to read from
	 * @return a PhonebookEntry object read from the file
	 */
	public static PhonebookEntry read(Scanner sc) {
		if(!sc.hasNext()) {
			return null;
		}
		String last = sc.next();
		String first = sc.next();
		String phoneNumber = sc.next();
		Name name = new Name(last, first);
		PhoneNumber phoneNum = new PhoneNumber(phoneNumber);
		return new PhonebookEntry(name,phoneNum);
	}
}
