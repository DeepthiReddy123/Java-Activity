import java.util.Scanner;
public class names {
	public static void main(String[] args) {
		
       System.out.println("Enter first name");
		Scanner f = new Scanner(System.in);
        String firstname = f.nextLine();
        System.out.println("Enter last name");
        Scanner l = new Scanner(System.in);
        String lastname = l.nextLine();

	   
	    String firstLetter = firstname.substring(0, 1);
	    String remainingLetters = firstname.substring(1, firstname.length());

	  
	    firstLetter = firstLetter.toUpperCase();

	    firstname = firstLetter + remainingLetters;
	    
	    String lastname1 = lastname.toUpperCase();
	    System.out.println( firstname);
	    System.out.println(lastname1);

	  }
	

}
