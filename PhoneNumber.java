import java.io.*;
import java.util.*;

public class PhoneNumber {
    private String number;
    public PhoneNumber(String num) {
        this.number = num;
    }
    public String getAreaCode() {
        return number.substring(1,4);
    }
    public String getExchange() {
        return number.substring(5,8);
    }
    public String getLineNumber() {
        return number.substring(9,13);
    }
    public boolean isTollFree() {
        if(number.charAt(1) == '8') {
            return true;
        }
        return false;
    }
    public String toString() {
        return number;
    }
    
    public boolean equals(PhoneNumber other) {
        if(number.equals(other.number)) {
            return true;
        }
        return false;
    }
    public static PhoneNumber read(Scanner sc) {
        if(!sc.hasNextLine()) {
            return null;
        }
        String number = sc.nextLine();
        return new PhoneNumber(number);
    }
    public PhoneNumber(PhoneNumber m) {
        number = m.number;
    }
    
    public static void main(String[] args) throws Exception {
        File f = new File("/users/hashimn4/Desktop/numbers.txt");
        Scanner st = new Scanner(f);
        int count = 0;
        PhoneNumber number = read(st);
        PhoneNumber oldNum = null;
        while(number != null) {
            if(oldNum != null && number.equals(oldNum)) {
                System.out.println("Duplicate phone number " + "\"" + number.toString() + "\"" + " discovered");
            }
            else {
                System.out.println("phone number: " + number.toString());
                System.out.println("area code: " + number.getAreaCode());
                System.out.println("exchange: " + number.getExchange());
                System.out.println("line number: " + number.getLineNumber());
                if(number.isTollFree()) {
                    System.out.println("is toll free: true");
                    System.out.println();
                }
                else {
                    System.out.println("is toll free: false");
                    System.out.println();
                }
            }
            count++;
            oldNum = new PhoneNumber(number);
            number = read(st);
        }
        System.out.println("---");
        System.out.println(count + " phone numbers processed.");
    }
}   