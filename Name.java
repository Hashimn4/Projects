import java.io.*;
import java.util.*;

class a {
	public Name(String last, String first) {
		this.last = last;
		this.first = first;
	}
	public Name(String first) {this("", first);}

	public String getFormal() {return first + " " + last;}
	public String getOfficial() {return last + ", " + first;}

	public boolean equals(Name other) {return first.equals(other.first) && last .equals(other.last);}

	public String toString() {return first + " " + last;}
	
	public String getInitials() {
	    return "initials: " + first.charAt(0) + "." + last.charAt(0) + ".";
	}
    
    public Name(Name n) {
        first = n.first;
        last = n.last;
    }
    
	public static Name read(Scanner scanner) {
		if (!scanner.hasNext()) return null;
		String last = scanner.next();
		String first = scanner.next();
		return new Name(last, first);
	}

	private String first, last;

	public static void main(String [] args) throws Exception {
		Scanner scanner = new Scanner(new File("/users/hashimn4/Desktop/names.txt"));

		int count = 0;

		Name name = read(scanner);
		Name some = null;
		while(name != null) {
		    if(some != null && name.equals(some)) {
		        System.out.println("Duplicate name " + "\"" + name.getFormal() + "\"" + " discovered");
		    }
		    else {
		    	System.out.println("name: " + name.toString());
		    	System.out.println("formal: " + name.getFormal());
		    	System.out.println("official: " + name.getOfficial());
		    	System.out.println(name.getInitials());
		    	System.out.println();
		    }
		    
		    count++;
			some = new Name(name);
            name = read(scanner);
		}
		System.out.println("---");
		System.out.println(count + " names processed.");
	}
}