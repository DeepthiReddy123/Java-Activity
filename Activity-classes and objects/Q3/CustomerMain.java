
import java.util.Scanner;

public class CustomerMain {
	public static void main(String args[]) 
	{ 
		Customer obj = new Customer();
		
		
		System.out.println("Enter innings name");
		Scanner f2 = new Scanner(System.in);
	    String name = f2.nextLine();
	    //Scanner f3 = new Scanner(System.in);
	    String address = f2.nextLine();
	    //Scanner f1 = new Scanner(System.in);
	    String mobile = f2.nextLine();
	   
		 obj.setName(name);
		 obj.setAddress(address);
		 obj. setMobile(mobile);
		
		
	  String details= name+","+address+","+mobile;
	  System.out.println(details);
	  String [] w=details.split(",");
	  System.out.print("Name:"+w[0]);
	  System.out.print("Address:"+w[1]);
	  System.out.print("Mobile:"+w[2]);
	}
}