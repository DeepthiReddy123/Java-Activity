import java.util.Scanner;
public class S2 {
	public static void main(String[] args) {
		
       System.out.println("Enter first name");
		Scanner f = new Scanner(System.in);
        String firstname = f.nextLine();
        System.out.println("Enter last name");
        Scanner l = new Scanner(System.in);
        String lastname = l.nextLine();
        
        System.out.println("Enter first name");
		Scanner f2 = new Scanner(System.in);
        String p2f = f2.nextLine();
        System.out.println("Enter last name");
        Scanner l2 = new Scanner(System.in);
        String p2l = l2.nextLine();

        
        if(p2l.equals(lastname))
        {
	   
	    
	    System.out.println( "yes");
        }
        else{
	    System.out.println("no");
        }
	
	  }
	

}
